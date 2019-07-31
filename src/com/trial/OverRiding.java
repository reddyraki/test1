package com.trial;

 class Child5 {
	 
			void m1()  {
				System.out.println("1000");
			
			}
			void m2() {
				System.out.println("500");
			}
			
		}

		  class OverRiding extends Child5    {
		      void m1() {
					System.out.println("2000");
				}
			      
			   
			         
			    	  void m3() {
			    		  
							System.out.println("50000");
						}
			    	public static void main(String[] args) {
						
				
					    	  System.out.println("hello rakesh");
					    	  OverRiding  p1 =new OverRiding  ();
					
				p1.m1();
				p1.m2();
				p1.m3();
				
			      }
		  }
				


