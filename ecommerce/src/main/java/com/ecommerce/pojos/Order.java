package com.ecommerce.pojos;

import java.util.Date;

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
public class Order extends BaseEntity {
	
	
	//join table with customer
	private int customerId;
	
	
	
	//join table with payment table
	private Payment paymentId;
	
	@Column(name = "order_date",length = 30)
	private Date orderDate;
	
	@Column(name = "ship_date",length = 30)
	private Date shipDate;
	
	@Column(name = "requried_date",length = 30)
	private Date requriedDate;
	
	//join table with shipper
	private shipper shipperId;
	
	@Column(name = "payment_date",length = 30)
	private Date paymentDate;
	
	
	

}
