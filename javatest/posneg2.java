import java.util.*;
class posneg2
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)throws Exception
	{
		System.out.println("enter the number");
		int number=sc.nextInt();
		System.out.println("processing");
		Thread.sleep(1000);
		if (number>=0)
		{
			System.out.println(number+":is a positive number");
		}
		else
		{
			System.out.println(number+":is a negative number");
		}



	}
}