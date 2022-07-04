import java.util.Scanner;

public class Poly {
	public void poly1(int num1,int num2,int num3)
	{
		Scanner sc=new Scanner(System.in);
		if(num1>num2 && num1>num3)
		{
			System.out.println(num1+" Is a greatest number:");
			
		}
		else if(num2>num1 && num2>num3)
		{	
			System.out.println(num2+ " Is a greatest number");
		}else
		{
			System.out.println(num3+" Is a greatest number");
			 
		}
	}
	public void poly1(int num1,int num2)
	{
		Scanner sc= new Scanner (System.in);
		int t;
		t=num1;
		num1=num2;
		num2=t;
		System.out.println("num1:"+num1);
		System.out.println("num2:"+num2);
		

		   
	}
	public void poly1(int num1)
	{
		int n=num1,sum=0,rem ;
		while(n>0)
		{
			rem=n%10;
			sum=sum*10+rem;
			n=n/10;
		}
		System.out.println("the reverse number is:"+sum);
	}
	public static void main(String[]args) {
		Poly p=new Poly();
		p.poly1(55,44,33);
		Poly p1=new Poly();
		p1.poly1(80, 90);
		Poly p2=new Poly();
		p2.poly1(12);
	}
	

}
