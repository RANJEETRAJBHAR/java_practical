import java.util.Scanner;

public class const_demo {

	public static void main(String[] args) {
		const_demo obj1=new const_demo();
		obj1.Switch();
	
	}
	public void Switch() {
		fun_grea_fac_evod obj=new fun_grea_fac_evod();
     Scanner sc=new Scanner (System.in);
     int choice;   
     
     System.out.println("enter a choice");
     choice=sc.nextInt();
     switch(choice)
     {
     case 1: 
    	 obj.greater();
     break;
     case 2: 
    	 obj.fact();
    	 break;
     case 3:
    	 obj. even_odd();
    	 break;
}
	}
	
}
