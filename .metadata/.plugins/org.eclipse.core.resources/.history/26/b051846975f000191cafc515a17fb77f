package co.edu.unilibre.stock.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unilibre.stock.entity.Teacher;
import co.edu.unilibre.stock.repository.ITeacherRepository;
import co.edu.unilibre.stock.service.ITeacherService;

@Service
public class TeacherService implements ITeacherService{

	@Autowired
	private ITeacherRepository productRepository;
	
	@Override
	public List<Teacher> getAllList() {
		return productRepository.findAll();
	}

	@Override
	public Teacher getById(Long id) {
		return productRepository.findById(id).get();
	}
	
}
