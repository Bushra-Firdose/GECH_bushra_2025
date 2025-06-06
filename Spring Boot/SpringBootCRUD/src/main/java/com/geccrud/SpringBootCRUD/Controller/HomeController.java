package com.geccrud.SpringBootCRUD.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.geccrud.SpringBootCRUD.dto.StudentDTO;
import com.geccrud.SpringBootCRUD.models.Student;
import com.geccrud.SpringBootCRUD.service.StudentService;



@Controller 
public class HomeController{
	private final StudentService studentServices;


	public HomeController(StudentService studentServices) {
		super();
		this.studentServices = studentServices;
	}



	@GetMapping({"","/"})
	public String getAllStudents(Model model) {
		List<Student> students= studentServices.getAllStudents();
		model.addAttribute("students",students);
		return "students";
	}
	@GetMapping("/add-student")
	public String addStudent(Model model) {
		StudentDTO studentDTO =new StudentDTO();
		model.addAttribute("studentDTO",studentDTO);
		return "add_student";
		
	}
	
	@PostMapping("/add-student")
	public String saveStudent(@ModelAttribute StudentDTO studentDTO) {
		studentServices.saveStudent(studentDTO);
		return "redirect:/";
		
		
	}
	@GetMapping("/edit-student")
	public String getStudent(@RequestParam Long id, Model model) {
		Student student = studentServices.getStudent(id);
		Student studentDTO = new Student();
		studentDTO.setFname(student.getFname());
		studentDTO.setLname(student.getLname());
		studentDTO.setEmail(student.getEmail());
		studentDTO.setPhone(student.getPhone());
		studentDTO.setAddress(student.getAddress());
		model.addAttribute("studentDTO",studentDTO);
		model.addAttribute("student",student);
		return "edit_student";
			
		
	}
	
	@PostMapping("edit-student")
	public String updateStudent(@ModelAttribute StudentDTO studentDTO ,@RequestParam Long id) {
		studentServices.updateStudent(studentDTO,id);
		return "redirect:/";
	}
	
	@GetMapping("delete-student")
	public String deleteStudent(@ModelAttribute StudentDTO studentDTO ,@RequestParam Long id) {
		studentServices.deleteStudent(studentDTO,id);
		return "redirect:/";
	}
	
	
}