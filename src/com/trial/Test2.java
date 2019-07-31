package com.trial;

public class Test2 {
	String studentName ="rakeshReddy";
	String collegeName ="brillant";
	String salary ="50000";
	
	void raki(){
		System.out.println("he is a good boy");
		  
	}
}
  class Test1 extends Test2 {
	  String studentName ="KAITHA RakeshReddy";
	  
	  public static void main(String[] args) {
		  Test1 p= new Test1();
		
		  	  
		System.out.println(p.studentName);
		System.out.println(p.collegeName);
		System.out.println(p.salary);
		p.raki();
	}
	 
 }