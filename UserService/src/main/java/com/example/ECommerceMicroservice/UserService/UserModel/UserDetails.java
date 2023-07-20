package com.example.ECommerceMicroservice.UserService.UserModel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "userdetails_ecommerce")
public class UserDetails {

    @Id
    @Column(name = "userId")
    private int userId;
    @Column(name = "userName")
    private String userName;
    @Transient
    private int userBillAmount;
    @Transient
    private int userProducts;




}
