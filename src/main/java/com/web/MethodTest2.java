package com.web;

public class MethodTest2 {

	final int a = 1; //final은 반드시 초기화를 해야된다!!
	int b; // final이 아닐 경우에는 instance화가 일어날때 자동으로 0으로 초기화됨
	static void getVoid() {
		return;
	}
	static String getPizza() {
		return "페페로니피자";
	}
	public static void main(String[] args) {
		String pizza = "베이컨피자";
		String myPizza = getPizza();
		// void vo = getVoid(); 변수에는 void라는 데이터타입이 없기 때문에 이건 안됨!!
		MethodTest2 mt2 = new MethodTest2();
		System.out.println(mt2.a);
		System.out.println(mt2.b);
	}
}
