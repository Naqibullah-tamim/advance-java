package StartBasicJavaOOPs;

public class Threads {
	public class MyThread2 implements Runnable  
	{    
	public void run()  
	{    
	System.out.println("Now the thread is running ...");    
	}    
	    
	// main method  
	public static void main(String argvs[])  
	{   
	
	Runnable r1 = new MyThread2();   

	Thread th1 = new Thread(r1, "My new thread");    
	  
 
	th1.start();   
}
