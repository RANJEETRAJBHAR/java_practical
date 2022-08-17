package com.Ranjeet;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
     // System.out.println("Enter a array size:");
      
     String[] arr=new String[2];
       System.out.println("the element are:");
       for(int i=0;i<arr.length;i++)
       {
    	   arr[i]=sc.nextLine();
       }
       System.out.println("elment stored in array are:");
       for(int i=0;i<arr.length;i++)
       {
    	 System.out.println(arr[i]);
       }
   
	}

}
