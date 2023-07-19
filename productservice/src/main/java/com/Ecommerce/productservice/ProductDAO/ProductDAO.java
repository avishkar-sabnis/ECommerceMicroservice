package com.Ecommerce.productservice.ProductDAO;

import com.Ecommerce.productservice.ProductModel.ProductsDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDAO extends CrudRepository<ProductsDetails,Integer> {

}
