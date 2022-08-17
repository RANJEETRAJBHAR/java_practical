package com.Ranjeet;
//abstraction
import java.util.Scanner;

public class hello extends Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     hello h=new hello();
     h.palindrome();
     h.add();
	}

	@Override
	public void palindrome() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num,sum=0,rem = 0;
		System.out.println("enter two number");
		num=sc.nextInt();
		while(num>0)
		{
			num=rem/10;
			sum=sum*10+rem;
			num=num/10;
		}
		if(num==sum)
		{
			System.out.println("IS a palindrome number");
		}
		else
		{
			System.out.println("IS not a palindrome number");
		}
	}

}
