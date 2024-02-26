import java.util.*;
class strong
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("enter the number");
		int num=sc.nextInt();
		int sum=0;
		int fact=1;
		int temp=num;
		int last=0;

		while (num>0)
		{
			last=num%10;
			for (int i=last;i>=1;i-- )
			{
				fact*=i;
			}
			sum+=fact;
			fact=1;
			num/=10;

		}
		String res=(temp==sum)?"Strong no":"not strong no";
		System.out.println(res);
	}
}//output
enter the number
145
Strong no
