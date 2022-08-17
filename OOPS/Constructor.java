package com.Ranjeet;

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorP obj=new ConstructorP("Ranjeet12","RanjeetRajbhar", 100000);
		ConstructorP.companyname="Capgemini";
		System.out.println(ConstructorP.companyname);
		System.out.println(obj.empid+" "+obj.empname+" "+obj.salary);
		ConstructorP obj1=new ConstructorP("Rajn123","Rajneesh", 200000);
		System.out.println(obj1.empid+" "+obj1.empname+" "+obj1.salary);
	}

}
