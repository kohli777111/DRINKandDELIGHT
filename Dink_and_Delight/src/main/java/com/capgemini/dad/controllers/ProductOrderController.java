package com.capgemini.dad.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.dad.dto.ProductOrderDetails;
import com.capgemini.dad.entity.ProductOrder;
import com.capgemini.dad.services.IProductOrderService;
import com.capgemini.dad.util.ProductOrderUtil;

@RequestMapping("/product")
@RestController
public class ProductOrderController {
	
	@Autowired
	private IProductOrderService productOrderService;
	
	
	@PostMapping("/add")
	public ResponseEntity<ProductOrderDetails> add(@RequestBody ProductOrderDetails productOrderDetails)
	{
		ProductOrder productOrder=new ProductOrder();
		productOrder.setOrderId(productOrderDetails.getOrderId());
		productOrder.setName(productOrderDetails.getName());
		productOrder.setDistributorId(productOrderDetails.getDistributorId());
		productOrder.setQuantityValue(productOrderDetails.getQuantityValue());
		productOrder.setDateOfOrder(productOrderDetails.getDateOfOrder());
		productOrder.setDateOfDelivery(productOrderDetails.getDateOfDelivery());
		productOrder.setPricePerUnit(productOrderDetails.getPricePerUnit());
		productOrder.setTotalPrice(productOrderDetails.getTotalPrice());
		productOrder.setWarehouseId(productOrderDetails.getWarehouseId());
		productOrder.setDeliveryStatus(productOrderDetails.getDeliveryStatus());
		productOrder.setQuantityUnit(productOrderDetails.getQuantityUnit());
		
		
		productOrder=productOrderService.save(productOrder);
		ProductOrderDetails pod=ProductOrderUtil.convertToProductDetails(productOrder);
		ResponseEntity<ProductOrderDetails> responseEntity=new  ResponseEntity<>(pod, HttpStatus.OK);
		return responseEntity;
		
		
	}
	
	
	@PutMapping("/{orderId}/changeStatus")
	public ResponseEntity<String> updateDeliveryStatus(@RequestBody Map<Long,String> request ,@PathVariable("orderId") Long orderId)
	{
		System.out.println(orderId);
		ProductOrder productOrder=productOrderService.findById(orderId);
		String status=request.get("deliveryStatus");
		productOrder.setDeliveryStatus(status);
		String msg=productOrderService.updateStatus(productOrder);
		ResponseEntity<String> responseEntity=new ResponseEntity<String>(msg,HttpStatus.OK);
		return responseEntity;
		
	}
	

}
