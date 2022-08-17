package com.Ranjeet;

public class Constructor1 {
	String empid;
	String empname;
	int salary;
	static String companyname;
	Constructor1(String empid,String empname,int salary)
	{
		this.empid=empid;
		this.empname=empname;
		this.salary=salary;
		companyname=companyname;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor1 obj=new Constructor1("Ranjeet12","RanjeetRajbhar", 100000);
		Constructor1.companyname="Tcs";
		System.out.println(companyname);
		System.out.println(obj.empid+" "+obj.empname+" "+obj.salary);
		Constructor1 obj1=new Constructor1("Rajn123","Rajneesh", 200000);
		System.out.println(obj1.empid+" "+obj1.empname+" "+obj1.salary);

	}

}
