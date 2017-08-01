package login;
import java.util.Scanner; 
public class loginmain
{

void regn()
{
Scanner s=new Scanner(System.in);
System.out.println("enter your regn details..");
System.out.println("enter your first name:");
String fn=s.next();
System.out.println("enter your last name:");
String ln=s.next();
System.out.println("enter your age:");
int a=s.nextInt();
System.out.println("your regn is success..");
System.out.println("ur details are:..");
System.out.println("firstname:"+fn);
System.out.println("last name:"+ln);
System.out.println("age:"+a);
	
}
public static void main(String[] args)
{
loginmain l=new loginmain();
l.regn();
Scanner s=new Scanner(System.in);
String username,pwd;
username="abc";
pwd="123";
System.out.println("username:"+username);
System.out.println("password:***");
System.out.println("login page..");
System.out.println("enter your username:");
String USERNAME=s.next();
System.out.println("enter your password:");
String PWD=s.next();
if(USERNAME.equals(username) && PWD.equals(pwd))
{
	System.out.println("login success..");
	
}
else
{
	System.out.println("invalid login id..");
}
}
}
