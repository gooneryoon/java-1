package com.web;

public class MethodTest {

	int i;
	void test1() {
		
	}
	static void test() {
		System.out.println("안녕, 난 테스트라고해~");
		System.out.println(1);
		System.out.println(1.1);
		System.out.println(true);
		System.out.println(new MethodTest());
	}
	public static void main(String[] args) {
//		test();
		MethodTest mt = new MethodTest();
		mt.test1();
		System.out.println(mt.i);
	}
}
