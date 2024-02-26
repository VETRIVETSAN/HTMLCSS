class p5 
{
	public static void main(String[] args)throws Exception 
	{
		int n=5;
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n ;j++)
			{
				Thread.sleep(100);
				if (true)
				{
					System.out.print(i+" ");
				}
			
			else
			{
				System.out.print(" ");
			}
			}

		}
		System.out.println();
	}
}
