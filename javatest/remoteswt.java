import java.util.*;
class remoteswt
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("select the button");
		System.out.println("1.power on\n2.power off\n3.mute");

		int button=sc.nextInt();

		switch (button)
		{
		case 1:
			{
				System.out.println("remote on");
				break;

			}
		case 2:
			{
				System.out.println("remote of");
				break;
			}
		case 3:
			{
				System.out.println("mute");
				break;

			}
		
		default:
			{
				System.out.println("\t\t\t\twrong input");
			}

		
		}
		
		
		
	}
}