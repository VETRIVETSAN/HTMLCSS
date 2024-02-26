import java.util.*;
class App2 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("\t\t\twelcome to my application");
		System.out.println("1.student id\n2.laptop detail\n3.exit");
		int input=sc.nextInt();

		switch(input)
		{
			case 1:{
				System.out.println("select the id");
				System.out.println("1.id-36\n2.id-248\n3.id-406");
				int user_select=sc.nextInt();

				switch (user _select)
				{
				case 1 : {
					System.out.println("student name :dingi\n mark :402\n yop:2020");
					break;}
				case 2:{
					System.out.println("student name :dinga\n mark :356\n yop:2021");
					break;}

				case 3:{
					System.out.println("student name :mango\n mark :499\n yop:2023");
					break;}

				default:{System.out.println("input mismatch");
					break;}

				}

			case 2:{
				System.out.println("selact laptop brand");
				System.out.println("1.dell\n2.asus\n3.hp");
				int userselect=sc.nextInt();

				switch (userselect)
				{
				case 1 : {
					System.out.println("\tdell laptop deatails\nstorage is 1000gp\nram is 8gb\nprocesser is i3\price is 30000");
					break;}
				case 2:{
					System.out.println("\tasus laptop deatails\nstorage is 1000gp\nram is 8gb\nprocesser is i3\price is 30000")
					break;}

				case 3:{
					System.out.println("student name :mango\n mark :499\n yop:2023");
					break;}

				default:{System.out.println("input mismatch");
					break;}


				
				}


		}
		
	}
}
