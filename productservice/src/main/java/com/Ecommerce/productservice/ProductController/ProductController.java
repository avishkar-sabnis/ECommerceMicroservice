package com.Ecommerce.productservice.ProductController;

import com.Ecommerce.productservice.ProductModel.ProductsDetails;
import com.Ecommerce.productservice.ProductServiceLayer.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;


    //Find Product By ID.
    @GetMapping("/findProductById/{productId}")
    public ProductsDetails findProductById(@PathVariable int productId){
        return productService.findProductById(productId);
    }


    //Create Product    @RequestBody ProductsDetails productsDetails
    @PostMapping("/createProduct/")
    public ProductsDetails createProduct(@RequestBody ProductsDetails productsDetails){
        return productService.createProduct(productsDetails);
    }


    //Update Product Expiry
    @PutMapping("/updateProduct/{productId}/{productexpiry}")
    public ProductsDetails createProduct(@PathVariable int productId,@PathVariable Date productexpiry){
        return productService.updateProductExpiry(productId,productexpiry);
    }



    //Get All Products
    @GetMapping("/findAllProducts")
    public Iterable<ProductsDetails> findAllProducts(){
        return productService.findAllProducts();
    }

    //Get Product Price
    @GetMapping("/findProductPrice/{productId}")
    public ResponseEntity<ProductsDetails> findProductPrice(@PathVariable int productId){
        return productService.findProductPrice(productId);
    }


}
