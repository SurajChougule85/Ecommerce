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
public class Payment extends BaseEntity{
	
	@Column(name="payment_method",length = 30)
	private PaymentType paymentMethod;
	private boolean allowed;

	
}
