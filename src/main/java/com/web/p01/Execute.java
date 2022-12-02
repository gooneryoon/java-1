package com.web.p01;

public class Execute {

	public static void main(String[] args) {
		Sports s = new BaseBall();
		s.setGym("잠실경기장");
		s.setMemberCnt(11);
		s.setType("야구");
		String str = s.toString();
		System.out.println(str);
		System.out.println(s);
	}
}
