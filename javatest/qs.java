import java.util.*;
class qs
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("\t\t\t welcome to qspadiers");
		System.out.println("select the skill");
		System.out.println("1.java\n2.sql\n3.web tech");
		int skill=sc.nextInt();

		switch (skill)
		{
		case 1 :
			{
				System.out.println(" you have  select java");
				break;
			}
		case 2:
			{
				System.out.println(" you have select sql");
				break;
			}
		case 3:
			{
				System.out.println(" you have select web tech");
				break;
			}

		default:
			{
				System.out.println("\t\t\t wrong input");
			}
			
		
		}
	
	}

}
