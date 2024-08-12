package ch07.sec06.package2;

import ch07.sec06.package1.A;

// protected는 다른패키지에서는 접근 할 수 없다.
public class C {
	public void method() {
		A a = new A();
		a.field = "value";
		a.method();
	}
}
