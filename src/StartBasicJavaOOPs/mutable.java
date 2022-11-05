package StartBasicJavaOOPs;
public class mutable {  
    private String s;  
    mutable(String s) {  
    this.s = s;  
    }  
    public String getName() {  
    return s;  
    }  
    public void setName(String coursename) {  
    this.s = coursename;  
    }  
    public static void main(String[] args) {  
    mutable obj = new mutable("JavaTpoint");  
    System.out.println(obj.getName());  

    obj.setName("Java Training");  
    System.out.println(obj.getName());  
    }  
    }  

// immutable

public class JtpExample1 {  
    private final String s;  
    JtpExample1(final String s) {  
    this.s = s;  
    }  
    public final String getName() {  
    return s;  
    }  
    public static void main(String[] args) {  
    mutable obj = new mutable("Core Java Training");  
    System.out.println(obj.getName());  
    }  
    }  

