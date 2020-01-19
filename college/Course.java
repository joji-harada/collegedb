package college;


import java.text.DecimalFormat;

import utility.Comparable;

public class Course implements Comparable<Course>{
	private Title course;
	private double gpa;
	
	public Course() {
		course = Title.CSC;
		gpa = 2.0;
	}
	
	public Course(Course other) {
		this.course = other.course;
		this.gpa = other.gpa;
	}
	
	public Course(Title course, double gpa) {
		this.course = course;
		this.gpa = gpa;
	}
	
	public int compareTo(Course other) {//!!!!
		String str1 = this.course.toString();
		String str2 = other.course.toString();
		
		if(str1.compareTo(str2) == 0) {
			return 0;
		} else {
			return str1.compareTo(str2);
		}
	}
	
	public Title course() {
		return course;
	}
	
	public boolean equals(Object other) {
		if(other instanceof Course) {
			Course s = (Course) other;
			return 	this.course.equals(s.course) &&
					this.gpa == s.gpa;
		}
		return false;
	}
	
	public double gpa() {
		return gpa;
	}
	
	public void setCourse(Title course) {
		this.course = course;
	}
	
	public void setGPA(double gpa) {
		this.gpa = gpa;
	}
	
	public String toFile() {
		return course + "=" + gpa;
	}
	
	public String toString() {
		DecimalFormat df2 = new DecimalFormat("0.00");
		return course + " \t" + df2.format(gpa);
	}
	
}
