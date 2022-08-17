package com.Ranjeet;

public class VoidMethod {
	String empid;
	String empname;
	int salary;
	static String companyname;
	
	public void VoidMethod (String empid,String empname,int salary)
	{
		this.empid=empid;
		this.empname=empname;
		this.salary=salary;
		companyname=companyname;
	}
	public void VoidMethod1 (String empid,String empname,int salary)
	{
		this.empid=empid;
		this.empname=empname;
		this.salary=salary;
		companyname=companyname;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     VoidMethod obj=new VoidMethod();
     VoidMethod.companyname="ACCENTURE";
     System.out.println(companyname);
     obj.VoidMethod("Ranj123", "RanjeetRajbhar", 100000);
     System.out.println(obj.empid+" "+obj.empname+" "+obj.salary);
     VoidMethod obj1=new VoidMethod();
     obj1.VoidMethod("Raj123", "RajneeshTiwari", 200000);
     System.out.println(obj1.empid+" "+obj1.empname+" "+obj1.salary);
	}

}
