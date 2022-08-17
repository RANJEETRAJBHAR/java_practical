package com.Ranjeet;

public class MainMethod  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Method obj=new Method();
	     Method.companyname="ACCENTURE";
	     System.out.println(Method.companyname);
	     obj.VoidMethod("Ranj4524", "RanjeetRajbhar", 200000);
	     System.out.println(obj.empid+" "+obj.empname+" "+obj.salary);
	     Method obj1=new Method();
	     obj1.VoidMethod("Raj4525", "RajneeshTiwari", 300000);
	     System.out.println(obj1.empid+" "+obj1.empname+" "+obj1.salary);
	     VoidMethod obj2=new VoidMethod();
	     obj2.VoidMethod("Shub25", "ShubhamPawar", 200000);
	     System.out.println(obj2.empid+" "+obj2.empname+" "+obj2.salary);
	     VoidMethod obj3=new VoidMethod();
	     obj3.VoidMethod("Roh5454", "RohitSingh", 200000);
	     System.out.println(obj3.empid+" "+obj3.empname+" "+obj3.salary);
	     VoidMethod obj4=new VoidMethod();
	     obj4.VoidMethod("mus1209", "MuskanShaikh", 200000);
	     System.out.println(obj4.empid+" "+obj4.empname+" "+obj4.salary);

	}

}
