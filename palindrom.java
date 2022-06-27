import java.util.Scanner;

public class palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner (System.in);
      int num ,rem,sum=0, num1;
      System.out.println("Enter a Number");
      num=sc.nextInt();
      num1=num;
      while(num>0)
      {
    	  rem=num%10;
    	  sum=sum*10+rem;
    	  num=num/10;
      }
     if(num1==sum) 
     {
    	 System.out.println("Is a palindrom number");
     } 
     else 
     {
    	 System.out.println("Is not a palindrom number");
     }
      }
	}


