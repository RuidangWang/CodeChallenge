package com.newjob.beans;

import java.util.ArrayList;
import java.util.List;

public class StudentRegistration {

	//private List& lt; Student& gt;
	private List<Student> studentRecords;
	private static StudentRegistration stdregd = null;
	private StudentRegistration() {
		studentRecords = new ArrayList<Student>();
	}
	
	public static StudentRegistration getInstance() {
		if (stdregd == null) {
			stdregd = new StudentRegistration();
			return stdregd;
		}
		else
		{
			return stdregd;
		}
	}
	
	public void add(Student std) {
		studentRecords.add(std);
	}
	
	public String upDateStudent(Student std) {
		for (int i=0; i<studentRecords.size(); i++) {
			Student stdn = studentRecords.get(i);
			if (stdn.getRegistrationNumber().equals(std.getRegistrationNumber()))
				studentRecords.set(i,  std);
			    return "Update successful";
		}
		return "Update un-successful";
	}
	
	public String deleteStudent(String registrationNumber) {
		
		for (int i=0; i<studentRecords.size(); i++) {
			Student stdn = studentRecords.get(i);
			if (stdn.getRegistrationNumber().equals(registrationNumber)) {
					studentRecords.remove(i);
					return "Delete Successful";
			}
		}
		return "Delete unsuccessful";
	}
	
	public List<Student> getStudentRecords(){
		return studentRecords;
	}
}

	