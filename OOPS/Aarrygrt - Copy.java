package com.Ranjeet;

import java.util.Scanner;

public class Aarrygrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter a array size:");
		for(int i = 0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int temp=arr[0];
		for(int i = 0;i<arr.length;i++)
		{
		 if(temp<arr[i])
		 {
			 temp=arr[i];
		 }
		}
		System.out.println(temp);
	}

}
