package conditionalStatement;

import java.util.Scanner;

public class IFElse_Lab {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("Enter Student Name");
		String name=sc.nextLine();
		int a[]=new int[5];
		System.out.println("Subject 1");
		a[0]=sc.nextInt();
		System.out.println("Subject 2");
		a[1]=sc.nextInt();
		System.out.println("Subject 3");
		a[2]=sc.nextInt();
		System.out.println("Subject 4");
		a[3]=sc.nextInt();
		System.out.println("Subject 5");
		a[4]=sc.nextInt();
		
		int total=0;
	
		for(int i=0;i<a.length;i++) {
			total=total+a[i];
		}
		
		System.out.println("Total Marks is Obtained is"+total);
		
		int avg=total/5;
		
		
		if(avg>80) {
			System.out.println("Grade is O+");
		}else if (avg>70&&avg<80) {
			
			System.out.println("Grade is O+");
			
		}
         else if (avg>60&&avg<70) {
			
			System.out.println("Grade is A+");
			
		}else if (avg>50&&avg<60) {
			
			System.out.println("Grade is B+");
			
		}else if (avg>40&&avg<50) {
			
			System.out.println("Grade is C");
			
		}else {
			System.out.println("Fail");
		}
		
		
		
		

	}

}
