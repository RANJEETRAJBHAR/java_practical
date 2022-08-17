package com.Ranjeet;

import java.util.Scanner;

public class Static {
static int a,b,res;
int c,d,res1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number");
       a=sc.nextInt();
        b=sc.nextInt();
        res=a+b;
        System.out.println("Addtion"+res);
        res=a-b;
        System.out.println("Subraction "+res);
        res=a/b;
        System.out.println("div "+res);
        res=a*b;
        System.out.println("mul "+res);
        res=a%b;
        System.out.println("mod "+res);
        
        Static s=new Static();//instance variable
        System.out.println("Enter a two  number");
        s.c=sc.nextInt();
        s.d=sc.nextInt();
             
        s.res1=s.c+s.d;
        System.out.println("add"+s.res1);
        s.res1=a-b;
        System.out.println("sub"+s.res1);
        s.res1=a*b;
        System.out.println("mul"+s.res1);
        s.res1=a/b;
        System.out.println("div"+s.res1);
        s.res1=a%b;
        System.out.println("mod"+s.res1);
        
        int e,f,res2;
        System.out.println("Enter two number");
        e=sc.nextInt();
        f=sc.nextInt();
        res2=e+f;
        System.out.println("Addtion"+res2);
        res2=e+f;
        System.out.println("Subraction "+res2);
        res2=e-f;
        System.out.println("div "+res2);
        res2=e/f;
        System.out.println("mul "+res2);
        res2=e%f;
        System.out.println("mod "+res2);
        
        
	}

}
