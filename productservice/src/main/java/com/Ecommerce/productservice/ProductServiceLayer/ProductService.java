package com.Ecommerce.productservice.ProductServiceLayer;

import com.Ecommerce.productservice.ProductDAO.ProductDAO;
import com.Ecommerce.productservice.ProductModel.ProductsDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ProductService {
    @Autowired
    ProductDAO productDAO;

    public ProductsDetails findProductById(int productId) {
        return productDAO.findById(productId).get();
    }

    public ProductsDetails createProduct(ProductsDetails productsDetails) {
        return productDAO.save(productsDetails);
    }

    public Iterable<ProductsDetails> findAllProducts() {
        return productDAO.findAll();
    }

    public ResponseEntity<ProductsDetails> findProductPrice(int productId) {
        int productPrice = productDAO.findById(productId).get().getProductPrice();
        return new ResponseEntity<ProductsDetails>(HttpStatus.OK);
    }

    public ProductsDetails updateProductExpiry(int productId, Date productexpiry) {
        ProductsDetails product = productDAO.findById(productId).get();
        product.setProductExpiry(productexpiry);
        return product;
    }
}
