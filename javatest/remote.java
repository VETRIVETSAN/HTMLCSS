import java.util.*;
class remote
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("1.power on\n2.power off\n3.volume +\n4.volume-\n5.mute");
		System.out.println("select the number");
		int button=sc.nextInt();

		if (button==1)
		{	
			
			System.out.println("powered on !...");	

		}

		else if (button==2)
		{
			System.out.println("powered of !...");

		}

		else if (button==3)
		{
			System.out.println("volume + !...");

		}

		else if (button==4)
		{
			System.out.println("volume - !...");
		}

		else if (button==5)
		{
			System.out.println("mute !...");
		}
		else
			System.out.println("\t\t\t koduthatha mattum type pandra....!");




	}

}
