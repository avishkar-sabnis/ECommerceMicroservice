package com.example.ECommerceMicroservice.UserService.UserDAO;

import com.example.ECommerceMicroservice.UserService.UserModel.UserDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends CrudRepository<UserDetails,Integer> {



}
