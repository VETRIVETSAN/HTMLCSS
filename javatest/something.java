import java.util.*;
class something
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("enter the number");
		int n=sc.nextInt();
		int result=fristandlast(n);
		System.out.println(result);
	}
	public static int fristandlast(int number)
	{
		int last=number%10;
		while(number>9)
		{
			number=number/10;

		}
		return number+last;
	}
}