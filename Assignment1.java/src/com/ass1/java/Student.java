package com.ass1.java;

public class Student {
	
	private String name;
	
	private String dept;
	 
	private Integer regno;
	
	private Float percen;
	
	private static String clgname;
	
	
	private final static String collegecode = "JJCET8113";
	
	 public void setname(String name) {
		   
		   this.name = name;
		   
	   }
	
	public String getname() {
		
		return name;
		
	}
	
	public void setdept(String dept) {
		   
		   this.dept = dept;
		   
	   }
	
	public String getdept() {
		
		return dept;
		
	}
	
	public void setregno(Integer regno) {
		   
		   this.regno =regno;
		   
	   }
	
	public Integer getregno() {
		
		return regno;
		
	}
	
	public void setpercen(float percen) {
		   
		   this.percen = percen;
		   
	   }
	
	public float getpercen() {
		
		return percen;
		
	}
	
	
	public void setclgname(String clgname) {
		   
		   Student.clgname = clgname;
		   
	   }
	
	public String getclgname() {
		
		return clgname;
		
	}
	
	public static String getcollegename() {
		
		return collegecode; 
		
	}
	
     public static void main(String[] args) {
		
		Student student = new Student();
		
		 student.name = "shiyam";
 
		 student.dept = "cse";
		 
		 student.regno = 21;
		 
		 student.percen = 94.23f;
		 
		 Student.clgname = "JJCET";
		 
		 System.out.println(student.name);
		 
		 System.out.println(student.dept);
		 
		 System.out.println(student.regno);
		 
		 System.out.println(student.percen);
		 
		 System.out.println(Student.clgname);
		 
		 System.out.println(Student.collegecode);  
		 
		}

	}
