import java.util.*;
class  vowel
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		System.out.println("enter the character....");
		char ch=sc.next().charAt(0);

		switch (ch)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':{
			System.out.println(ch+" is a vowel");
			break;}
		
		default :System.out.println(ch+" not a vowel");
		
		}
		
	}
}
