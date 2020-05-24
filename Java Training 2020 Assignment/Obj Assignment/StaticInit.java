package com.prac.traning.java;

class StaticPrac {

	private int len;
	private int wid;

	
	public StaticPrac() {
		
	}
	
	public StaticPrac(int len, int wid) {
		this.len = len;
		this.wid = wid;
		System.out.println("   Length and Breadth " + len +" : " + wid );
	}
	
	public int getLen() {
		return len;
	}

	public void setLen(int len) {
		this.len = len;
	}

	public int getWid() {
		return wid;
	}

	public void setWid(int wid) {
		this.wid = wid;
	}
	
	public void getMeasure(){
		System.out.println("   The measurements are "+ this.getLen()+"  "+ this.getWid());
	}
	
	{
		System.out.println("\n\tWelcome to the Program \n");
	}
	
	static {
		System.out.println("\n*************************************");
	}

}

public class StaticInit {

	public static void main(String[] args) {
		
		StaticPrac sp = new StaticPrac(13, 44);
		StaticPrac sp1 = new StaticPrac();
		sp1.setLen(30);
		sp1.setWid(90);
		sp1.getMeasure();
		

	}

}
