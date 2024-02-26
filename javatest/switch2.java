import java.util.*;
class switch2
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("\t\t\t select the name");
		System.out.println("1.sandy\n2.vetri\n3.vetsan");
		int num=sc.nextInt();

		switch (num)
		{
		case 1:
			{
			
			System.out.println("sandy");
			break;
			}
		

		case 2:
			{
		
			System.out.println("vetri");
			break;
			}			

		case 3:
			{	
																	

			System.out.println("vetsan");
			break;
			}

		default:
		{

			System.out.println("\t\t\t invalid input");
		}
							
		
							
		}
	}
}
