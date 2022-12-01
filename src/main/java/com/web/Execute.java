package com.web;

public class Execute {

	public static void playGame(Action a) {
		a.play();
	}
	public static void playLOL(LOL a) {
		a.play();
	}
	public static void playLostArk(LostArk a) {
		a.play();
	}
	public static void playMapleStory(MapleStory a) {
		a.play();
	}
	public static void main(String[] args) {
		Action a1 = new LOL();
		Action a2 = new LostArk();
		Action a3 = new MapleStory();
		playGame(a1);
		playGame(a2);
		playGame(a3);
	}
}
