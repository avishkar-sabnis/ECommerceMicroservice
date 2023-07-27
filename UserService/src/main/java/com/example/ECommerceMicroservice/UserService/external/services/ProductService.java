package com.example.ECommerceMicroservice.UserService.external.services;

import com.example.ECommerceMicroservice.UserService.UserModel.ProductsDetails;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "PRODUCT-SERVICE")
public interface ProductService {


    //http://localhost:9090/products/findProductById/1
    @GetMapping("products/findProductById/{productId}")
    ProductsDetails getProductDetails(@PathVariable int productId);



}
