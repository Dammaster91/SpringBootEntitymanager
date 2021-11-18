package com.ent.service;

import com.ent.entity.Student;

public interface StudentService {
	public Student saveStudent(Student student);

	public Student deleteStudent(Student student);
	
	public Student updateStudent(Student student);

	public Student getStudent(int id);

}