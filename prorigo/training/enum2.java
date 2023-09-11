package com.prorigo.training;

public class enum2 {
	public enum Direction { // enum class 
		NORTH, SOUTH, EAST, WEST,

	}

	void show(String s) { // instance method
		System.out.println(s);
	}

	void show2(Direction d) { // instance method
		System.out.println(d);
	}

	public static void main(String[] args) {
		enum2 obj = new enum2();
		obj.show("summer");
		obj.show2(Direction.NORTH);
	}

}