import java.util.Scanner;

public class fun_grea_fac_evod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      greater();
      fact();
      even_odd();
	}
	public static void greater()
	{
		Scanner sc=new Scanner (System.in);
		int n1,n2,n3;
		System.out.println("Enter three number");
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		if(n1>n2 && n1>n3)
		{
			System.out.println( n1+" is a greater number");
		}
		else if(n2>n1 && n2>n3)
		{
			System.out.println(n2+" is a greather number ");
		}
		else
		{
			System.out.println(n3+" is a greater number");
		}
		
	}
	public static void fact()
	{
		Scanner sc=new Scanner (System.in);
		int fact=1;
		System.out.println("enter a number");
		int n =sc.nextInt();
		for (int i=1;i<=n;i++)
		{
		fact=fact*i;
	}
		System.out.println("Factorial"+n+" is:"+fact);
	

}
	public static void even_odd()
	{
		Scanner sc = new Scanner (System.in);
		  int n;
		  System.out.println("Enter a Number ");
		  n=sc.nextInt();	  
		  if(n%2==0)
		  {
			  System.out.println("is a even number");
		  }
		  else
		  {
			  System.out.println("is a odd number");
		  }
		  
	}
}
