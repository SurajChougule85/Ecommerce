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
public class shipper extends BaseEntity {

	@Column(name = "company_name",length = 30)
	private String companyName;
	
	@Column(name = "contact_number",length = 30)
	private String contactNumber;
}
