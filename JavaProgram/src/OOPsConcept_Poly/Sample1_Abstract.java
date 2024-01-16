package OOPsConcept_Poly;

public class Sample1_Abstract extends Demo1_Abstarct {

	@Override
	public void m3() {
		System.out.println("M3 method in Sample1 class");
	}

	public void s1() {
		System.out.println("S1 method in Sample1 class");
	}

	public static void main(String[] args) {

		Sample1_Abstract obj = new Sample1_Abstract();
		obj.m1();
		obj.m2();
		obj.m3();
		obj.s1();

	}

	
}
