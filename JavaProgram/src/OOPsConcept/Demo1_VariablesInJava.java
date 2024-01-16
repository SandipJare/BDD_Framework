package OOPsConcept;

public class Demo1_VariablesInJava {

	String a = "Instance Variable";

	static String c = "Satic variable";


	public void m1() {

		Demo1_VariablesInJava obj1=new Demo1_VariablesInJava();
		System.out.println("m1:instance variable is: " + a);
		System.out.println(obj1.a);

	}

	public void m2() {
		// direct access
		System.out.println("m2:static  variable is: " + c);
	}

	public static void m3() {
		// direct access
		String b = "local Variables";
		System.out.println("m3:local variable is: " + b);
	}

	public static void main(String[] args) {

		Demo1_VariablesInJava obj = new Demo1_VariablesInJava();
	
		System.out.println("main : instance variable is: " + obj.a);
		System.out.println("-------------------------------");
	
		System.out.println("main:static  variable is: " + c);
		System.out.println("-------------------------------");
	
		obj.m1();
		System.out.println("-------------------------------");
		obj.m2();
	
		System.out.println("-------------------------------");
		Demo1_VariablesInJava.m3();

	}

}
