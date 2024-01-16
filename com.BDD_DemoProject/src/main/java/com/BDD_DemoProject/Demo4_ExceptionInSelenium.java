package com.BDD_DemoProject;

public class Demo4_ExceptionInSelenium {

	public void m1() {
		System.out.println("Demo4: m1 method");
	}
	
	public void m1(int a) {
		System.out.println("Demo4:m1 method passing int argumnets "+ a);
	}
	
	public void m1(int a , int b) {
		System.out.println("Demo4:m1 method passing 2 int argumnets "+ a +b);
	}
	
	public void m1(String a) {
		System.out.println("Demo4:m1 method passing string  argumnets "+ a);
	}
	
	

	public static void main(String[] args) {

		Demo4_ExceptionInSelenium obj = new Demo4_ExceptionInSelenium();

		obj.m1();
		obj.m1(10);
		obj.m1("Hello");
	}

}
