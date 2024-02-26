import java.util.*;
class marks
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter student 1 name");
		String name1=sc.nextLine();
		System.out.println("enter student 1 mark");
		int mark1=sc.nextInt();
		
		System.out.println("enter student 2 name");
		sc.nextLine();
		String name2=sc.nextLine();
		System.out.println("enter student 2 mark");
		int mark2=sc.nextInt();

		System.out.println("enter student 3 name");
		sc.nextLine();
		String name3=sc.nextLine();
		System.out.println("enter student 3 mark");
		int mark3=sc.nextInt();


		if (mark1>mark2 && mark1>mark3)
		{
			System.out.println(name1+" got highest mark");
		}
		else if (mark2>mark3)
		{
			System.out.println(name2+" got highest mark");
		}
		else
		{
			System.out.println(name3+" got highest mark");
			
		}
	}
}
