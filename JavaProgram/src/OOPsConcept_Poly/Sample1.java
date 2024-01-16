package OOPsConcept_Poly;

public  class Sample1 extends Demo1{

	public void s1(int a) {
		System.out.println("S1 method with 1 int args in Sample1 class");
	}

	public void d1(String a) {
		System.out.println("S1 method with 1 String args in Sample1 class");
	}

	public void login() {
		System.out.println("Login method is sample1 class");
	}

	public static void main(String[] args) {

		Sample1 obj = new Sample1();
		Demo1 obj1 = new Sample1();
		obj.d1();
		obj.d1(1000);
		obj.d1("Selenium");
		obj.s1(100000);
		obj.login();


	}

}
