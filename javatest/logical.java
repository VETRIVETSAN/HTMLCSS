class logical
{
	public static void main(String[]args)
	{
		System.out.println(5==5 && 5==5);//true
		System.out.println(5==5 && 6==5);//false


		System.out.println(5==5 || 6==5);//true
		System.out.println(5>=5 || 6<5);//true


		System.out.println(true && (false==false));//true
		System.out.println(false && (false==false));//false

		System.out.println(!(5>10));//true
		System.out.println(!(5<10));//false

		System.out.println(false &&(false==false)|| true);//true
		System.out.println(false &&(false==false)|| false);//false


	}



}
