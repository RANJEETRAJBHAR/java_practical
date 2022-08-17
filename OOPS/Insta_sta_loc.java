package com.Ranjeet;

import java.util.Scanner;

public class Insta_sta_loc {
static int a;
int b,d;
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int c ;
		System.out.println("local number");
		c=sc.nextInt();
	System.out.println("Static number");
	a=sc.nextInt();
	Insta_sta_loc obj=new Insta_sta_loc();
	System.out.println("instance number");
    obj.b=sc.nextInt();
	obj.d=sc.nextInt();
	}
	
}
