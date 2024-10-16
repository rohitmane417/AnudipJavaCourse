package variable;

public class EmplyeeDetails {
	
	int id,age,salary;
	String name;
	
	EmplyeeDetails(int id,String name,int age,int salary){
		this.id=id;
		this.age=age;
		this.salary=salary;
		this.name=name;
		
		
	}
	
	

	public static void main(String[] args) {
		
		EmplyeeDetails em1= new EmplyeeDetails(101,"Rohit",22,40000);
		EmplyeeDetails em2= new EmplyeeDetails(102,"aniket",25,50000);
		EmplyeeDetails em3= new EmplyeeDetails(103,"Virat",28,20000);
		EmplyeeDetails em4= new EmplyeeDetails(104,"Akash",25,50000);
		EmplyeeDetails em5= new EmplyeeDetails(105,"sai",22,65000);
		EmplyeeDetails em6= new EmplyeeDetails(106,"Ajay",22,35000);
		EmplyeeDetails em7= new EmplyeeDetails(107,"RohitM",22,45000);
		EmplyeeDetails em8= new EmplyeeDetails(108,"RohitJ",22,60000);
		EmplyeeDetails em9= new EmplyeeDetails(109,"Rohit",22,40000);
		EmplyeeDetails em10= new EmplyeeDetails(110,"Rohit",22,35000);
		
		System.out.println("Employee ID: |"+em1.id+"| Employee Name: "+em1.name+" Employee Age: "+em1.age+" employee Salary "+em1.salary);
		System.out.println("Employee ID: "+em2.id+" Employee Name: "+em2.name+" Employee Age: "+em2.age+" employee Salary "+em2.salary);
		System.out.println("Employee ID: "+em3.id+" Employee Name: "+em3.name+" Employee Age: "+em3.age+" employee Salary "+em3.salary);
		System.out.println("Employee ID: "+em4.id+" Employee Name: "+em4.name+" Employee Age: "+em4.age+" employee Salary "+em4.salary);
		System.out.println("Employee ID: "+em5.id+" Employee Name: "+em5.name+" Employee Age: "+em5.age+" employee Salary "+em5.salary);
		System.out.println("Employee ID: "+em6.id+" Employee Name: "+em6.name+" Employee Age: "+em6.age+" employee Salary "+em6.salary);
		System.out.println("Employee ID: "+em7.id+" Employee Name: "+em7.name+" Employee Age: "+em7.age+" employee Salary "+em7.salary);
		System.out.println("Employee ID: "+em8.id+" Employee Name: "+em8.name+" Employee Age: "+em8.age+" employee Salary "+em8.salary);
		System.out.println("Employee ID: "+em9.id+" Employee Name: "+em9.name+" Employee Age: "+em9.age+" employee Salary "+em9.salary);
		System.out.println("Employee ID: "+em10.id+" Employee Name: "+em10.name+" Employee Age: "+em10.age+" employee Salary "+em10.salary);
	
		

	}

}
