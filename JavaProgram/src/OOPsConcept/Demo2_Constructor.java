package OOPsConcept;

public class Demo2_Constructor {

	public Demo2_Constructor() {

		System.out.println("This is constructor");
	}

	public Demo2_Constructor(int b) {

		System.out.println("This is constructor with single int type argumnet ");
	}

	public static void main(String[] args) {
		Demo2_Constructor obj = new Demo2_Constructor();

		new Demo2_Constructor(10);
	}

}
