package com.web.p01;

public class StringEquals2 {

	String str = new String("abc");
	
	public static void main(String[] args) {
		StringEquals2 se1 = new StringEquals2();
		StringEquals2 se2 = new StringEquals2();
		System.out.println(se1.str.equals(se2.str));
	}
}
