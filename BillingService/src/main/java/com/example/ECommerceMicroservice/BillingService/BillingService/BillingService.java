package com.example.ECommerceMicroservice.BillingService.BillingService;

import com.example.ECommerceMicroservice.BillingService.BillingDAO.BillingDAO;
import com.example.ECommerceMicroservice.BillingService.BillingModel.BillingModel;
import com.example.ECommerceMicroservice.BillingService.BillingModel.UserDetails;
import com.example.ECommerceMicroservice.BillingService.external.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillingService {

    @Autowired
    BillingDAO billingDAO;

    @Autowired
    UserService userService;




    public BillingModel createBill(BillingModel billingModel) {
        return billingDAO.save(billingModel);
    }

    public BillingModel getBillDetails(int userId) {
        BillingModel billingModel ;
         billingModel = billingDAO.findById(userId).get();
         /*UserDetails userDetails = userService.getUserDetails(userId);
         billingModel.setUserName(userDetails.getUserName());
         billingModel.setUserProducts(billingModel.getUserProducts());*/
         return billingModel;
    }

    public Iterable<BillingModel> getAllBillDetails() {
        return billingDAO.findAll();
    }
}
