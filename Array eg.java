package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class A
{
void get()
{
String name;
int id;
int s[]=new int[300];
System.out.println("enter your name:");
Scanner sc=new Scanner(System.in);
name=sc.next();
System.out.println("enter your id:");
id=sc.nextInt();
System.out.println("enter two sub marks:");
for(int i=1;i<=2;i++)
{
	s[i]=sc.nextInt();
}
System.out.println("name:"+name);
System.out.println("id:"+id);
System.out.println("marks of two sub:"+s[1]+"\t"+s[2]);
int total=0,avg;
for(int i=1;i<=2;i++)
{
total=total+s[i];	
}
avg=total/2;
System.out.println("Total:"+total);
System.out.println("Average:"+avg);
}
public static void main(String[] args)
{
int n;
System.out.println("no. of students:");	
Scanner sc=new Scanner(System.in);
n=sc.nextInt();

for(int i=1;i<=2;i++)
{
System.out.println("Stu:"+i);

A e=new A();
e.get();
}
}
}
