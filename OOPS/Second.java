package com.Ranjeet;


public class Second {

	private int roll_no;
   public String name;
   private float per;
   private String grade;
   int marks,avg;
   
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
	   avg =(marks*100)/500;
	   return avg;
   }
 public void getGrade()
 {
	
	 if(avg>=90 && avg<100)
	 {
		System.out.println("A+");
	 }
	 else if(avg>=70 && avg<80)
	 {
	 System.out.println("A");
	 }
	 else if(avg>=60 && avg<70)
	 {
		 System.out.println("B");
	 }
	 else if(avg>=50 && avg<60)
	 {
		 System.out.println("C");
	 }
	 else if(avg>=35 && avg<50 )
	 {
		 System.out.println("D");
	 }
	 else 
	 {
		 System.out.println("Fail");
	 }
	

}
}