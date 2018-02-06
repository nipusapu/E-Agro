package com.susl.agroapi.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.susl.agroapi.model.Category;
import com.susl.agroapi.model.Product;
import com.susl.agroapi.repository.CategoryRepository;
import com.susl.agroapi.repository.ProductRepository;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
    ProductRepository productRepository;
	
	CategoryRepository categoryRepository;
	
	@GetMapping("/product")
	public List<Product> getAllNotes() {
	    return productRepository.findAll();
	}
	
	@GetMapping("/product/{id}")
	public ResponseEntity<Optional<Product>> getProductById(@PathVariable(value = "id") Long categoryID) {
	    Optional<Product> product = productRepository.findById(categoryID);
	    if(product == null) {
	        return ResponseEntity.notFound().build();
	    }
	    return ResponseEntity.ok().body(product);
	}
	
	@PostMapping("/product")
	public @Valid Product createProduct(@Valid @RequestBody Product product) {
		System.err.println(product);
		Category s=categoryRepository.findOneById(Long.parseLong("1"));
		System.err.println(s);
//		product.setCategoryId(s);
		System.err.println(s);
	    return productRepository.save(product);
	}
	

}
