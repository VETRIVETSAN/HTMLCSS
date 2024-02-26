import java.util.*;
class appstore
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("\t\t\twelcome to appstore");
		System.out.println("select the app");
		System.out.println("1.qspider\n2.remote\n3.exit");
		int app=sc.nextInt();

		switch (app)
		{
		case 1:
		{
			System.out.println("\t\t\t welcome to qspadiers");
			System.out.println("select the skill");
			System.out.println("1.java\n2.sql\n3.webtech");
			int skill=sc.nextInt();

			switch (skill)
			{
			case 1:
				{
				System.out.println("you have selected java");
				break;
				}
			case 2:
				{
				System.out.println("you have selected sql");
				break;
				}
			case 3:
				{
				System.out.println("you have selected webtech");
				break;
				}
			default:
				{
				System.out.println("********input wrong*********");
				break;
				}
			
			}

		break;
		}
		
		case 2:{
			System.out.println("sony remote");
			System.out.println("select the button");
			System.out.println("1.power on\n2.power off\n3.mute");
			int button=sc.nextInt();

			switch (button)
			{
			case 1:{
				System.out.println("power on");
				break;

			}
			case 2:{
				System.out.println("power off");
				break;
			}
			case 3:{
				System.out.println("mute");
				break;
			}
			default:{
				System.out.println("wrong input");
				break;
			}
			
			}
		break;	
		}
		
		case 3:{
			System.out.println("***********thank you********");
			break;
		}
		default:
		{
			System.out.println("wrong input");
			break;
		}
		
		}

	}
}
