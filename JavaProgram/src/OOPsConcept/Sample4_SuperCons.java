package OOPsConcept;

public class Sample4_SuperCons extends Demo4_SuperCons {

	public Sample4_SuperCons() {
		this(10);
		System.out.println("Sample4 0 args cons");
	}

	public Sample4_SuperCons(int a) {
		super("selenium");
		System.out.println("Sample4 1 int args cons");
	}

	public Sample4_SuperCons(String c) {
		super("100");
		System.out.println("Sample4 1 String args cons");
	}

	public static void main(String[] args) {

	//	Sample4_SuperCons obj1 = new Sample4_SuperCons("java");
	//	Sample4_SuperCons obj2 = new Sample4_SuperCons(10);
		Sample4_SuperCons obj3 = new Sample4_SuperCons();

	}
}
