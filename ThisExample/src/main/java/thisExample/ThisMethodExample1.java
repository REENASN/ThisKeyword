package thisExample;

public class ThisMethodExample1 
{

	public static void main(String[] args) 
	{
		ThisMethodExample1 obj=new ThisMethodExample1();
		obj.method1();
	}
	public void method1()
	{
		System.out.println("This is first method");
		this.method2();
				
	}
	public void method2()
	{
		System.out.println("This is second method");
	}
}
