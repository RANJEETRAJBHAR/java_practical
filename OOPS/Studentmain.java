package com.Ranjeet;

public class Studentmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Student s=new Student();
       s.Setrollno(147);
       s.Setname("Ranjeet");
       System.out.println(s.Getname());
       System.out.println(s.Getrollno());
       s.setStudent(s);
       System.out.println(s.getStudent());
	}

}