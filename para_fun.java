import java.util.Scanner;

public class para_fun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		para_fun obj=new para_fun();
				obj.accept();
		
	}
	
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		int num1,num2;
		System.out.println("Enter two numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		add(num1,num2);
	}
	public void add(int n1,int n2)
	{
		int res;
		res=n1+n2;
		System.out.println("The add is ="+res);
	}

}
