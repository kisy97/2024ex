package com.ktest.homeshop.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class MoneyDTO {
	private Integer custno;
	private String custname;
	private String grade;
	private Integer price;
}
