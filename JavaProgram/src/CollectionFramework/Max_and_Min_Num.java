package CollectionFramework;

public class Max_and_Min_Num {

	public static void main(String[] args) {


		int a[]= {20,30,40,60,50};
		int sum=0;
		int min=a[0];

		int max=a[0];
	
		
		for (int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
		
		for (int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("Max number : "+ max);
		System.out.println("Min number : "+ min);
		
	}

}
