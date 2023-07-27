package com.example.ECommerceMicroservice.BillingService.external.services;

import com.example.ECommerceMicroservice.BillingService.BillingModel.ProductsDetails;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "PRODUCT-SERVICE")
public interface ProductService {


    //http://localhost:9090/products/findProductById/1
    @GetMapping("products/findProductById/{userId}")
    ProductsDetails getProductDetails(@PathVariable int userId);



}
