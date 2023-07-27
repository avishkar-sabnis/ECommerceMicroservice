package com.example.ECommerceMicroservice.BillingService.BillingModel;

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


        @Column(name = "billId")
        private int billId;


        @Id
        @Column(name = "userId")
        private int userId;
        @Transient
        private String userName;
        @Column(name = "userBillAmount")
        private int userBillAmount;
        @Transient
        private String userProducts;




    }


