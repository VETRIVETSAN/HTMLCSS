import java.util.Scanner;
class gthree
{
	static Scanner sc=new Scanner(System.in);

	{
		

		System.out.println("enter the value of a:");
		int a= sc.nextInt();


		System.out.println("enter the value of a:");
		int b= sc.nextInt();


		System.out.println("enter the value of c:");
		int c= sc.nextInt();


		int result=(a>b && a>c)? a:(b>c)?b:c;
		System.out.println(result +": is grater");




	}



}
