import java.util.Scanner;
class armstrong
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("enter the num");
		int num=sc.nextInt();
		int count=0;
		int product=1;
		int sum=0;
		int temp=num;
		int last=0;

		while (num!=0)
		{
			num/=0;
			count++;
		}
		num=temp;
		while (num>0)
		{
			last=num%10;
			for (int i=1;i<=count ;i++)
			{
				product=product*last;
			}
			sum= sum+product;
			product=1;
			num/=10;			  
		}
			String res=(temp==sum)?"armstrong":"not armstrong";
			System.out.println(res);

	}
}