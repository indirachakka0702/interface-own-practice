package Abstract;

class A
{
	A()
	{
		System.out.println("Parent constructor");
	}
}
public class Cons1 extends A 
{
     Cons1 ()
     {
    	 System.out.println("Child constructor");
     }
     public static void main(String[] args) 
     {
    	 A a1 = new A();
	    Cons1 c1 = new Cons1();
	       
	        
	}
}
