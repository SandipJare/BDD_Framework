package OOPsConcept;

public class Demo7_ImlemenatationDemo6  extends Demo6_AbstractOverload{

	public static void main(String[] args) {

		Demo6_AbstractOverload d=new Demo7_ImlemenatationDemo6();

		d.a1(10);
		
	}

	@Override
	public void a1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void a1(int x) {
		System.out.println("Int argumnets in demo7: " + x);
		
	}

	@Override
	public void a1(String y) {
		// TODO Auto-generated method stub
		
	}

}
