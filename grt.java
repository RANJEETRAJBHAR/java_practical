package com.Ranjeet;

import java.util.Scanner;

public class grt {
static int a,b,c;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter three number");
      a=sc.nextInt();
      b=sc.nextInt();
      c=sc.nextInt();
      if(a>b && a>c)
      {
    	  System.out.println("A is greater");
      }
      else if(b>a && b>c)
      {
    	  System.out.println("B is greater");
      }
      else
      {
    	  System.out.println("C is greater");
      }
	}

}
