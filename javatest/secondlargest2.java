import java.util.*;
class secondlargest2
{
	static Scanner sc=new Scanner(System.in);

	public static void main(String[]args)
	{
		System.out.println("enter the value of A");
		int a=sc.nextInt();

		System.out.println("enter the value of B");
		int b=sc.nextInt();

		System.out.println("enter the value of C");
		int c=sc.nextInt();


		if (a<b && a<c)
		{
			if (b<c)
			{
				System.out.println(b+":is a second largest number");
			}
			else
			{
				System.out.println(c+":is a second largest number");
			}
		}
		else if (b<c)
		{
			if (a<c)
			{
				System.out.println(a+":is a second largest number");
			}
			else
			{
				System.out.println(c+":is a second largest number");
			}
		}
		else
		{
			if (a<b)
			{
				System.out.println(a+":is a second largest number");
			}
			else
			{
				System.out.println(b+"is a second largest number");
			}
		}


	}
	
}
