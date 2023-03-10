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
public class Suppliers extends BaseEntity {
	
	@Column(name = "company_name",length = 30)
	private String companyName;
	
	@Column(length = 30)
	private String Address;
	
	@Column(name = "company_email",length = 40)
	private String companyEmail;
	
	@Column(name = "contact_number",length = 30)
	private String contactNumber;
	
	@Column(name = "payment_method",length = 30)
	private PaymentType paymentMethod;
	
	
	private double discount;
	
	@Column(name = "current_order",length = 30)
	private Order currentOrder;
	
	private Customer CustomerId;
	
	

}
