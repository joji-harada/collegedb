package testing;

import java.io.File;
import java.io.FileNotFoundException;

//import college.Course;
//import college.Major;
//import college.Rank;
import college.Student;
//import college.Title;
import list.ArrayList;
import utility.Filter;
import utility.List;

public class FileWriter {
	
	
	public static void main(String[] args) throws FileNotFoundException{
		
		String readFrom = 
				File.separator + "Users" + File.separator + "admin" + 
				File.separator + "Documents" +
				File.separator + "csc143" + File.separator + "f19" + 
				File.separator + "Students-01.txt";
		
		Filter obj = new Filter();
		obj.read(readFrom);
		
		String fileLocation = 
				File.separator + "Users" + File.separator + "admin" + 
				File.separator + "Documents" +
				File.separator + "csc143" + File.separator + "f19" + 
				File.separator + "College.txt";
		
		String fileLocation2 = 
				File.separator + "Users" + File.separator + "admin" + 
				File.separator + "Documents" +
				File.separator + "csc143" + File.separator + "f19" + 
				File.separator + "AlphaCollege.txt";
		
		String fileLocation3 = 
				File.separator + "Users" + File.separator + "admin" + 
				File.separator + "Documents" +
				File.separator + "csc143" + File.separator + "f19" + 
				File.separator + "AgeCollege.txt";
		
		String fileLocation4 = 
				File.separator + "Users" + File.separator + "admin" + 
				File.separator + "Documents" +
				File.separator + "csc143" + File.separator + "f19" + 
				File.separator + "Over25College.txt";
		
		String fileLocation5 = 
				File.separator + "Users" + File.separator + "admin" + 
				File.separator + "Documents" +
				File.separator + "csc143" + File.separator + "f19" + 
				File.separator + "Under25College.txt";
		
		String fileLocation6 = 
				File.separator + "Users" + File.separator + "admin" + 
				File.separator + "Documents" +
				File.separator + "csc143" + File.separator + "f19" + 
				File.separator + "DeansList.txt";
		
		String fileLocation7 = 
				File.separator + "Users" + File.separator + "admin" + 
				File.separator + "Documents" +
				File.separator + "csc143" + File.separator + "f19" + 
				File.separator + "Probation.txt";
		
		String fileLocation8 = 
				File.separator + "Users" + File.separator + "admin" + 
				File.separator + "Documents" +
				File.separator + "csc143" + File.separator + "f19" + 
				File.separator + "Freshmen.txt";
		
		String fileLocation9 = 
				File.separator + "Users" + File.separator + "admin" + 
				File.separator + "Documents" +
				File.separator + "csc143" + File.separator + "f19" + 
				File.separator + "Sophomores.txt";
		
		String fileLocation10 = 
				File.separator + "Users" + File.separator + "admin" + 
				File.separator + "Documents" +
				File.separator + "csc143" + File.separator + "f19" + 
				File.separator + "Juniors.txt";
		
		String fileLocation11 = 
				File.separator + "Users" + File.separator + "admin" + 
				File.separator + "Documents" +
				File.separator + "csc143" + File.separator + "f19" + 
				File.separator + "Seniors.txt";
		
		
		
		obj.write(fileLocation);
		obj.alphabeticalOrder(fileLocation2);
		obj.ageOrder(fileLocation3);
		obj.filterOver25(fileLocation4);
		obj.filterUnder25(fileLocation5);
		obj.deansList(fileLocation6);
		obj.probation(fileLocation7);
		obj.freshman(fileLocation8);
		obj.sophomore(fileLocation9);
		obj.junior(fileLocation10);
		obj.senior(fileLocation11);
		
//		
//		
//		*!*!*!*!*COMMENTED CODE BELOW WAS TESTING I CONDUCTED ALONG THE CODING PROCESS*!*!*!*!*
//		
//		
//		ArrayList<Student> list = new ArrayList<Student>();
//		
//		Student omar = new Student.Builder()
//				.setName("Omar Osman")
//				.setAge(23)
//				.setRank(Rank.JUN)
//				.setMajor(Major.CSC)
//				.setCourse(new Course(Title.CSC, 3.9))
//				.setCourse(new Course(Title.PHYS, 4.0))
//				.setCourse(new Course(Title.MATH, 3.9))
//				.build();
//
//
//		Student george = new Student.Builder()
//				.setName("George Allison")
//				.setAge(27)
//				.setRank(Rank.JUN)
//				.setMajor(Major.CSC)
//				.setCourse(new Course(Title.CSC, 4.0))
//				.setCourse(new Course(Title.PHYS, 3.3))
//				.setCourse(new Course(Title.MATH, 3.2))
//				.build();
//
//		Student jasmine = new Student.Builder()
//				.setName("Jasmine Evans")
//				.setAge(21)
//				.setRank(Rank.JUN)
//				.setMajor(Major.CSC)
//				.setCourse(new Course(Title.CSC, 3.9))
//				.setCourse(new Course(Title.ENG, 3.6))
//				.setCourse(new Course(Title.MATH, 3.4))
//				.build();
//		
//		list.add(george);
//		list.add(george);
//		list.add(omar);
//		list.add(jasmine);
//		
//		System.out.println(list);
//		
//		list = removeDuplicates(list);
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		System.out.println(list);
//		
		
		
//		File readFile = new File(readFrom);
//		Scanner input = new Scanner(readFile);
//		
//		ArrayList<Student> students = new ArrayList<Student>();
//		while(input.hasNext()) {			
//			String nameString = input.next();
//			
//		}
//		
//		input.close();
//		
//		
//
//		Student omar = new Student.Builder()
//				.setName("Omar Osman")
//				.setAge(23)
//				.setRank(Rank.JUN)
//				.setMajor(Major.CSC)
//				.setCourse(new Course(Title.CSC, 3.9))
//				.setCourse(new Course(Title.PHYS, 4.0))
//				.setCourse(new Course(Title.MATH, 3.9))
//				.build();
//
//
//		Student george = new Student.Builder()
//				.setName("George Allison")
//				.setAge(27)
//				.setRank(Rank.JUN)
//				.setMajor(Major.CSC)
//				.setCourse(new Course(Title.CSC, 4.0))
//				.setCourse(new Course(Title.PHYS, 3.3))
//				.setCourse(new Course(Title.MATH, 3.2))
//				.build();
//
//		Student jasmine = new Student.Builder()
//				.setName("Jasmine Evans")
//				.setAge(21)
//				.setRank(Rank.JUN)
//				.setMajor(Major.CSC)
//				.setCourse(new Course(Title.CSC, 3.9))
//				.setCourse(new Course(Title.ENG, 3.6))
//				.setCourse(new Course(Title.MATH, 3.4))
//				.build();
//
//
//		List<Student> list = new ArrayList<Student>();
//				list.add(omar);
//				list.add(jasmine);
//				list.add(george);
				
//				list.
				
//				String fileLocation = 
//						File.separator + "Users" + File.separator + "admin" + 
//						File.separator + "Documents" +
//						File.separator + "csc143" + File.separator + "f19" + 
//						File.separator + "College.txt";
//
//				File file = new File(fileLocation);
//				
//				PrintStream writer = new PrintStream(file);
//				if(file.exists()) {
//					for(int i = 0; i < students.size(); i++) {
//						writer.println(students.get(i).toFile() + "\n");
//					}
//				}
//				writer.close();
				
				
		
//		writer.println("Finnegan Bean, 24, FRESHMAN, CSC, ENG=3.7, CSC=3.1, PHYS=3.9");
//		writer.println("Juniper Bean, 24, SOPHOMORE, ASTR, PHYS=3.4, CSC=2.8, ENG=3.9");
//		writer.println("Michael Wang, 24, JUNIOR, ENG, PHYS=3.3, MATH=3.6, ENG=2.9");
				
//				String s = "Hello, World! 3 + 3.0 = 6 ";
//
//			      // create a new scanner with the specified String Object
//			      Scanner scanner = new Scanner(s);
//
//			      // find the next token and print it
//			      System.out.print("" + scanner.next());
//
//			      // find the next token and print it
//			      System.out.println("" + scanner.next());
//
//			      // close the scanner
//			      scanner.close();
		
		
		
	}
}
