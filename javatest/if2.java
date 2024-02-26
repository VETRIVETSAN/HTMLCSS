import java.util.*;
class if2
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("\t\t\t select the input");
		System.out.println("1.fried rice\n2.briyani\n3.parota");
		
		int input=sc.nextInt();

		if(input==1)
		{
			System.out.println("fried rice");

		}
		else if (input==2)
		{
			System.out.println("briyani");

		}
		else if (input==3)
		{
			System.out.println("parota");
		}
		else
		{
			System.out.println("\t\t\t\t wrong input");
		}




	}
		

}
