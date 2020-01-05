package Pkg1;

import java.util.Scanner;

public class Day4Assignment1 {
	//(((((x1-x2)*x3)-x4)+x5)/x6)
	
		public int sub(int x1,int x2)
		{
			
			int sub;
			sub=x1-x2;
			return sub;
			}
		
		public int mul(int x1,int x2)
		{
			int mul;
			mul=x1*x2;
			System.out.println("Multiply result = "+ mul);
			return mul;
		}
		public int sum(int x1,int x2)
		{
		int sum;
		sum=x1+x2;
		System.out.println("Sum result = "+ sum);
		return sum;
	}
	public void div(int x1,int x2)
	{
		int div;
		div=x1/x2;
		System.out.println("Final Result of (((((x1-x2)*x3)-x4)+x5)/x6)="+div);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Input value for X1");
		int X1=sc.nextInt();
		System.out.println("X1 value =" + X1);
		System.out.println("Input value for X2");
		int X2=sc.nextInt();
		System.out.println("X2 value =" + X2);
		System.out.println("Input value for X3");
		int X3=sc.nextInt();
		System.out.println("X3 value =" + X3);
		System.out.println("Input value for X4");
		int X4=sc.nextInt();
		System.out.println("X4 value =" + X4);
		System.out.println("Input value for X5");
		int X5=sc.nextInt();
		System.out.println("X5 value =" + X5);
		System.out.println("Input value for X6");
		int X6=sc.nextInt();
		System.out.println("X6 value =" + X6);
		sc.close();
		System.out.println("Result of Equation");
		Day4Assignment1 ans=new Day4Assignment1();
		int sub=ans.sub(X1, X2);
		System.out.println("First Sub result="+ sub);
		int mul=ans.mul(sub, X3);
		int sub1=ans.sub(mul,X4);
		System.out.println("Secon Sub result="+sub1);
		int sum=ans.sum(sub1,X5);
		ans.div(sum, X6);
	}
		
}
	


