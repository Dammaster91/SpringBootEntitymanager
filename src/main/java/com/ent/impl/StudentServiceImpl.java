package com.ent.impl;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ent.entity.Student;
import com.ent.service.StudentService;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	private EntityManager entityManger;

	public Student saveStudent(Student student) {
		entityManger.persist(student);
		return student;
	}

	public Student updateStudent(Student student) {
		entityManger.merge(student);
		return student;
	}

	public Student deleteStudent(Student student) {
		if (entityManger.contains(student)) {
			entityManger.remove(student);
		} else {
			entityManger.remove(entityManger.merge(student));
		}

		return student;
	}

	public Student getStudent(int id) {
		Student response = (Student) entityManger.find(Student.class, id);
		return response;
	}

}