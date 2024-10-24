package labarray;

public class Lab5_ArrayAndString {

	public static void main(String[] args) {
		
		
		
//		1  Find the minimum and maximum elements in an array
		
		
		
		 int num[]= {60,50,24,56,12,70,84,94,46};
		 int temp=0;
		 for(int i=0;i<num.length-1;i++) {
			 for(int j=i+1;j<num.length;j++) {
				 
					if(num[i]>num[j]) {
						temp=num[i];
						num[i]=num[j];
						num[j]=temp;
						
						
					}
			 }
		 }
		 System.out.println("Minimum Element in the array is "+num[1]);
		 System.out.println("Maximum Element in the array is "+num[num.length-1]);
		 
		 
		 
		 
//		 2.Create an array and Reverse the array
		 
		 int rev[]=new int[num.length];
		 int index=0;
		 for(int i=num.length-1;i>=0;i--) {
			 
			 
			 rev[index]=num[i];
			 index++;
			 
		 }
		 
		 System.out.print("Original array is: ");
		 
 for(int i=0;i<rev.length;i++) {
			 
			 System.out.print(" "+num[i]);
			 
		 }
 
 System.out.println();
 
 System.out.print("revrse array is: ");
	
		 
		 for(int i=0;i<rev.length;i++) {
			 
			 System.out.print(" "+rev[i]);
			 
		 }
		 
//		 3.Sort array in Decsending order
		 
		 int Decsending[]= {34,65,25,96,36,92,26,52,48};
		 
		 int temp1=0;
		 for(int i=0;i<Decsending.length-1;i++) {
			 for(int j=i+1;j<Decsending.length;j++) {
				 
					if(Decsending[i]<Decsending[j]) {
						temp1=Decsending[i];
						Decsending[i]=Decsending[j];
						Decsending[j]=temp1;
						
						
					}
			 }
		 }
		 
		 System.out.println();
		 
		 for(int i=0;i<Decsending.length;i++) {
			 
			 System.out.print(" "+Decsending[i]);
			 
		 }
		 
		 System.out.println();
		 
		 
//		 4.Create String and perform Concatination,Indexof(),CharAt(),Compare,equal operation
		 
		 String str1="Welcome";
		 
		 String str2="Welecome";
		 System.out.println(str1+" Rohit");
		 
		 System.out.println(str1+str2);
			System.out.println(str1.concat(str2));


		 
		 System.out.println("index of o is "+ str1.indexOf('o'));
		 
		 System.out.println("charAt "+str1.charAt(2));
		 
		 System.out.println("Compares "+str1.compareTo(str2));
		 
		 
		 System.out.println(str1==str2);

		 
		 


		 
		 


		 
	
	}

}
