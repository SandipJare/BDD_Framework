package ArrayProgram;

public class CompareArray {

	public static void main(String[] args) {


		int a[]= {10,20,30,40};
		int searchEle=20;
		boolean status=false; // false - not found true- found

		for (int i=0;i<a.length;i++) {
			
			if(a[i]==searchEle) {
				System.out.println("Element found");
				status=true;
				break;
			}
		}
		
		if(status== false) {
			System.out.println("element not found");
		}
		
		
	}

}
