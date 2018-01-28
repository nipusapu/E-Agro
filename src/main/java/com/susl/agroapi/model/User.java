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

import org.hibernate.validator.constraints.Email;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable{

//	public User(@NotNull @Size(min = 5, max = 60) String firstName, @NotNull @Size(min = 5, max = 60) String lastName,
//			@Pattern(regexp = "^[a-z0-9]*$") @Size(min = 1, max = 50) String userName,
//			@NotNull @Size(min = 5, max = 60) String password, @Email String email) {
//		super();
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.userName = userName;
//		this.password = password;
//		this.email = email;
//	}

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotNull
	@Size(min = 5, max = 60)
	@Column(name = "firstName", length = 50, unique = true)
	private String firstName;
	
	@NotNull
	@Size(min = 5, max = 60)
	@Column(name = "lastName", length = 50, unique = true)
	private String lastName;

	@Pattern(regexp = "^[a-z0-9]*$")
	@Size(min = 1, max = 50)
	@Column(name = "userName", length = 50, unique = true)
	private String userName;
	
	//@NotNull
	//@Pattern(regexp = "^[0-9]*$")
	//@Size(min = 1, max = 10)
	//@Column(name = "tp_no", length = 10, unique = true, nullable = false)
	//private int tp_no;

	@NotNull
	@Size(min = 5, max = 60)
	@Column(name = "password", length = 60)
	// @JsonIgnore
	private String password;

	@Email
	@Column(nullable = true, unique = true)
	private String email;
}
