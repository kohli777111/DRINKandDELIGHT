package com.capgemini.dad.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.dad.dto.DistributorDetails;
import com.capgemini.dad.dto.SupplierDetails;
import com.capgemini.dad.entity.Distributor;
import com.capgemini.dad.entity.Supplier;
import com.capgemini.dad.services.IDisplayService;
import com.capgemini.dad.util.DisplayUtil;

@RequestMapping("/display")
@RestController
@Validated
public class DisplayRestController {
	
	 private static final Logger Log = LoggerFactory.getLogger(DisplayRestController.class);
	 
	 @Autowired
	 private IDisplayService displayService;
	 
    /**
     * fetch Supplier object by supplier id
     *
     * @param supplierId
     * @return Supplier object and response to server
     */
     @GetMapping("/{supplierId}/showsupplierdetails")
     public ResponseEntity<SupplierDetails> showSupplierDetailsById(
             @PathVariable("supplierId") String supplierId) {
    	 Long longSupplierId=Long.getLong(supplierId);
         Supplier supplier = displayService.displaySupplierById(longSupplierId);
         SupplierDetails supplierDetails = DisplayUtil.convertToSupplierDetails(supplier);
         ResponseEntity<SupplierDetails> response = new ResponseEntity<>(supplierDetails, HttpStatus.OK);
         return response;
     }
     
     /**
      * fetch Distributor object by distributor id
      *
      * @param distributorId
      * @return Distributor object and response to server
      */
      @GetMapping("/{distributorId}/showdistributordetails")
      public ResponseEntity<DistributorDetails> showDistributorDetailsById(
              @PathVariable("distributorId") String distributorId) {
     	  Long longDistributedId=Long.getLong(distributorId);
          Distributor distributor = displayService.displayDistributorById(longDistributedId);
          DistributorDetails distributorDetails = DisplayUtil.convertToDistributorDetails(distributor);
          ResponseEntity<DistributorDetails> response = new ResponseEntity<>(distributorDetails, HttpStatus.OK);
          return response;
      }


}
