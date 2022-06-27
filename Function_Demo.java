import java.util.Scanner;

public class Function_Demo {
	
	public static void main(String[] args)
	{
		factorial(); // Calling 
		demo();
	
	}

	public static void demo() // Declare define
	{
		int num1,num2,res;
		Scanner sc=new Scanner(System.in);
		System.out.println("Entr two numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		res=num1+num2;
		System.out.println("The result is ="+res);
	}
	public static void factorial()
	{
		int num1,f=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Entr a numbers");
		num1=sc.nextInt();
		while(num1>0)
		{
			f=f*num1;
			num1--;
		}
		System.out.println("The factorial is ="+f);
	}
	
}
