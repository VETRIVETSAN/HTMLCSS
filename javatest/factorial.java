import java.util.Scanner;
class factorial 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println(" enter the number");
		int number=sc.nextInt();

		int fact=1;
		for (int i=number; i>=2;i--)
		{
			fact=fact*i;
		}
		System.out.println("the factorialis:"+fact);
	}
}
																																					