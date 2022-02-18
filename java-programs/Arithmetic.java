import java.io.*;
import java.util.Scanner;

class Arithmetic
{
	public static void main(String[] args)
	{
		int a,b,sum,diff,prod,quo;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();	
		b=sc.nextInt();
		sum=a+b;
		System.out.println("Sum is"+sum);
		diff=a-b;
		System.out.println("Diff is"+diff);
		prod=a*b;
		System.out.println("Prod is"+prod);
		quo=a/b;
		System.out.println("Quotient is"+quo);
	}
}