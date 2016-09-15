package ua.service;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import ua.entity.CatName;
import ua.entity.Item;
public interface ItemService {
	//void save(CatName catName);
	List<Item> findAll()  ;
	void delete(int id)   ;
	void save(String name);	
	//Item findByName(String name);
}
