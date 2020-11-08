package com.Ecommerce.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Ecommerce.Entity.Category;
import com.Ecommerce.Repository.CategoryRepository;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	CategoryRepository categoryRepository;
	
	@GetMapping("/")
	public List<Category> getAllCategory()
	{
		
		List<Category> CategoryList=categoryRepository.findAll();
		System.out.println("Category list"+CategoryList.toString());
		return CategoryList;
		
		
		
	}
	
	@PostMapping("/")
	public void AddCategory(@RequestBody Category category)
	{
	  categoryRepository.save(category);
	  
	}
	
	@GetMapping("/{Id}")
	public Category getCategoryById(@PathVariable("Id") int Id)
	{
		Optional<Category> optional=categoryRepository.findById(Id);
		Category category=optional.get();
		return category;
	}
	
	

}
