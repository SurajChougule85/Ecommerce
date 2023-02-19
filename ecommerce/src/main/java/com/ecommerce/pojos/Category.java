package com.ecommerce.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
@Entity
public class Category extends BaseEntity {
	
	@Column(name = "category_name",length = 30)
	private String categoryName;
	
	@Column(length = 100)
	private String description;
	
	private boolean active;

}
