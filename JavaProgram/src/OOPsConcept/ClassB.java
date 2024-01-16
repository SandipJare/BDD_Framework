package OOPsConcept;

public class ClassB extends ClassA {

	public static  void b1() {
		ClassB bb=new ClassB();
		System.out.println(bb.b);
		System.out.println("Class B: b1 method ");
		
	}

	public void b2() {
		System.out.println("Class B: b2 method ");
	}

	public void b3() {
		System.out.println("Class B: b3 method ");
	}

	public static void main(String[] args) {
		//before extends ClassA
		ClassA a = new ClassA();
		a.a1();
		a.a2();
		a.a3();

		//before extends ClassB
		ClassB b = new ClassB();
		b.b1();
		b.b2();
		b.b3();

		
		//After extending ClassA
		b.a1();
		b.a2();
		b.a3();
		b.b1();
		b.b2();
		b.b3();
		
		ClassA ab=new ClassB();
		ab.a1();
		ab.a2();
		ab.a3();
		
	}

}
