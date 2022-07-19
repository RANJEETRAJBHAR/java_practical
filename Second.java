package com.rajneesh;

public class Second {

	private int roll_no;
   public String name;
   private float per;
   private char grade;
   int marks;
   
   public void setNameRoll(int roll,String names,int arr1[])
   {
	   roll_no=roll;
	   name=names;
	   for(int i=0;i<arr1.length;i++)
	   {
		 marks+=arr1[i];
		 
	   }
	   
	   }
   public int roll_no()
   {
	   return roll_no;
   }
   public String names()
   {
	   return name;
   }
   public float percentage()
   {
	   return (marks*100)/500;
   }
	
	
}
