package ch06.sec13.exam02.package2; // 다른 패키지

import ch06.sec13.exam02.package1.A;

public class C {
	A a1 = new A(true);
//	A a2 = new A(1); default 생성자 접근불가
//	A a3 = new A("문자열"); private 생성자 접근 불가
}
