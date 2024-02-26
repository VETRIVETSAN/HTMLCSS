import java.util.*;
class sandy
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("enter the number");
		int num=sc.nextInt();
		int count=0;

		if (num==0||num==1)
		{
			System.out.println("neither  number is prime or composite number");
		}

		else
			for (int i=1;i<=num;i++)
		{
			if(num%1==0)
			{
			count++;
			}
		}

		if (count==2)
		{
			System.out.println("this is prime number");
		}
		else
		{
			System.out.println("this is composite number");
		}
		

		



	}
}
