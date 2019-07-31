package com.trial;


   class  Parent  {
	void m1()  {
		System.out.println("1000");
	
	}
	void m2() {
		System.out.println("500");
	}
	
}

  class  Child extends Parent   {
	      void m1() {
		System.out.println("2000");
	}
	      static void main(String[] args) {
	    	  System.out.println("hello rakesh");
	    	
	
 
		Child  p1 =new Child  ();
			
		p1.m1();
		p1.m2();
	      }
  }
		
		
	
 
 


