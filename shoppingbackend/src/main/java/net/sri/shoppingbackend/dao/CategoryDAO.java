package net.sri.shoppingbackend.dao;

import java.util.List;

import net.sri.shoppingbackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	
	Category get(int id);
	
}
