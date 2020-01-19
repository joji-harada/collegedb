package college;

import java.text.DecimalFormat;

import list.ArrayList;
import utility.List;
import utility.Comparable;

public class Student implements Comparable<Student>{
	private final String name;
	private final int age;
	private final Rank rank;
	private final Major major;
	private final List<Course> courses;

	public Student(String name, int age, Rank rank, Major major, List<Course> courses) {
		this.name = name;
		this.age = age;
		this.rank = rank;
		this.major = major;
		this.courses = courses;
	}
	
	public Student(Builder builder) {
		this.name = builder.name;
		this.age = builder.age;
		this.rank = builder.rank;
		this.major = builder.major;
		this.courses = builder.courses;
	}

	public int age() {
		return age;
	}
	
	public static int compareAge(Student s1, Student s2) {
		if(s1.age() != s2.age()) {
			return s1.age() - s2.age();
		} else if(s1.lastName().compareTo(s2.lastName()) != 0){
			return s1.lastName().compareTo(s2.lastName());
		} else if(s1.firstName().compareTo(s2.firstName()) != 0) {
			return s1.firstName().compareTo(s2.firstName());
		} else {
			return compareGPA(s1, s2);
		}
	}

	public static int compareFirstName(Student s1, Student s2) {
		if(!s1.firstName().equals(s2.firstName())) {
			return s1.firstName().compareTo(s2.firstName());
		} else {
			return s1.lastName().compareTo(s2.lastName());
		}
	}
	
	public static int compareGPA(Student s1, Student s2) {
		if(s1.gpa() > s2.gpa()) {
			return 1;
		} else if(s1.gpa() < s2.gpa()) {
			return -1;
		} else {
			return 0;
		}
	}
	
	public int compareTo(Student other) {
		if(lastName().compareTo(other.lastName()) != 0) {
			return lastName().compareTo(other.lastName());
		}else if (firstName().compareTo(other.firstName()) != 0) {
			return firstName().compareTo(other.firstName());
		}else if (compareGPA(this, other) != 0) {
			return compareGPA(this, other);
		} else {
			return age - other.age;
		}
	}
	
	public boolean compareCourses(List<Course> courses) {

		for(int i = 0; i < this.courses.size(); i++) {
			if(this.courses.get(i).equals(courses.get(i))) {
				return true;
			}
		}
		return false;
	}
		
	public List<Course> courseList(){
		return courses;
	}
	
	public String courses() {
		return courses.toString();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s = (Student) obj;
			
			return 	this.name().equals(s.name()) &&
					this.age() == s.age() &&
					this.rank.equals(s.rank) &&
					this.major.equals(s.major) &&
					this.compareCourses(s.courses);
		}
		return false;
	}
	
	public String firstName() {
		String[] names = name.split(" ");
		String firstName = names[0];
		return firstName;
	}
	
	public double gpa() {
		List<Course> info = courses;
		Course course;
		double gpa = 0.0;
		int count = 0;
		
		for(int i = 0; i < info.size(); i++) {
			course = info.get(i);
			gpa += course.gpa();
			count++;
		}
		return gpa / count;
	}
	
	public boolean isOnDeansList() {
		if (this.gpa() >= 3.6) {
			return true;
		}
		return false;
	}
	
	public boolean isOnProbation() {
		if (this.gpa() < 2.0) {
			return true;
		}
		return false;
	}
	
	public String lastName() {
		String[] names = name.split(" ");
		String lastName = names[1];
		return lastName;
	}
	
	public Major major() {
		return major;
	}
	
	public String name() {
		return name;
	}
	
	public Rank rank() {
		return rank;
	}
	
	public String toFile() {
		String deansList;
		String probation;
 
		if(this.isOnDeansList() == false) {
			deansList = "No";
		} else {
			deansList = "Yes";
		}
		
		if(this.isOnProbation() == false) {
			probation = "No";
		} else {
			probation = "Yes";
		}
		return  "Name: " + name + ", " +
				"Age: " + age + ", " +
				"Rank: " + rank + ", " +
				"Major: " + major + ", " +
				"Courses: " + courses + ", " +
				"Deans List: " + deansList + ", " +
				"Probation: " + probation + ", ";
	}
	
	public String toString() {
		DecimalFormat df2 = new DecimalFormat("0.00");
		String deansList;
		String probation;
 
		if(this.isOnDeansList() == false) {
			deansList = "No";
		} else {
			deansList = "Yes";
		}
		
		if(this.isOnProbation() == false) {
			probation = "No";
		} else {
			probation = "Yes";
		}
		return  "Name: \t\t" + name + "\n" +
				"Age: \t\t" + age + "\n" +
				"Rank: \t\t" + rank + "\n" +
				"Major: \t\t" + major + "\n" +
				"Course \t\t" + "Score" + "\n" +
				"-----------------------" + "\n" +
				courses.get(0) + "\n" +
				courses.get(1) + "\n" +
				courses.get(2) + "\n" +
				"-----------------------" + "\n" +
				"Cum. GPA: \t" + df2.format(this.gpa()) + "\n" +
				"Deans List: \t" + deansList + "\n" +
				"Probation: \t" + probation + "\n";
	}
	
	public void printStatus() {
		System.out.print("Student class");
	}
	
	public static class Builder{
		private String name;
		private int age;
		private Major major;
		private Rank rank;
		private List<Course> courses;
		
		public Builder() {
			this.name = null;
			this.age = 0;
			this.major = Major.CSC;
			this.rank = Rank.FRESH;
			this.courses = new ArrayList<Course>();
		}
		
		public Builder setAge(int age) {
			this.age = age;
			return this;
		}
		
		public Builder setCourse(Course course) {
			this.courses.add(course);
			return this;
		}
		
		public Builder setCourses(List<Course> courses) {
			this.courses = courses;
			return this;
		}
		
		public Builder setMajor(Major major) {
			this.major = major;
			return this;
		}
		
		public Builder setName(String name) {
			this.name = name;
			return this;
		}
		
		public Builder setRank(Rank rank) {
			this.rank = rank;
			return this;
		}
		
		public Student build() {
			Student student = new Student(this);
			return student;
		}
	}
}




