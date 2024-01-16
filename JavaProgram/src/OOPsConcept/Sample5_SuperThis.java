package OOPsConcept;

public class Sample5_SuperThis extends Demo5_ThisSuper {

	int a = 999;

	public void s1() {
		int a = 888;
		System.out.println(a);// 888
		System.out.println(this.a);// 999
		System.out.println(super.a);// 10
	}

	public static void main(String[] args) {
		Sample5_SuperThis obj = new Sample5_SuperThis();
		obj.s1();
	}
}
