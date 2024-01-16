package OOPsConcept;

public class Deme4_ConstructorThisSuper {

	public Deme4_ConstructorThisSuper() {
		this("selenium");
		System.out.println("Demo4 0 args cons");
	}

	public Deme4_ConstructorThisSuper(int a) {
		System.out.println("Demo4 1 int args cons");
	}

	public Deme4_ConstructorThisSuper(String b) {
		this(10);
		System.out.println("Demo4 1 String args cons");
	}

	public static void main(String[] args) {
		Deme4_ConstructorThisSuper obj = new Deme4_ConstructorThisSuper();

	}

}
