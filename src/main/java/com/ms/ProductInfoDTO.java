package com.ms;

import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
public class ProductInfoDTO {
	private int id;
	private String name;
	private String brand;
	private int tax;
}
