
public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int c=5;
      for ( int i=1;i<=5;i++) 
      {
    	for (int j=1;j<i;j++)
    	{
    		System.out.print(" ");
    	}
    	for (int k=5-i;k>=i;k--) {
    		System.out.print(k);
    	}
    	 System.out.println();
      }
     
	}

}
