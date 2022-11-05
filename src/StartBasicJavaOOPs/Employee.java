package StartBasicJavaOOPs;
                              //    Inheritance
public class Employee {
	
	float salary=4000;
 	
}

	class  Programming extends Employee{
		
		String name;
		int age;

		public static void main(String args[])
		{
			Programming p = new Programming();
			Programming p1 = new Programming();
			Programming p2 = new Programming();

			
			System.out.println("programming salary is "+p.salary+""+p.name);
		}
	}



