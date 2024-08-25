import java.util.*;
class A3
{
	public static void main (String ar[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("1.Add no");
		System.out.println("2.Sub no");
		System.out.println("3.Multiply no");
		System.out.println("4.Divide no");
		System.out.println("Enter your choice");
		int x=sc.nextInt();
		if(x>=1&&x<=4)
		{
			System.out.println("Enter no");
         	int y=sc.nextInt();
         	int z=sc.nextInt();
	switch(x)
	 {
			
		 case 1:
		 System.out.println("Add="+(y+z));
		 break;
		 case 2:
		 System.out.println("Sub="+(y-z));
		 break;
		 case 3:
		 System.out.println("Multi="+(y*z));
		 break;
		 case 4:
		 System.out.println("Div="+(y/z));
		 break;
	 }
		}
		else
		{
			System.out.println("invalid choice");
		}
	}
	
}