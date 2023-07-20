package com.example.ECommerceMicroservice.UserService.UserService;

import com.example.ECommerceMicroservice.UserService.UserDAO.UserDAO;
import com.example.ECommerceMicroservice.UserService.UserModel.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserDAO userDAO;

    public UserDetails getUserDetails(int userId) {
        return userDAO.findById(userId).get();
    }


    public UserDetails createUser(UserDetails userDetails) {
        return userDAO.save(userDetails);

    }
}
