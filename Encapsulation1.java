package com.rajneesh;

import java.util.Scanner;

public class Encapsulation1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Second s=new Second();
    System.out.println("Enter a roll no:");
    int roll=sc.nextInt();
    sc.nextLine();
    System.out.println("Enter name:");
    String name=sc.nextLine();
    System.out.println("Enter the size of array:");
    int size=sc.nextInt();
    int[] arr=new int[size];
    System.out.println("Enter the marks:");
    for(int i=0;i<arr.length;i++)
    {
    	arr[i]=sc.nextInt();
    }
   s.setNameRoll(roll,name,arr);		
	System.out.println(s.roll_no());
	System.out.println(s.names());
	System.out.println(s.percentage());
	}

}
