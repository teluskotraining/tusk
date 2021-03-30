import java.util.Scanner;
class GreaterOfThree
{
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter three numbers : ");
			int no1=sc.nextInt();
		   	 int no2=sc.nextInt();
			int no3=sc.nextInt();
			
			if(no1>no2 && no1>no3)
			{
				System.out.println(+no1+ "is greater than" +no2+ "and" +no3);
			}
			else if(no1<no2 && no1<no3)
			{
				System.out.println(+no1+ "is less than" +no2+ "and" +no3);
			}
			
			if(no2>no1 && no2>no3)
			{
				System.out.println(+no2+ "is greater than" +no1+ "and" +no3);
			}
			else if(no2<no1 && no2<no3)
			{
				System.out.println(+no2+ "is less than" +no1+ "and" +no3);
			}
			
			if(no3>no1 && no3>no2)
			{
				System.out.println(+no3+ "is greater than" +no1+ "and" +no2);
			}
			else if(no3<no1 && no3<no2)
			{
				System.out.println(+no3+ "is less than" +no1+ "and" +no2);
			}
		}
}
