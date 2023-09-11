package com.prorigo.training;

public class enumwithswitch {
	public enum Direction { // enum class
		NORTH, SOUTH, EAST, WEST,

	}

	public static void main(String[] args) {
		Direction d = Direction.SOUTH;

		switch (d) {
		case NORTH:
			System.out.println("you are in north direction");
			break;
		case SOUTH:
			System.out.println("you are in south direction");
			break;
		case EAST:
			System.out.println("you are in east direction");
			break;
		case WEST:
			System.out.println("you are in west direction");
			break;
		}
	}

}
