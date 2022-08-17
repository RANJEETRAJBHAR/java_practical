package com.Ranjeet;

public class Student {
  
	int Rollno;
	int Scanner=10;
	String Name;
	Student s1;
	Student(){
		
	}
	Student(int rollno,String name){
		
	}
	
	void Setrollno(int r)
	{
		Rollno=r;
	}
	public void Setname(String a)
	{
		Name=a;
	}
	public int Getrollno()
	{
		return Rollno ;
	}
	public String Getname()
	{
		return Name ;
		
	}
	public void setStudent(Student s)
	{
     s1=s;
	}
	public Student getStudent() {
		return s1;
	}
}
