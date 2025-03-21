package com.geccrud.SpringBootCRUD.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.geccrud.SpringBootCRUD.models.Student;
import com.geccrud.SpringBootCRUD.service.StudentService;

@Controller
public class HomeController {
	
	//feild injuction
	private final StudentService studentService;
	
	//constuctor injection
    public HomeController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}



	@GetMapping({"/",""})
	public String getAllStudents(Model model) {
		List<Student> students = studentService.getAllStudents();
		System.out.printf("student",students);
		if (students == null) {
	        // handle error, redirect, etc.
	    }
		model.addAttribute("students", students);
		return "students";
	}
}