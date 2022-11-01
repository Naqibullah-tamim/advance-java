package StartBasicJavaOOPs;

public class Students {

	int rollno; 
	String name;
	static String college="ITS";
	
	static void change()
	{
		college="hightschool";
	}
	

	
		Students(int r,String n){
//			rollno=r;
//			name=n;
			this.rollno=rollno;  // use this keyword
			this.name=name;
		}
		void display() {System.out.println(rollno+""+name+""+college);}
		
	
	  
	  
		
	}


