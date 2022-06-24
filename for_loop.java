import java.util.Scanner;

public class for_loop {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner (System.in); 
     System.out.println("Enter a number");
     int n=sc.nextInt(); 
     int m=sc.nextInt();
    for( int i=n;i>=m;i--) {
			System.out.println(i);
		}
 
	

	}
}
