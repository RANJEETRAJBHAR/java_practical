import java.util.Scanner;

public class fun_even_odd_pos_neg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       even_odd();
       pos_neg();
	}
  public static void even_odd()
  {
	  Scanner sc = new Scanner (System.in);
	  int n;
	  System.out.println("Enter two Number ");
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
   public static void pos_neg()
   {
	   Scanner sc = new Scanner (System.in);
	   int num;
	   System.out.println("Enter a number ");
	   num=sc.nextInt();
	   if(num>0)
	   {
		   System.out.println(num+" is a positive number");
	   } 
	   else
	   {
		   System.out.println("is a negative number");
	   }
   }
}
