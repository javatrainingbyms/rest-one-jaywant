package com.ms.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.envers.AuditTable;
import org.hibernate.envers.Audited;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
@Table(name = "product")
@Audited
@AuditTable("product_history")
public class Product {
	@Id
	private int id;
	private String name;
	private String brand;
	
	@JsonIgnore
	private int price;
	@Transient
	private int tax;
}
