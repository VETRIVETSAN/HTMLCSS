import java.util.*;
class prime1
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("enter the number");
		int num=sc.nextInt();
		int count=0;

		if (num==0||num==1)
		{
			System.out.println("neither prime nor composit");
		}
		else 
		{
			for (int i=1;i<=num;i++ )
			{
				if (num%i==0)
				{
					count++;
				}
			}



			if (count==2)
			{
				System.out.println("prime number");
			}
			else
			{
				System.out.println("composit number");
			}
		}

	}
}