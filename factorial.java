package logic2;
import java .util.Scanner;
public class fact
{
public static void main(String[] args) {
	int f=1,i,n;
	System.out.println("enter value of n:");
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	
	for(i=1;i<=n;i++)
	{
		f=f*i;
	}
	System.out.println("fact is:"+f);
	
	
	
	
	
}
	
	
}
