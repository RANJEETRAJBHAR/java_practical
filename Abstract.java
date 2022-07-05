package com.ranjeet;

import java.util.Scanner;

public abstract class Abstract {
   Scanner sc=new Scanner(System.in);
	    public abstract void Demo();
	    public  void Student()
	    {
	    	int sum=0;
	    	System.out.println("Enter a Name:");
	    	String name=sc.next();
	    	System.out.println("Enter a Roll_no :");
	    	String roll_no=sc.next();
	    	System.out.println("Enter a array size");
	    	int num=sc.nextInt();
	    	int[] a = new int[num];
	    	System.out.println("Enter a five subject marks");
	    	for(int i = 0;i<num;i++)
	    	{
	    		a[i]=sc.nextInt();
	    	sum=sum+a[i];
	    	}
	    	int Grade=sum*100/500;
	    	System.out.println("The percentage are:"+Grade);
	    	if(Grade<100 && Grade>=80)
	    	{
	    		System.out.println("the Grade is A :");
	    	}
	    	else if(Grade<70 && Grade>=60)
	    	{
	    		System.out.println("The Grade is B :");
	    	}
	    	else if(Grade<50 && Grade>=35)
	    	{
	    		System.out.println("The Grade is C :");
	    		
	    	}
	    	else
	    	{
	    		System.out.println("You are fail");
	    	}
	    	
	    }
		
}
