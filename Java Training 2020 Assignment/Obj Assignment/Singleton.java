package com.prac.traning.java;

public class Singleton {

	private static int count;
	private static Singleton instance;

	private Singleton() {
		System.out.println(" Object created");
		count++;
	}

//	public static Singleton getInstance() {
//
//		if (instance == null) {
//			instance = new Singleton();
//		}
//		return instance;
//	}

	static{
		instance = new Singleton();
	}

	public static Singleton getInstance() {
		return instance;
	}

	public void displayCount() {
		System.out.println("Number of objece created: " + count);
	}
}
