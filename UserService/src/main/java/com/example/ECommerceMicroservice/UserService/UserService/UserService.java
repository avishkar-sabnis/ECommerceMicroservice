package com.example.ECommerceMicroservice.UserService.UserService;

import com.example.ECommerceMicroservice.UserService.UserDAO.UserDAO;
import com.example.ECommerceMicroservice.UserService.UserModel.BillingModel;
import com.example.ECommerceMicroservice.UserService.UserModel.UserDetails;
import com.example.ECommerceMicroservice.UserService.external.services.BillingService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserDAO userDAO;

    @Autowired
    BillingService billingService;



    public UserDetails getUserDetails(int userId,int billId) {
        UserDetails user = userDAO.findById(userId).get();
        //BillingModel billingModel = new BillingModel();
        BillingModel billingObject = billingService.getBillDetails(billId);
        user.setUserBillAmount(billingObject.getUserBillAmount());
        return user;
    }


    public UserDetails createUser(UserDetails userDetails) {
        return userDAO.save(userDetails);

    }
}
