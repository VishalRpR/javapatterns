package patterns;

import java.util.Scanner;

public class pattern7 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		/* MY VErsion
		 * 
		int st=1;
		int sp=0;
		int af=n-1;
		
		for (int i = 1; i <=n; i++) {
			
			for (int j =1; j <=sp; j++) {
				System.out.print("\t");
				
			}
			
			for (int j =1; j <=st; j++) {
				System.out.print("*\t");
				
			}
			
			for (int j =1; j <=af; j++) {
				System.out.print("\t");
				
			}
			
		
			sp++;
			af--;
			
			
			System.out.println();
			
			*/
		
		
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=n; j++) {
				if(i==j) {
				System.out.print("*\t");
				}else {
					System.out.print("\t");
				}
			}
			
			System.out.println();
		}
		
			
		}

	}


