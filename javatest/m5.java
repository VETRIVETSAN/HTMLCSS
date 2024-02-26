class m5 
{
	public static void main(String[] args) 
	{
		System.out.println("hi from main");
		dinga();
		dinga(5);
		dinga(4,true);
		dinga(4.0,true); 
		System.out.println("bye from main");
		
	}
	public static void dinga(int a,boolean b)
	{
		System.out.println("webtech:"+a+":"+b);
	}
	public static void dinga(double a,boolean b)
	{
		System.out.println("python:"+a+":"+b);
		
	}
	public static void dinga()
	{
		System.out.println("java");	
	} 
	public static void dinga(int a)
	{
		System.out.println("sql:"+a);
	}
	
}
