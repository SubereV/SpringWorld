package edu.fpt.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@GetMapping
	public String studentForm() {
		return "studentForm";
	}
	
	@PostMapping
	public String studentInfo(HttpServletRequest request, ModelMap model) {
		model.addAttribute("name", request.getParameter("name"));
		model.addAttribute("gpa", request.getParameter("gpa"));
		model.addAttribute("major", request.getParameter("major"));
		return "studentInfo";
	}
}
