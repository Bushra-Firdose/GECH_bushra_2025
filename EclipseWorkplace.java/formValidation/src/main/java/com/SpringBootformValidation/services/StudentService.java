package com.SpringBootformValidation.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.SpringBootformValidation.dto.StudentDto;
import com.SpringBootformValidation.models.Student;
import com.SpringBootformValidation.repository.StudentRepository;

@Service
public class StudentService {

	private StudentRepository studentRepository;
	
	private StudentService(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
	public List<Student> getAllStudents(){
		List<Student> students = studentRepository.findAll();
		return students;
	}
	public void saveStudent(StudentDto studentDto) {
		Student student =new Student();
		student.setName(studentDto.getName());
		student.setAge(studentDto.getAge());
		student.setEmail(studentDto.getEmail());
		student.setPassword(studentDto.getPassword());
		studentRepository.save(student);
		
		
		
	}
	public void deleteStudent(Long id) {
		Student student =studentRepository.findById(id).get();
		studentRepository.delete(student);
		
	}
	public StudentDto editStudent(Long id) {
		Student student =studentRepository.findById(id).get();
		StudentDto studentDto =new StudentDto();
		studentDto.setName(student.getName());
		studentDto.setAge(student.getAge());
		studentDto.setEmail(student.getEmail());
		studentDto.setPassword(student.getPassword());
		return studentDto;
		
		
	}
	public void updateStudent(StudentDto studentDto ,Long id){
		Student student =studentRepository.findById(id).get();
		student.setName(studentDto.getName());
		student.setAge(studentDto.getAge());
		student.setEmail(studentDto.getEmail());
		student.setPassword(studentDto.getPassword());
		studentRepository.save(student);

	}

}
