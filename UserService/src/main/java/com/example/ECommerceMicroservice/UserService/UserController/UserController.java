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

    @GetMapping("/getUserDetailsById/{userId}")
    public UserDetails getUserDetails(@PathVariable int userId){
        return userService.getUserDetails(userId);
    }


    @GetMapping("/getUserByUserName/{userId}")
    public String getUserName(@PathVariable int userId){return userService.getUserName(userId); }

    @PostMapping("/createUser")
    public UserDetails createUser(@RequestBody UserDetails userDetails){
        return userService.createUser(userDetails);
    }

    @GetMapping("/getUserDetailsById/getAllUsers")
    public Iterable<UserDetails> getAllUsers() {
        return userService.getAllUsers();

    }


}
