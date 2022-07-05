package com.ranjeet;

import java.util.Scanner;

public  class Abstract1 extends Abstract {
	Scanner sc=new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub   
		Abstract1 obj=new Abstract1();
		obj.Student();
	}
	
	@Override
	public void Demo() {
		// TODO Auto-generated method stub
		
	}
		public  void palindrom()
		{
			int n = 12,sum=0,rem ;
			while(n>0)
			{
				rem=n%10;
				sum=sum*10+rem;
				n=n/10;
			}
			System.out.println("the reverse number is:"+sum);
		}
	
	
}
	



