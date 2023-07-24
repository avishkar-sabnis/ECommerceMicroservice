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
@Table(name = "billdetails_ecommerce")
public class BillingModel {

        @Id
        @Column(name = "billId")
        private int billId;
        @Transient
        private String userName;
        @Column(name = "userBillAmount")
        private int userBillAmount;
        @Transient
        private String userProducts;




    }


