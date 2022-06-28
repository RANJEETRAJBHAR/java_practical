import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swapping obj=new Swapping();
		obj.swap();
		obj.swapp();
	}
	public static void swap()
	{
		Scanner sc= new Scanner (System.in);
		int num1=40,num2=12,t;
		t=num1;
		num1=num2;
		num2=t;
		System.out.println("num1:"+num1);
		System.out.println("num2:"+num2);
		
	}
   public static void swapp()
   {
	   int a=40,b=12;
	   a=a+b;
	   b=a-b;
	   a=a-b;
	   System.out.println("a:"+a);
	   System.out.println("b:"+b);
	   
   }
   
	   
   
}
