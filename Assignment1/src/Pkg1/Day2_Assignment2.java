package Pkg1;

public class Day2_Assignment2 {
	//((((10-2)+2)*2)-2)/2)
	public int Sub(int A ,int B)
	{
		int Sub;
		Sub=A-B;
		return Sub;
	}
	public int Sum(int A ,int B)
	{
		int Sum;
		Sum=A+B;
		return Sum;
	}
	public int Mul(int A , int B)
	{
		int Mul;
		Mul=A*B;
		return Mul;
	}
	public void Div(int A ,int B)
	{
		int Div;
		Div=A/B;
		System.out.println("Final Result =" + Div);
	}
	public static void main(String[] args)
	{
		Day2_Assignment2 ans = new Day2_Assignment2();
		int Sub=ans.Sub(10,2);
		System.out.println("First Substract result ="  + Sub);
		int Sum=ans.Sum(Sub,2);
		System.out.println("Summation result ="  + Sum);
		int Mul=ans.Mul(Sum,2);
		System.out.println("Multiplication result ="  + Mul);
		int Sub1=ans.Sub(Mul,2);
		System.out.println("Second Substract result ="  + Sub1);
		ans.Div(Sub1,2);
		}

}
