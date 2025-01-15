package thisExample;

public class ThisExample 
{
	int a,b;
	public static void main(String[] args)
	{
		ThisExample obj=new ThisExample(5,8);
		obj.display();

	}
	public ThisExample(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void display()

	{
		System.out.println("a "+a);
		System.out.println("b "+b);
	}
}
