package com.susl.agroapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Data
@Table(name = "products")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotNull
	@Size(min = 5, max = 60)
	@Column(name = "productName", length = 50, unique = true, nullable = false)
	private String productName;
	
	@NotNull
	@Size(min = 10, max = 200)
	@Column(name = "description", length = 200, unique = true, nullable = false)
	private String description;
	
	@NotNull
	//@Pattern(regexp = "^[0-9]*$")
	@Column(name = "price", length = 10, unique = true, nullable = false)
	private int price;
	
	@ManyToOne
	@JoinColumn(name="product")
	private Category categoryId;
	
	@NotNull
	@Column(name = "imageURL", length = 500, nullable = false)
	private String image;

}
