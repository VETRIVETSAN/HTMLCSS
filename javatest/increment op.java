class increment op
{
	 public static void main(String[]args)
	{
		int a=2;
		boolean res=(++a == ++a ||++a == ++a);

		int b=5;
		boolean res1=(++a >= ++a && ++b == ++a);


		System.out.println(++a +a);
		System.out.println(a);
		System.out.println(b);
	}
}
