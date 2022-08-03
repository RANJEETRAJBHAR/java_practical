import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		greater();
	}
	public static void greater()
	{
		Scanner sc=new Scanner(System.in);
		int [] num=new int[10];  //array
		int i,temp;
		System.out.println("Enter a 10 number");
		for(i=0;i<10;i++)
		{
			num[i]=sc.nextInt();
			
		}
		temp=num[0];
		System.out.println("the number are=");
		for(i=0;i<10;i++)
		{
			System.out.println(num[i]);
		}
		for(i=0;i<10;i++)
		{
			if(temp<=num[i])
			{
				temp=num[i];
			}
		}
		System.out.println("the greater number is:"+temp);
	}

}
