package OOPsConcept;

public class ClassC extends ClassB{

	public void c1() {

		System.out.println("Class C : c1 Method");
	}

	public void c2() {

		System.out.println("Class C : c2 Method");
	}

	public void c3() {

		System.out.println("Class C : c3 Method");
	}

	public static void main(String[] args) {

		//before extends ClassB 
		ClassC c=new ClassC();
		c.c1();
		c.c2();
		c.c3();
		
		
		//After extends ClassC Multilevel inheritance concept
		
		//ref of child and object of child all method can access 
		//static method will accessible directly from b class
		c.a1();
		c.a2();
		c.a3();
		b1();
		c.b2();
		c.b3();
		c.c1();
		c.c2();
		c.c3();
		
		ClassB bc=new ClassC();
		bc.a1();
		bc.a2();
		bc.a3();
		b1();
		bc.b2();
		bc.b3();
		
		ClassA ac=new ClassC();
		ac.a1();
		ac.a2();
		ac.a3();
		
	}

}
