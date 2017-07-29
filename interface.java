
public interface a
{
void detail1();
void detail2(); 
}

public class b implements a
{
 public void detail1()
{
	System.out.println("i'm stu1\n rno:1;from class A");
}

public  void detail2()
{
	System.out.println("i'm stu 2..\n id:2 ..from class B");
}
}


public class c implements a
{
public void detail1()
{
	System.out.println("i'm teacher 1..for stu 1");
}
public void detail2()
{
	System.out.println("im teacher 2.. for stu 2..");
}
}

public class d
{
	public static void main(String[] args)
	{
		
		System.out.println("\\student details\\");
		b b1=new b();
		b1.detail1();
		b1.detail2();
		System.out.println("\\teacher details\\");
		c c1=new c();
		c1.detail1();
		c1.detail2();
	}

}
