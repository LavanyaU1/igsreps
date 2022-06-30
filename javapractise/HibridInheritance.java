package javapractise;
class Sample5{
	int y=10;
	}
class Demo5 extends Sample5{
void test()
{
System.out.println("hello world");
}
}
class Cool5 extends Demo5{
void disp()
{
System.out.println("hii pico");
}
}
class Tests5 extends Sample5{
void Coo()
{
System.out.println("hii seema");
}
}

public class HibridInheritance {
public static void main(String[] args) {
		Cool5 c=new Cool5();
		System.out.println(c.y);
		c.test();
		c.disp();
		Tests5 t=new Tests5();
		System.out.println(t.y);
        t.Coo();
	}
}
