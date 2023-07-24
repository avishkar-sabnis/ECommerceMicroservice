package com.example.ECommerceMicroservice.BillingService.BillingController;

import com.example.ECommerceMicroservice.BillingService.BillingModel.BillingModel;
import com.example.ECommerceMicroservice.BillingService.BillingService.BillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/billing")
public class BillingController {

    @Autowired
    BillingService billingService;

    @GetMapping("/getBillById/{billId}")
    public BillingModel getBillDetails(@PathVariable int billId){
        return billingService.getBillDetails(billId);
    }

    @PostMapping("/createUser")
    public BillingModel createBill(@RequestBody BillingModel billingModel){
        return billingService.createBill(billingModel);
    }

    @GetMapping("/getALlBills")
    public Iterable<BillingModel> getAllBillDetails(){
        return billingService.getAllBillDetails();
    }


}
