import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     int n,rem,sum=0,c;
     System.out.println("Enter a Number ");
     n=sc.nextInt();
     c=n;
     while (n>0) {
    	 
    	 rem=n%10;
    	 sum=sum+rem*rem*rem;
    	 n=n/10;
     }
    	 if(c==sum)
    	 {
    		System.out.println(c+"is a Armstrong number"); 
    	 }
    	 else
    	 {
    	System.out.println("is not Armstrong number");	 
    	 }
    	 
     }
	}


