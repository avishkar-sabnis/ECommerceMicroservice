package com.example.ECommerceMicroservice.BillingService.BillingService;

import com.example.ECommerceMicroservice.BillingService.BillingDAO.BillingDAO;
import com.example.ECommerceMicroservice.BillingService.BillingModel.BillingModel;
import com.example.ECommerceMicroservice.BillingService.BillingModel.ProductsDetails;
import com.example.ECommerceMicroservice.BillingService.BillingModel.UserDetails;
import com.example.ECommerceMicroservice.BillingService.external.services.ProductService;
import com.example.ECommerceMicroservice.BillingService.external.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class BillingService {

    @Autowired
    BillingDAO billingDAO;

    @Autowired
    ProductService productService;

    @Autowired
    UserService userService;


    @Autowired
    RestTemplate restTemplate;

    public BillingModel createBill(BillingModel billingModel) {
        return billingDAO.save(billingModel);
    }

    public BillingModel getBillDetails(int userId) {
         BillingModel billingModel ;
         billingModel = billingDAO.findById(userId).get();

        ProductsDetails productObject= productService.getProductDetails(userId);
        List list = new ArrayList<>();
        list.add(productObject.getProductId());
        list.add(productObject.getProductName());
        list.add(productObject.getProductPrice());
        list.add(productObject.getProductExpiry());
        billingModel.setUserProducts(list);

        billingModel.setUserName(userService.getUserName(userId));




         return billingModel;
    }

    public Iterable<BillingModel> getAllBillDetails() {
        return billingDAO.findAll();
    }
}
