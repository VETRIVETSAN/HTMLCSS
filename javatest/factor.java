import java.util.Scanner;
class factor
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter the number");
		int number=sc.nextInt();
		

		for (int i=1;i<num;i++)
		{
			if (number% i==0)
			{
				System.out.println("the factor:"+i);

			}
		}
	}
}
