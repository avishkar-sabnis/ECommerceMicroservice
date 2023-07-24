package com.example.ECommerceMicroservice.UserService.UserController;

import com.example.ECommerceMicroservice.UserService.UserModel.UserDetails;
import com.example.ECommerceMicroservice.UserService.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/userManagement")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getUserDetailsById/{userId}/{billId}")
    public UserDetails getUserDetails(@PathVariable int userId,@PathVariable int billId){
        return userService.getUserDetails(userId,billId);
    }

    @PostMapping("/createUser")
    public UserDetails createUser(@RequestBody UserDetails userDetails){
        return userService.createUser(userDetails);
    }




}
