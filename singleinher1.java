import java.util.Scanner;

public class singleinher1 extends Singleinher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		palinndrom();
		
	}
	public static void swap() 
	{
    Scanner sc=new Scanner(System.in);
	int a,b;
    System.out.println("enter two number");
    a=sc.nextInt();
    b=sc.nextInt();
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("a:"+a);
    System.out.println("b:"+b);
	}
	public static void add()
	 {
		int n1,n2,res;
		System.out.println("Enter two number");
		 Scanner sc= new Scanner (System.in);
		 n1=sc.nextInt();
		 n2=sc.nextInt();
		 res=n1+n2;
		 System.out.println("the result is "+res);
	 }
}
