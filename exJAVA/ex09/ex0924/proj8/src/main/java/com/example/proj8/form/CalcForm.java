package com.example.proj8.form;

import org.hibernate.validator.constraints.Range;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CalcForm {
	@NotNull
	@Range(min = 1,max = 10)
	private Integer leftNum;
	
	@NotNull
	@Range(min = 1,max = 10)
	private Integer rightNum;
}
