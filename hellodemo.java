import java.util.Scanner;

public class hellodemo {
 public static void main (String[]args) {
	 System.out.println("hello world");
	add(); 
	sub();
	mul();
	div();
 }
 public static void add()
 {
	 Scanner sc = new Scanner(System.in);
     
	 int a, b,res;
	 System.out.println("Enter two two Number");
	 a=sc.nextInt();
	 b=sc.nextInt();
	res=a+b;
	 System.out.println("Add is="+res);
 }

	 public static void sub()
	 {
		Scanner sc = new Scanner(System.in);
		
		int c,d,res;
		System.out.println("Enter two Number");
		c=sc.nextInt();
		d=sc.nextInt();
		res=c-d;
		System.out.println("Sub is="+res);
	 }
	 public static void mul()
	 {
		 Scanner sc = new Scanner(System.in);
		 
		 int e,f,res;
		 System.out.println("Enter two number");
		 e=sc.nextInt();
		 f=sc.nextInt();
		 res=e*f;
		 System.out.println("mul is="+res);
	 }
	 public static void div() 
	 {
	Scanner sc= new Scanner (System.in);
	int g,h,res;
	System.out.println("Enter two number");
	g=sc.nextInt();
	h=sc.nextInt();
	res=g/h;
	System.out.println("div is="+res);
	 }
 }
	
 
 
