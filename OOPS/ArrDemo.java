package com.Ranjeet;

import java.util.Scanner;

public class ArrDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
       int size=0;
       System.out.println("Enter a Array size ");
       size=sc.nextInt();
       int[] a=new int[size];
       int i;
       System.out.println("Enter a number");
       for(i=0;i<a.length;i++)
       {
    	   a[i]=sc.nextInt();
       }
      
       for(i=0;i<a.length;i++) {
    	   if(a[i]%7==0) {
    		   System.out.println("The number is " +a[i]+ " divisble");
    	   }
    	   
       }
	}

}
