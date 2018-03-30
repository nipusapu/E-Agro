package com.susl.agroapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.susl.agroapi.model.Category;



public interface CategoryRepository extends PagingAndSortingRepository<Category, Long> {

}
