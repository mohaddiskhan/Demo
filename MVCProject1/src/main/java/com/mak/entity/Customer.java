package com.mak.entity;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class Customer {
	private Long id;
	private String name;
	private String email;
	private String address;

}
