package calc;

public class shape 
{
void circle()
{
	double p=3.14;
	double r=2;
	double area=(p*r*r);
	System.out.println("area of circle is:"+area);
	}
void triangle(double h, double b)
{
 double area =0.5*b*h;
 System.out.println("area of tri is:"+area);
}

int square()
{
	int a=2;
	int area=a*a;
	return area;
}
int rectangle(int l,int b)
{
	int area=l*b;
	return area;
	
}

public static void main(String[] args)
{
	shape s=new shape();
s.circle();
s.triangle(5.5, 2.5);
int square=s.square();
System.out.println("area of sqaure is..:"+s.square());
System.out.println("area of rect is.."+s.rectangle(2, 4));
}
}