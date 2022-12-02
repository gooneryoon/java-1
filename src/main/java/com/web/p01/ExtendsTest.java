package com.web.p01;

class Paper{
	public String raw = "종이";
	public void print(String text) {
		System.out.println("종이에 " + text + "프린트합니다.");
	}
}

class A4 extends Paper{
	public void print(String text) {
		System.out.println("A4종이에 " + text + " A4규격에 맞춰서 프린트합니다.");
	}
}
public class ExtendsTest {
	public static void main(String[] args) {
		Paper p1 = new A4();
		p1.print("안녕");
	}
}
