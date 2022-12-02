package com.web.p01;

public class DebugTest {

	public DebugTest() {
		System.out.println("아하 너 DebugTest메모리 생성했구나!!");
	}
	
	public void test() {
		System.out.println("난 static이 아닌데 날 실행했다는 얘기는 내 메모리를 생성했다는 얘기네~~");
	}
	public static void main(String[] args) {
		DebugTest dt = new DebugTest();
		dt.test();
	}
}
