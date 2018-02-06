package com.susl.agroapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.susl.agroapi.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	Category findOneById(Long id);
}
