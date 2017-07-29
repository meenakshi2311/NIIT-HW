package a;

public class a
{
int i=10;
void test()
{
	System.out.println("test 1");
}
void test1()
{
	System.out.println("hii..");
}
}
package a;

public class b extends a
{
void test1()
{
System.out.println("test2");	
}
public static void main(String[] args)
{
b b1=new b();
System.out.println(b1.i);
b1.test();
b1.test1();
}
}
package a;

public class c extends a
{
public static void main(String[] args) 
{
	c c1=new c();
	System.out.println(c1.i);
	c1.test();
	c1.test1();
	}
}
