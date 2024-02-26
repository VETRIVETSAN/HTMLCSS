import java.util.*;
class scan 
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.println("\t\t\twelcome to Qspiders!..");
		System.out.println("select the skill");
		System.out.println("1.java\n2.sql\n3.webtech");

		int skill=sc.nextInt();
		

		switch (skill)
		{
		case 1 :
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
				System.out.println("invalid input!...");
				break;
			
			}
		
		}

	}
}
