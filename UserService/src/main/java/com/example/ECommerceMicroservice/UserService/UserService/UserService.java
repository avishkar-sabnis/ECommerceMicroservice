package com.example.ECommerceMicroservice.UserService.UserService;

import com.example.ECommerceMicroservice.UserService.UserDAO.UserDAO;
import com.example.ECommerceMicroservice.UserService.UserModel.BillingModel;
import com.example.ECommerceMicroservice.UserService.UserModel.ProductsDetails;
import com.example.ECommerceMicroservice.UserService.UserModel.UserDetails;
import com.example.ECommerceMicroservice.UserService.external.services.BillingService;
import com.example.ECommerceMicroservice.UserService.external.services.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserDAO userDAO;

    @Autowired
    BillingService billingService;

    @Autowired
    ProductService productService;




    public UserDetails getUserDetails(int userId) {
        UserDetails user = userDAO.findById(userId).get();
       BillingModel billingObject = billingService.getBillDetails(userId);
        //ProductsDetails productObject= productService.getProductDetails(userId);
        user.setUserBillAmount(billingObject.getUserBillAmount());
       /* List list = new ArrayList<>();
        list.add(productObject.getProductId());
        list.add(productObject.getProductName());
        list.add(productObject.getProductPrice());
        list.add(productObject.getProductExpiry());
        user.setUserProducts(list);*/


        return user;
    }


    public UserDetails createUser(UserDetails userDetails) {
        return userDAO.save(userDetails);

    }



    public Iterable<UserDetails> getAllUsers() {
        return userDAO.findAll();

    }


}
