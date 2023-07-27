package com.example.ECommerceMicroservice.BillingService.BillingModel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

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
    private List<ProductsDetails> userProducts;




}
