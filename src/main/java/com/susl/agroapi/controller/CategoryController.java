//package com.susl.agroapi.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.susl.agroapi.model.Product;
//import com.susl.agroapi.repository.ProductRepository;
//
//@RestController
//@RequestMapping("/map")
//public class CategoryController {
//
//	@Autowired
//	ProductRepository productRepository;
//
//	// @GetMapping("/category")
//	// public List<Category> getAllNotes() {
//	// return categoryRepository.findAll();
//	// }
//
//	@GetMapping("/category/{id}")
//	public ResponseEntity<List<Product>> getCategoryById(@PathVariable(value = "id") Long categoryId) {
//		List<Product> category = productRepository.findAllByCategoryId(categoryId);
//		if (category == null) {
//			return ResponseEntity.notFound().build();
//		}
//		return ResponseEntity.ok().body(category);
//	}
//	
//	@GetMapping("/categorys")
//	public ResponseEntity<List<Product>> getCategoryById() {
//		long x=3;
//		List<Product> category = productRepository.findAllByCategoryId(x);
//		if (category == null) {
//			return ResponseEntity.notFound().build();
//		}
//		return ResponseEntity.ok().body(category);
//	}
//
//}
