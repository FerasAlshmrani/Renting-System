package com.example.rentingsystem.Repository;

import com.example.rentingsystem.Model.Lessor;
import com.example.rentingsystem.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository  extends JpaRepository<Product,Integer> {
    Product findProductById(Integer productId);

    List<Product> findProductByProductCategory(String productCategory);

    @Query("select p from Product  p where p.productStatus = 'ready'")
    List<Product> findProductsByProductStatus();

    List<Product> findProductsByLessor(Lessor lessor);
}
