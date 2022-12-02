package com.web.p01;

class Phone{
	public String phoneNumber = "010";
	
	public void send() {
		System.out.println(phoneNumber + "으로 전화를 겁니다.");
	}
}
class InternetPhone extends Phone{
	
}
public class MobilePhone extends Phone{
	
	public void send() {
		System.out.println("011로 전화를 겁니다.");
	}
	public void kakao() {
		System.out.println("카톡");
	}

	public static void main(String[] args) {
		Phone p = new MobilePhone();
		p.send();
		if(p instanceof MobilePhone) {
			MobilePhone mp = (MobilePhone) p;
			mp.kakao();
		}
	}
}
