package com.web.p01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		List<Map<String,String>> list = new ArrayList<>();
		for(int i=1;i<=28;i++) {
			Map<String,String> human = new HashMap<>();
			human.put("num", i+"");
			human.put("name", "이름" + i);
			human.put("age", i+2+"");
			list.add(human);
		}
		System.out.println("번호\t이름\t나이");
		for(int i=0;i<list.size();i++) {
			Map<String,String> human = list.get(i);
		}
		for(Map<String,String> human : list) {
			String num = human.get("num");
			String name = human.get("name");
			String age = human.get("age");
			System.out.println(num + "\t" + name + "\t"+age);
		}
	}
}
