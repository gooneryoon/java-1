package com.web.p01;

import java.util.Random;
import java.util.Scanner;

public class FindNum {

	public static void main(String[] args) {

		Random r = new Random();
		int rNum = r.nextInt(7) + 1;
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("니가 좋아하는 숫자 함써봐라 : ");
			String numStr = scan.nextLine();
			int num = Integer.parseInt(numStr);
			if(rNum == num) {
				System.out.println("오호 럭키~~");
				break;
			}else {
				System.out.println("풋, 니가 그럼 그렇지");
			}
		}
	}
}
