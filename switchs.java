import java.util.Scanner;

public class switchs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner (System.in);
     int num=13;
     switch (num) {
     case 1 : 
    	 System.out.println("January");
    	 break;
     case 2 :
    	 System.out.println("febuary");
         break;
     case 3 : 
    	 System.out.println("March");
    	 break;
     case 4 : 
        	 System.out.println("April");
        	 break;
     case 5 : 
    	 System.out.println("May");
    	 break;
     case 6 : 
    	 System.out.println("June");
    	 break;
     case 7 : 
    	 System.out.println("july");
    	 break;
     case 8 : 
    	 System.out.println("august");
    	 break;
     case 9 : 
    	 System.out.println("September");
    	 break;
     case 10 : 
    	 System.out.println("Octobar");
    	 break;
     case 11 : 
    	 System.out.println("November");
    	 break;
     case 12 : 
    	 System.out.println("December");
    	 break;
    	 default:
    		 System.out.println("not a month");
    		 
     }
	}

}
