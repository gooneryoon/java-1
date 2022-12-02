package com.web.p01;

public class Test {

	private int age = 3;
	
	public void setAge() {
		int age = 1;
		System.out.println(age);
		System.out.println(this.age);
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		t.setAge();
	}
}
