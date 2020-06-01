package Abstract;

abstract class Demo1
{
	int a=20;
	void test()
	{
		System.out.println("Implement method running...");
	}
	abstract void test1();  // abstract / unimplement method
}
public class Demo extends Demo1 
{
      void test1()
      {
    	  System.out.println("Abstract method implemented");
      }
      public static void main(String[] args) 
      {
		Demo d1 = new Demo();
		d1.test();
		d1.test1();
		System.out.println(d1.a);
      }
}
