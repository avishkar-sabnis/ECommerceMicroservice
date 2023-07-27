package com.example.ECommerceMicroservice.BillingService.external.services;


import com.example.ECommerceMicroservice.BillingService.BillingModel.UserDetails;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "USER-SERVICE")
public interface UserService {


    @GetMapping("/userManagement/getUserDetails/{userId}")
    UserDetails getUserDetails(@PathVariable int userId);







}
