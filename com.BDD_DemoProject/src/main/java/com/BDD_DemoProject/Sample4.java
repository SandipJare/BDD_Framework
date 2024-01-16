package com.BDD_DemoProject;

public class Sample4 extends Demo4_ExceptionInSelenium {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		//super.m1();
		System.out.println("Sample4: " );
	}

	@Override
	public void m1(int a) {
		// TODO Auto-generated method stub
		//super.m1(a);
		System.out.println("Sample4: " +a);
	}
	
	

	@Override
	public void m1(int a, int b) {
		// TODO Auto-generated method stub
		super.m1(a, b);
	}

	@Override
	public void m1(String a) {
		// TODO Auto-generated method stub
		super.m1(a);
		System.out.println("Sample4: " +a);
	}

	public static void main(String[] args) {
		Sample4 obj = new Sample4();
		obj.m1();
	}

}
