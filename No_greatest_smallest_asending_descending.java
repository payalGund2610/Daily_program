package Function;

import java.util.Scanner;

public class No_greatest_smallest_asending_descending 
{
	static int i,j,cal=0,size=20;
	static int num[]=new int[size];
	static void Accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("how many numbers you wants:");
		size=sc.nextInt();
		System.out.println("Enter your numbers: ");
		for(i=0;i<size;i++)
		{
			num[i]=sc.nextInt();
		}
	}
	static void Display()
	{
		for(i=0;i<size;i++)
		{
			System.out.println("Numbers are:"+num[i]);
		}
	}
	static void Greatest_No()
	{
		cal=num[0];
		for(i=0;i<size;i++)
		{
			
			if(num[i]>cal)
			{
				cal=num[i];
			}
		}
		System.out.println("Greatest Number is : "+cal);
	}
	static void Smallest_No()
	{
		cal=num[0];
		for(i=0;i<size;i++)
		{
			
			if(num[i]<cal)
			{
				cal=num[i];
			}
		}
		System.out.println("Smallest number is : "+cal);
	}
	static void Ascending_No()
	{
		int temp;
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(num[i]>num[j])
				{
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.println("Numbers in ascending oredr: ");
		for(i=0;i<size;i++)
			System.out.print("\t"+num[i]);
		System.out.println();
	}
	static void Descending_No()
	{
		int temp;
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(num[i]<num[j])
				{
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.println("Numbers in descending oredr: ");
		for(i=0;i<size;i++)
			System.out.print("\t"+num[i]);
		System.out.println();
	}
	public static void main(String[] args) 
	{
		Accept();
		Display();
		Greatest_No();
		Smallest_No();
		Ascending_No();
		Descending_No();
	}

}
