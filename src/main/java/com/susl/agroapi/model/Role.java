package com.susl.agroapi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Data
@Table(name = "roles")
public class Role implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotNull
	@Size(min = 5, max = 60)
	@Column(name = "roleName", length = 50, unique = true, nullable = false)
	private String roleName;
	
	@NotNull
	@Size(min = 5, max = 200)
	@Column(name = "description", length = 200, unique = true, nullable = false)
	private String description;

}
