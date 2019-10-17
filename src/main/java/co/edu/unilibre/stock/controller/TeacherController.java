package co.edu.unilibre.stock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unilibre.stock.entity.Teacher;
import co.edu.unilibre.stock.service.ITeacherService;

@RestController
public class TeacherController {
	@Autowired
	private ITeacherService productService;
	
	@GetMapping("/list")
	public List<Teacher> getList(){
		return productService.getAllList();
	}
	
	@GetMapping("/{id}")
	public Teacher getById(@PathVariable Long id) {
		return productService.getById(id);
	}
}
