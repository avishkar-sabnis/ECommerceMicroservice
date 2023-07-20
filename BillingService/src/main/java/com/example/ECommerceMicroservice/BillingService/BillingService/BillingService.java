package com.example.ECommerceMicroservice.BillingService.BillingService;

import com.example.ECommerceMicroservice.BillingService.BillingDAO.BillingDAO;
import com.example.ECommerceMicroservice.BillingService.BillingModel.BillingModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillingService {

    @Autowired
    BillingDAO billingDAO;

    public BillingModel createBill(BillingModel billingModel) {
        return billingDAO.save(billingModel);
    }

    public BillingModel getBillDetails(int billId) {
        return billingDAO.findById(billId).get();
    }
}
