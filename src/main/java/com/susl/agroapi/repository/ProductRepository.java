package com.susl.agroapi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.susl.agroapi.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

	Iterable<Product> findAllByCategoryIdId(@Param("id")Long Id);

	Optional<Product> findById(Long categoryID);
}
