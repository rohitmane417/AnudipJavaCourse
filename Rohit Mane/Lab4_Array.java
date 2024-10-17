
public class Lab4_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Animal[]= {"DOG","CAT","LION","TIGER","ELEPHANT","FOX","COW","CAMEL","HOURSE","BEAR","GIRAFFE"};
		for(int i=0;i<Animal.length;i++) {
			System.out.println(Animal[i]);
		}
		
		 int num[]= {60,50,24,56,12,70,84,94,46};
		 int temp=0;
		 for(int i=0;i<num.length-1;i++) {
			 for(int j=i+1;j<num.length;j++) {
				 
				if(num[i]<num[j]) {
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
					
					
				}
				 
			 }
		 }
		 
	
		 System.out.println();

			 System.out.println("The Second largest element in an array is :"+num[2]);
		 
		 
		
		

	}

}
