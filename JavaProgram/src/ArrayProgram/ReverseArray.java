package ArrayProgram;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
	
		System.out.println("Please enter a number: --");

		
		int b[]=new int[4];
		
		for (int i=0;i<b.length;i++) {
			System.out.println("Eneter a value: of index of :" +i+": " );
			b[i]=sc.nextInt();
			
		}
		
		System.out.println("Printing array Element: " );
		
		for (int val:b) {
			System.out.println(val);
		}
	/*	
		int a[] = { 10, 20, 20, 30, 40};
		
		for (int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
			
		}*/
	}

}
