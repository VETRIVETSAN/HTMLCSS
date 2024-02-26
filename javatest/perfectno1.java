import java.util.Scanner;
class perfectno1
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter the number");
		int number=sc.nextInt();
		int sum=0;

		for (int i=1;i<number;i++ )
		{
			if (number% i==0)
			{
				sum=sum+i;
			}
			if (sum==number)
			{
				System.out.println("the number:"+number+"is:perfect");
			}
			else
			{
				System.out.println("the number:"+number+"is:not perfect");
			}
		}
	}
}
//output
enter the number
2
the number:2is:not perfect
