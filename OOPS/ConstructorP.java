package com.Ranjeet;

public class ConstructorP {
	String empid;
	String empname;
	int salary;
	static String companyname;
	 protected ConstructorP(String empid,String empname,int salary)
	{
		this.empid=empid;
		this.empname=empname;
		this.salary=salary;
		companyname=companyname;
	}
}
