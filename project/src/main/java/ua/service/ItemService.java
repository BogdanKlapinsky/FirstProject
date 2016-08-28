package ua.service;
import java.util.List;

import ua.entity.Item;
import ua.form.ItemForm;
public interface ItemService {
	void save(String name);

	List<Item> findAll();

	void delete(int id);

	void save(ItemForm form);
	
}
