package StartBasicJavaOOPs;

// Overloading
public class Adder {
	static int add(int a,int b) {return a+b;}
	static double add(double a, double b){return a+b;}

}
class TestOverloading{
	
	public static void main(String args[])
	{
		System.out.println(Adder.add(12, 55));
		System.out.println(Adder.add(43, 65));
	}
}