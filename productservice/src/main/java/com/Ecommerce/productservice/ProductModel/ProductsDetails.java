package com.Ecommerce.productservice.ProductModel;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "products_details")
public class ProductsDetails {

    @Id
    @Column(name = "productId")
    private int productId;
    @Column(name = "productName")
    private String productName;
    @Column(name = "productPrice")
    private int productPrice;
    @Column(name = "productExpiry")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date productExpiry;

    public ProductsDetails(int productId, String productName, int productPrice, Date productExpiry) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productExpiry = productExpiry;
    }

    @Override
    public String toString() {
        return "ProductsDetails{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productExpiry=" + productExpiry +
                '}';
    }
}
