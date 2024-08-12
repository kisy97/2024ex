package ch07.sec06.package2;

import ch07.sec06.package1.A;

public class D extends A{
	public D() {
		super();
	}
//	protected는 상속을 통해서 접근가능
	public void method1() {
		this.field = "value";
		this.method();
	}
	
// 직접 객체 생성해서 사용은 불가능	
	public void method2() {
		A a = new A();
		a.field = "value";
		a.method();
	}
	
}
