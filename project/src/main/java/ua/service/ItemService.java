package ua.service;
import java.util.List;

import ua.entity.Item;
public interface ItemService {
	void save(String name);

	List<Item> findAll();

	void delete(int id);
	
}
