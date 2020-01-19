package testing;

import college.Course;
import college.Major;
import college.Rank;
import college.Student;
import college.Title;
import list.LinkedList;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;



import list.LinkedList;
import utility.List;
import utility.Batch;

public class Test {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			if(itr.next() % 2 == 0) {
				itr.remove();
			}
		}
		
		System.out.println(list);
		
		LinkedList<Integer> clist = new LinkedList<Integer>();
		
		clist.add(1);
		clist.add(2);
		clist.add(3);
		clist.add(4);
		clist.add(5);
		clist.add(6);
		clist.add(8);
		clist.add(9);
		clist.add(10);
		
		System.out.println(clist);
		
		utility.Iterator<Integer> litr = clist.iterator();
		while(litr.hasNext()) {
			if(litr.next() % 2 == 0) {
				litr.remove();
			}
		}
		
		System.out.println(clist);
		
//		Student omar = new Student.Builder()
//									.setName("Omar Osman")
//									.setAge(23)
//									.setRank(Rank.JUN)
//									.setMajor(Major.CSC)
//									.setCourse(new Course(Title.CSC, 3.9))
//									.setCourse(new Course(Title.PHYS, 4.0))
//									.setCourse(new Course(Title.MATH, 3.9))
//									.build();
//
//	
//		Student george = new Student.Builder()
//									.setName("George Allison")
//									.setAge(27)
//									.setRank(Rank.JUN)
//									.setMajor(Major.CSC)
//									.setCourse(new Course(Title.CSC, 4.0))
//									.setCourse(new Course(Title.PHYS, 3.3))
//									.setCourse(new Course(Title.MATH, 3.2))
//									.build();
//		
//		Student jasmine = new Student.Builder()
//									.setName("Jasmine Evans")
//									.setAge(21)
//									.setRank(Rank.JUN)
//									.setMajor(Major.CSC)
//									.setCourse(new Course(Title.CSC, 3.9))
//									.setCourse(new Course(Title.ENG, 3.6))
//									.setCourse(new Course(Title.MATH, 3.4))
//									.build();
//		
//		
//		List<Student> list = new ArrayList<Student>();
//		list.add(omar);
//		list.add(jasmine);
//		list.add(george);
//		
//		System.out.println("Georges gpa: " + george.gpa());
//		System.out.println("Omars gpa: " + omar.gpa());
//		System.out.println("Jasmines gpa: " + jasmine.gpa());
//		System.out.println();
//		System.out.println("omar.gpa() > george.gpa(): " + (omar.gpa() > george.gpa()));
//		System.out.println();
		
		
//		System.out.println(Batch.indexOf(list, "Omar Osman"));
//		System.out.println(Batch.indexOf(list, "Jasmine Evans"));
//		System.out.println(Batch.indexOf(list, "George Allison"));
//		System.out.println(Batch.indexOf(list, "Arlene Ford"));
//		System.out.println();
//		System.out.println();
//		Batch.selectionSort(list, Student::compareGPA);
//		Batch.quickSort(list);
//		System.out.println(list);
	}
}
