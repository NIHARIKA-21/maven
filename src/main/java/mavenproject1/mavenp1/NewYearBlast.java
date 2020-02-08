package mavenproject1.mavenp1;
import java.util.ArrayList;
import java.util.Scanner;

public class NewYearBlast extends Sweets implements Chocolates
{
	public static void main(String args[])
	{
		NewYearBlast n= new NewYearBlast();
		n.gift();
	}
	public void gift()
	{
		int total_weight=0;
		ArrayList<Integer> chocolates_obj=new ArrayList<Integer>();
		ArrayList<Integer> candy_list=new ArrayList<Integer>();
		ArrayList<Integer> res_CandyList=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		int number_gifts;
		System.out.println("No of Gifts:");
		number_gifts=sc.nextInt();
		Sweets obj[]=new Sweets[number_gifts];
		for(int i=0;i<number_gifts;i++)
		{
			obj[i]=new Sweets();
			System.out.println("In Gift "+(i+1));
			System.out.println("Enter Sweet Name:");
			String Sweet_nname=sc.next();
			System.out.println("Enter number of sweets and cost of sweets ");
			int no_sweet=sc.nextInt();
			int cost=sc.nextInt();
			int sweet_weight=obj[i].Sweet_weight(no_sweet,cost);
			System.out.println("Number of chocolates present ingift "+(i+1));
			int number=sc.nextInt();
			int chocolate;
			String Chocolate_Name;
			for(int j=0;j<number;j++)
			{
				System.out.println("Enter Chocolate name:");
				Chocolate_Name=sc.next();
				System.out.println("Enter number of chocolates and weight ");
				int no_chocolate=sc.nextInt();
				int weight=sc.nextInt();
				chocolate=TotalChocolates(no_chocolate,weight);
				chocolates_obj.add(chocolate);
			}
			chocolate=0;
			for(int j=0;j<chocolates_obj.size();j++)
			{
				chocolate+=chocolates_obj.get(i);
			}
			System.out.println("Enter candy name:");
			String Candy_Name=sc.next();
			System.out.println("Enter number of candies and weight ");
			int no_candy=sc.nextInt();
			int candy_weight=sc.nextInt();
			int candies=Candy(no_candy,candy_weight);
			candy_list.add(candies);
			total_weight=(sweet_weight+chocolate+candies);
			System.out.println("Weight og gift"+(i+1)+" is "+total_weight);
			System.out.println("Enter Minimum cost for candy: ");
			int candy_lowerlimit=sc.nextInt();
			System.out.println("Enter Maximum cost for candy: ");
			int candy_upperlimit=sc.nextInt();
			for(int j=0;j<candy_list.size();j++)
			{
				int a=candy_list.get(i);
				if(a>=candy_lowerlimit && a<=candy_upperlimit)
				{
					res_CandyList.add(a);
				}
				
			}
			System.out.println("Chocolates in gift accordingg to weight are  "+chocolates_obj);
			System.out.println("Cost of candies that satisfying range are "+res_CandyList);
		}
	}
	public int TotalChocolates(int no_of_chocolates,int weight)
	{
		int total_weight=0;
		total_weight=no_of_chocolates*weight;
		return total_weight;
	}
}
