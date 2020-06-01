package Abstract;

interface Winos
{
	int a=30;
	void test1();
	void test2();
}
interface Macos
{
	void test3();
}
interface Linuxos
{
	abstract void test4();
}
public class Demo3 implements Winos, Macos, Linuxos 
{
    public void test1()
    {
    	System.out.println("Test1 from Winos");
    }
    public void test2()
    {
    	System.out.println("Test2 from Winos");
    }
    public  void test3()
    {
    	System.out.println("Test3 from Macos");
    }
    public void test4()
    {
    	System.out.println("Test4 from Linuxos");
    }
    public static void main(String[] args) 
    {
	     Demo3 d3 = new Demo3();
	     d3.test1();
	     d3.test2();
	     d3.test3();
	     d3.test4();
	     System.out.println(d3.a);
	}
}
