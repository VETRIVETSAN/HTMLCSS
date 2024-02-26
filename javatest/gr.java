import java.util.*;
class gr
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("1.A+\n2.B+\n3.O+");
		System.out.println("enter your grade");
		int gr=sc.nextInt();

		if (gr==1)
		{
			System.out.println("A+");
		
		}

		else if(gr==2)
		{
			System.out.println("B+");
		}
		else if(gr==3)
		{
			
			System.out.println("O+");

		}
		else
		System.out.println("invalid input");			



	}
}
