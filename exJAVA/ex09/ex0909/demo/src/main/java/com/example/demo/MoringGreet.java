package com.example.demo;

import org.springframework.stereotype.Component;

//@Component
public class MoringGreet implements Greet{

	@Override
	public void greeting() {
		// TODO Auto-generated method stub
		System.out.println("--------------------");
		System.out.println("좋은 아침 입니다.");
		System.out.println("--------------------");
	}
	
	
}
