package com.ass1.java;

public class StudentTesting {

	
	public static void main(String[] args) {
		
		Student student = new Student();
			        
		    student.setname("sowmi");
	        
		    student.setregno(22);
		    
		    student.setclgname("JJCET");
		    
		    student.setpercen(92.4f);
	        

			System.out.println("name : "+student.getname()+", regno : "+student.getregno());
			
            System.out.println("clgname : "+student.getclgname()+", percen : "+student.getpercen());
		}

}
