package com.susl.agroapi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Data
@Table(name = "orders")
public class Order implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotNull
	@Pattern(regexp = "^[0-9]*$")
	@Size(min = 1, max = 10)
	@Column(name = "quantity", length = 10, unique = true, nullable = false)
	private int quantity;
	
	@NotNull
	@Pattern(regexp = "^[0-9]*$")
	@Size(min = 1, max = 10)
	@Column(name = "amount", length = 10, unique = true, nullable = false)
	private int amount;
}
