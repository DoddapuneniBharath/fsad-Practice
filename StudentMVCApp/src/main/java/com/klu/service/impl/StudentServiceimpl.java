package com.klu.service.impl;

import java.util.List;
import java.util.ArrayList;
import com.klu.model.Student;
import com.klu.service.StudentService;

import org.springframework.stereotype.Service;

@Service
public class StudentServiceimpl implements StudentService{
private List<Student> studentList=new ArrayList<>();
//welcome
@Override
public String getWelcomeMessage() {
	return "Welcome to Student MVC Srud Application";
}
//create 
@Override
public Student createStudent(Student student) {
	studentList.add(student);
	return student;
}
//read - get by ID
@Override
public Student getStudentById(int id) {
	for(Student s: studentList) {
		if(s.getId()==id) {
			return s;
		}
	}
	return null;
}
//read - get all
@Override
public List<Student> getAllStudents(){
	return studentList;
}
//update
@Override
public Student updateStudent(int id, Student student) {
	for(int i=0;i<studentList.size();i++) {
		if(studentList.get(i).getId()==id) {
			student.setId(id);
			studentList.set(i, student);
			return student;
		}
	}
	return null;
}
//delete
@Override
public String deleteStudent(int id) {
	for(Student s:studentList) {
		if(s.getId()==id) {
			studentList.remove(s);
			return "Student record deleted successfully";
		}
	}
	return "no student record found";
}
@Override
public List<Student> searchStudent(String name) {
	// TODO Auto-generated method stub
	return null;
}
}
