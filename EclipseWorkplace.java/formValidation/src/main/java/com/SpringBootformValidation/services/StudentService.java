package com.SpringBootformValidation.services;

import java.awt.im.InputContext;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.SpringBootformValidation.dto.StudentDto;
import com.SpringBootformValidation.models.Student;
import com.SpringBootformValidation.repository.StudentRepository;


@Service
public class StudentService {
	
	private final StudentRepository studentRepository;

	// Constructor Injection
	public StudentService(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	// Fetch all students from the database and map them to DTOs
	public List<Student> getAllStudents() {
		List<Student> students = studentRepository.findAll();
		return students;
	}

	// Save a student to the database
	public void saveStudent(StudentDto studentDto) {
		//to get image and is original name at time
		MultipartFile image = studentDto.getImage();
		Date createdAt = new Date();
		String storeImageName = createdAt.getTime()+"_"+image.getOriginalFilename();
		
		//to store image in public/images directory
		try {
			String uploadDir = "public/images/";//dir to which we need to save images
			Path uploadPath =Paths.get(uploadDir);//convert the above string into actual path
			if(!Files.exists(uploadPath)) {//checks whether dir exists or not , if not it will create that dir
				Files.createDirectories(uploadPath);
			}
			// the above code only creates the dir but to get uploaded image to be saved in that dir and the backend db we use following code
			try {
				InputStream inputStream = image.getInputStream();
				Files.copy(inputStream , Paths.get(uploadDir+storeImageName),StandardCopyOption.REPLACE_EXISTING);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		Student student = new Student();
		student.setName(studentDto.getName());
		student.setEmail(studentDto.getEmail());
		student.setAge(studentDto.getAge());
		student.setPassword(studentDto.getPassword());
		student.setImagepath(storeImageName);
		studentRepository.save(student);
	}

	//Delete the student from database
	public void deleteStudent(Long id) {
		//whenever we create the object Student it will call optional object so to fetch all details from optional class we use get() method
		Student student = studentRepository.findById(id).get();
		//for deleting any student first we need to  delete that student image path first
		String uploadDir ="public/images/";
		Path imagePath = Paths.get(uploadDir+student.getImagepath());
		try {
			Files.delete(imagePath);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		studentRepository.delete(student);
	}

	//Edit the student 
	public StudentDto editStudent(Long id) {
		Student student = studentRepository.findById(id).get();
		StudentDto studentDto = new StudentDto();
		studentDto.setName(student.getName());
		studentDto.setAge(student.getAge());
		studentDto.setEmail(student.getEmail());
		studentDto.setPassword(student.getPassword());
		return studentDto;
		
	}
	
	//Update the student
	public void updateStudent(StudentDto studentDto, Long id) {
		//before update the image ,we need to check that is old image selected or not and then need to delete it before upd
		Student student = studentRepository.findById(id).get();
		if(!studentDto.getImage().isEmpty()) {//deleting the old image
			Path oldImagePath =Paths.get("public/images/"+student.getImagepath());
			try {
				Files.delete(oldImagePath);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			//Getting new images after deleting old image 
			MultipartFile image = studentDto.getImage();
			Date createdAt = new Date(0);
			String storeImageName = createdAt.getTime()+"_"+image.getOriginalFilename();
			String uploadDir ="public/images/";
			// the above code only creates the dir but to get uploaded image to be saved in that dir and the backend db we use following code
			try {
				InputStream inputStream = image.getInputStream();
				Files.copy(inputStream , Paths.get(uploadDir+storeImageName),StandardCopyOption.REPLACE_EXISTING);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			student.setImagepath(storeImageName);	
			
		}
		student.setName(studentDto.getName());
		student.setAge(studentDto.getAge());
		student.setEmail(studentDto.getEmail());
		student.setPassword(studentDto.getPassword());
		studentRepository.save(student);
	}
	
	


}