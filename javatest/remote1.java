import java.util.*;
class remote1
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("1.power of\n2.power on\n3.remote on\n4.remote off\n5.mute");
		System.out.println("select the button");
		int button=sc.nextInt();

		if (button==1)
		{
			System.out.println("power of");
		}
		else if(button==2)
		{
			System.out.println("power on");
		}

		else if(button==3)
		{
			System.out.println("remote on");

		}
		else if(button==4)
		{
			System.out.println("remote of");

		}
		else if(button==5)
		{
			System.out.println("mute");
		}
		else
		System.out.println("\t\t\tinvalid input");					

					

	
	}
}
