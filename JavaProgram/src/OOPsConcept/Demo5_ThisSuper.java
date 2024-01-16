package OOPsConcept;

public class Demo5_ThisSuper {
	int a = 10;

	public void m1() {
		int a = 100;
		System.out.println(a);// 100
		System.out.println(this.a);// 10
	}

	public static void main(String[] args) {
		Demo5_ThisSuper obj = new Demo5_ThisSuper();
		obj.m1();
	}
}
