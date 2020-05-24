package com.prac.traning.java;

public class SingletonMain {

	public static void main(String[] args) {
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		
		
	
		if(s1 == s2) {
			System.out.println("Same object");
		}else {
			System.out.println("Different Object");
		}
		
		s1.displayCount();
	}

}
