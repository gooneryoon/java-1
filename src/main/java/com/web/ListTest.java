package com.web;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

	static void printSize(List<String> al) {
		System.out.println(al.size());
	}
	public static void main(String[] args) {
		ArrayList<String> strs = new ArrayList<String>();
		printSize(strs);
		LinkedList<String> strs2 = new LinkedList<>();
		printSize(strs2);
	}
}
