package Pkg1;

import java.util.Scanner;

public class Day4Assignment2 {
	
	int a,b,c,d,e,f;
		public Day4Assignment2()
		{
			Scanner S= new Scanner(System.in);
			System.out.println("Enter X1 value : ");
			this.a = S.nextInt();
			System.out.println("Enter X2 value : ");
			this.b = S.nextInt();
			System.out.println("Enter X3 value : ");
			this.c = S.nextInt();
			System.out.println("Enter X4 value : ");
			this.d = S.nextInt();
			System.out.println("Enter X5 value : ");
			this.e = S.nextInt();
			System.out.println("Enter X6 value : ");
			this.f = S.nextInt();
			S.close();
		}
		public int sum(int a, int b)
		{
			int sum_result;
			sum_result = a+b;
			return sum_result;
		}
		public int sub(int a, int b)
		{
			int sub_result;
			sub_result = a-b;
			return sub_result;
		}
		public void multiply(int a, int b)
		{
			int sum_result = this.sum(this.a,this.b);
			int sub_result = this.sub(sum_result, this.c);
			int sum_result2 = this.sum(sub_result, this.d);
			int multi_result = sum_result2*this.e;
			this.divide(multi_result, this.f);
		}

		public void divide(int a,int b)
		{
			int div_result = a/b;
			System.out.println("Final result is :"+div_result);
		}
		public static void main(String[] args)
		{
			Day4Assignment2 obj1 = new Day4Assignment2();
			obj1.multiply(obj1.a, obj1.b);
		}
			}
	


