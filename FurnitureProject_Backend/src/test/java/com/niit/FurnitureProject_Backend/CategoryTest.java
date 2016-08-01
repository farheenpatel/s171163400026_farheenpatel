package com.niit.FurnitureProject_Backend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.FurnitureProject_Backend.dao.CategoryDAO;
import com.niit.FurnitureProject_Backend.model.Category;

public class CategoryTest {
	
	
	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.FurnitureProject_Backend");
		context.refresh();
		
	Category c =(Category)	  context.getBean("category");
	
	CategoryDAO categoryDAO = (CategoryDAO)  context.getBean("categoryDAO");
	

	c.setId("TAB_003");
	c.setName("Tablet");
	c.setDescription("Tablet product");
	
	
	categoryDAO.saveOrUpdate(c);
	}
}
