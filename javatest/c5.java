import java.util.Scanner;
class c5
{
	static Scanner sc= new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("enter your number");
		int number=sc.nextInt();


		String result=(number %2 ==0)?"Even ":"Odd";
		System.out.println("the number"+number+"is"+result);
	}
}