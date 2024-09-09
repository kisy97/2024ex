package ch02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ListExercise {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		
		Greet greet = new MorningGreet();
		
		names.add("홍길동");
		names.add("김선비");
		names.add("James");
		
		for (String name : names) {
			System.out.println(name);
		}
		greet.greeting();
	}
}
