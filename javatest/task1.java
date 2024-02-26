import java.util.*;
class task1
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("enter your id");
		int id=sc.nextInt();

		sc.nextLine();

		System.out.println("enter your name");
		String nam=sc.nextLine();

		System.out.println("enter your phone no");
		long phno=sc.nextLong();

		sc.nextLine();

		System.out.println("enter your college name");
		String clgnum=sc.nextLine();



		System.out.println("entered your id:"+id);
		System.out.println("entered your name:"+nam);
		System.out.println("entered your phone no:"+phno);
		System.out.println("entered your college name:"+clgnum);

	}


}