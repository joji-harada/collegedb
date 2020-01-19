package utility;

import college.Major;

import college.Rank;
import college.Student;
import college.Title;
import list.ArrayList;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;


import college.Course;

public class Filter {
	private ArrayList<Student> data;
	
	public Filter() {
		data = new ArrayList<Student>();
	}
	
	public void alphabeticalOrder(String location) throws FileNotFoundException {
		Batch.quickSort(data);
		write(location);
	}
	
	public void ageOrder(String location) throws FileNotFoundException {
		Batch.selectionSort(data, Student::compareAge);
		write(location);
	}
	
	public void deansList(String location) throws FileNotFoundException {
		File file = new File(location);
		PrintStream output = new PrintStream(file);
		Batch.quickSort(data);
		
		if(file.exists()) {
			for(int i = 0; i < data.size(); i++) {
				if(data.get(i).isOnDeansList()) {
					output.println(data.get(i));
				}
			}
		}
		output.close();		
	}
	
	public void probation(String location) throws FileNotFoundException {
		File file = new File(location);
		PrintStream output = new PrintStream(file);
		Batch.quickSort(data);
		
		if(file.exists()) {
			for(int i = 0; i < data.size(); i++) {
				if(data.get(i).isOnProbation()) {
					output.println(data.get(i));
				}
			}
		}
		output.close();		
	}
	
	public void filterOver25(String location) throws FileNotFoundException {		
		File file = new File(location);
		PrintStream output = new PrintStream(file);
		Batch.quickSort(data);
		
		if(file.exists()) {
			for(int i = 0; i < data.size(); i++) {
				if(data.get(i).age() < 25) {
					output.println(data.get(i));
				}
			}
		}
		output.close();	
	}
	
	public void filterUnder25(String location) throws FileNotFoundException {	
		File file = new File(location);	
		PrintStream output = new PrintStream(file);
		Batch.quickSort(data);
		
		if(file.exists()){
			for(int i = 0; i < data.size(); i++) {
				if(data.get(i).age() < 25) {
					output.println(data.get(i));
				}
			}
		}		
		output.close();
	}
	
	public void freshman(String location) throws FileNotFoundException{
		File file = new File(location);	
		PrintStream output = new PrintStream(file);
		Batch.quickSort(data);
		
		if(file.exists()){
			for(int i = 0; i < data.size(); i++) {
				if(data.get(i).rank().equals(Rank.FRESH)) {
					output.println(data.get(i));
				}
			}
		}		
		output.close();
	}
	
	public void junior(String location) throws FileNotFoundException{
		File file = new File(location);	
		PrintStream output = new PrintStream(file);
		Batch.quickSort(data);
		
		if(file.exists()){
			for(int i = 0; i < data.size(); i++) {
				if(data.get(i).rank().equals(Rank.JUN)) {
					output.println(data.get(i));
				}
			}
		}		
		output.close();
	}
	
	public Course makeCourse(String str) throws IllegalArgumentException {
		String[]	info	= str.split("=");
		Title		prefix	= Title.valueOf(info[0]);
		double 		gpa		= Double.valueOf(info[1]);
		return new Course(prefix, gpa);
	}
	
	public Student parse(String line) throws IllegalArgumentException {
		String[]	info	= line.split(", ");
		String 		name	= info[0];
		int			age		= Integer.parseInt(info[1]);
		Rank		rank	= Rank.valueOf(info[2]);
		Major		major	= Major.valueOf(info[3]);
		Course 		course1	= makeCourse(info[4]);
		Course 		course2	= makeCourse(info[5]);
		Course 		course3	= makeCourse(info[6]);
		
		return new Student.Builder()
						.setName(name)
						.setAge(age)
						.setRank(rank)
						.setMajor(major)
						.setCourse(course1)
						.setCourse(course2)
						.setCourse(course3)
						.build();
	}
	
	public void read (String location) throws FileNotFoundException {
		String readFrom = location;
		File readFile = new File(readFrom);
		Scanner input = new Scanner(readFile);
		
		while(input.hasNext()) {
			String nameString = input.nextLine();
			Student nextStudent = parse(nameString);
			
			if(!data.contains(nextStudent)) {
				data.add(parse(nameString));
			}
		}
		
		input.close();
		
	}
	
	public void senior(String location) throws FileNotFoundException{
		File file = new File(location);	
		PrintStream output = new PrintStream(file);
		Batch.quickSort(data);
		
		if(file.exists()){
			for(int i = 0; i < data.size(); i++) {
				if(data.get(i).rank().equals(Rank.SEN)) {
					output.println(data.get(i));
				}
			}
		}		
		output.close();
	}
	
	public void sophomore(String location) throws FileNotFoundException{
		File file = new File(location);	
		PrintStream output = new PrintStream(file);
		Batch.quickSort(data);
		
		if(file.exists()){
			for(int i = 0; i < data.size(); i++) {
				if(data.get(i).rank().equals(Rank.SOPH)) {
					output.println(data.get(i));
				}
			}
		}		
		output.close();
	}
	
	public void write (String location) throws FileNotFoundException {		
		String fileLocation = location;
		File file = new File(fileLocation);
		
		PrintStream writer = new PrintStream(file);
		if(file.exists()) {
			for(int i = 0; i < data.size(); i++) {
				writer.println(data.get(i).toString() + "\n");
			}
		}
		writer.close();
	}
	
	public void writeCS (String location) throws FileNotFoundException {
		String fileLocation = location;
		File file = new File(fileLocation);
		
		PrintStream writer = new PrintStream(file);
		if(file.exists()) {
			for(int i = 0; i < data.size(); i++) {
				writer.println(data.get(i).toFile() + "\n");
			}
		}
		writer.close();
	}
	
}
