import java.util.Scanner;

public class Singleinher {
	static int num,rem,sum=0,num1;
	

    public static void palinndrom()
    {
    	Scanner sc=new Scanner (System.in);
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
        	System.out.println("is a Palindrome number ");
        	
        }
        else
        {
        	System.out.println("is not a palindrome number");
        }
    }
        
}

