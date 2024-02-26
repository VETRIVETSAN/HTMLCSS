import java.util.*;
class apps1
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("\t\t\t vanakkam apps");
		System.out.println("select the apps");
		System.out.println("1.mobile phone\n2.qspider\n3.exit");
		int apps1=sc.nextInt();


		switch (apps1)
		{

		case 1:
				{

				System.out.println("\t\t\t welcome to porvika");
				System.out.println("choice your fav mobile");
				System.out.println("1.apple phone\n2.redmi\n3.realme");
				int mobile=sc.nextInt();

		switch (mobile)
				{

			case 1:
					{
					
						System.out.println("you have select apple phone");
						break;
					}

			case 2:
					{
						System.out.println("you have select redmi phone");
						break;
					}
			case 3:
					{
						System.out.println("you have select realme phone");
						break;
					}
			default:
					{
						System.out.println("\t\t\t wrong input");
					}
				
				}

			break;
					}

			case 2:
						{
						System.out.println("\t\t\t welcome to qspaiders");
						System.out.println(" select the skill");
						System.out.println("1.java\n2.sql\n3.web tech");
						int skill=sc.nextInt();

			switch (skill)
							{
			case 1:
						{
							
							System.out.println("you have select of java");
							break;
						}
			case 2:
						{
							System.out.println("you have select of sql");
							break;
						}

			case 3:
						{
							System.out.println("you have select of web tech");	
							break;
						}
			default:
						{
								System.out.println("\t\t\t wrong input");
						}
						
							
				}
				break;
						}

			case 3:
				{

					System.out.println("\t\t\t thank.......you");
					
				break;
				}
				
				

			default:
				{

					System.out.println("\t\t\t wrong inout");

				}


		}
			
					


	}

}
