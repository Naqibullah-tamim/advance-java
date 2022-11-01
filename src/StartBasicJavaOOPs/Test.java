package StartBasicJavaOOPs;

public class Test {

	public static void main(String[] args) {

		
		Student obj=new Student();
		obj.display();
		obj.id=39;
		obj.name="Wali";
		
	    
	   
        
		 obj.id=3030;
		 obj.name="Farmanullah";
		System.out.println(obj.id+"\n"+obj.name+"");
		System.out.println();
		
		
		obj.lenght=15;
		obj.width=3;
		System.out.println("_________________________________________");
		obj.calculation();
		
		
	}

}
