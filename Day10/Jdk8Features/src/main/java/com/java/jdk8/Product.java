package com.java.jdk8;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter 
@Setter
@NoArgsConstructor
@AllArgsConstructor 
@ToString
public class Product {

	  private int id;
	  private String name;
	  private double price;
	  
}
