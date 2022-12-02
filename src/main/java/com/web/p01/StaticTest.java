package com.web.p01;

public class StaticTest {

	int num = 2;
	static int staticNum;
	public static void main(String[] args) {
		StaticTest st = new StaticTest();
		System.out.println(StaticTest.staticNum);
		
		StaticTest st1 = new StaticTest();
		System.out.println(StaticTest.staticNum);
	}
}
