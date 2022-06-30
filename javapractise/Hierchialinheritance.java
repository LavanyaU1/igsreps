package javapractise;

class Parent
{
	Parent()
	{
		System.out.println("this is parent class");
	}
}
class Child1 extends Parent
{
	Child1()
	{
		super();
		System.out.println("sudhismitha");
	}
}
class Child2 extends Parent
{
	Child2()
	{
		System.out.println("lavanya");
	}
}
class Child3 extends Parent
{
	Child3()
	{
		super();
		System.out.println("yugendhar");
	}
}
public class Hierchialinheritance
{
	public static void main(String[] args) 
	{
      Child1 child1=new Child1();
      Child2 child2=new Child2();
      Child3 child3=new Child3();
	}
}
