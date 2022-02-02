package com.myapp.spring.repository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myapp.spring.model.Product;


// This is data repository class
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

	Optional<List<Product>> findByPriceGreaterThanEqual(Double price);



	Optional<List<Product>> findByProductNameOrPrice(String productName,Double price);




	Optional<List<Product>> findByProductNameLike(String productName);



	Optional<List<Product>> findByPriceIn(Collection<Double> prices);



	Optional<List<Product>> findByProductNameIgnoreCase(String productName);
}
