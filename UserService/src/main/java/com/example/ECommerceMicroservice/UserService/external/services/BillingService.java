package com.example.ECommerceMicroservice.UserService.external.services;

import com.example.ECommerceMicroservice.UserService.UserModel.BillingModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "BILLING-SERVICE")
public interface BillingService {


    @GetMapping("/billing/getBillById/{userId}")
    BillingModel getBillDetails(@PathVariable int userId);




}
