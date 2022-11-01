package StartBasicJavaOOPs;

public class Par_Constructor {
	int id ;
	String name;

	public static void main(String[] args) {
      
		System.out.println("________paramitrize constructor__________");
		Par_Constructor s1=new Par_Constructor(123,"Farid");
		Par_Constructor s2=new Par_Constructor(34,"Sudais");
		s1.show();
		s2.show();
	}
    //Paramitriz constructor
	Par_Constructor(int id,String name)
	{
		id = id ;
		name=name;
	} void show(){System.out.println(id+""+name);}
	
	
	
}
