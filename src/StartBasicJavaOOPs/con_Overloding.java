package StartBasicJavaOOPs;

public class con_Overloding {

	int id;
	String name;
	int age;
	
	
	// creating two constructor
	con_Overloding(int id,String name)
	{
		id =id;
		name=name;
	}
	con_Overloding(int id,String name,int age)
	{
		id = id ;
		name=name;
		age=age;
	}
	void showValue() {System.out.println(id+""+name+""+age);}
	
	public static void main(String[] args) {
         con_Overloding obj=new con_Overloding(11,"khan");
         con_Overloding obj2=new con_Overloding(51,"jan",21);
         
         obj.showValue();
         obj2.showValue();
	}
}
