package com.example.proj8.validator;


import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.example.proj8.form.CalcForm;

@Component
public class CalcValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return CalcForm.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		CalcForm form = (CalcForm) target;
		
		if(form.getLeftNum() != null && form.getRightNum() != null) {
			
			if (!((form.getLeftNum() % 2 == 1) && (form.getRightNum() % 2 == 0))) {
				errors.reject("com.example.proj8.validator.CalcValidator.message");
			}
		}
		
	}
	
}
