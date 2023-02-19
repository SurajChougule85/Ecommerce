package com.ecommerce.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Product extends BaseEntity{
	
	@Column(name="product_name",length =30,nullable = false)
	private String productname;
	
	@Column(name="product_description",length =150,nullable = false)
	private String productDescription;
	
	@Column(name="unit_price",nullable = false)
	private double unitPrice;
	
	@Column(length =30)
	private String size;
	
	@Column(length =30)
	private String colour;
	
	private double discount;
	
	@Column(name="unit_stock")
	private int unitStock;
	
	private Suppliers supplierId;
	
	private Category categoryId;
	
	private Order orderId;
	
	@Column(name="units_on_order")
	private int unitsOnOrder;
	
	private String image;

}
