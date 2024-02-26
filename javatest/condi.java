import java.util.Scanner;
class condi
{
	static Scanner ammu=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter number");
		int num=ammu.nextInt();
		String res=(num>0)? " is positive no" :" is negative no";

		System.out.println(num + res);
	}
}
