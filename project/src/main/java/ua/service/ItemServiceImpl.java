package ua.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.entity.CatName;
import ua.entity.Item;
import ua.repository.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemRepository itemRepository;
	@Override
	public List<Item> findAll(){
		return itemRepository.findAll();
	}
	@Override
	public void save(String name) {
	Item item = new Item();
    item.setName(name);
 	itemRepository.save(item);		
	}
	@Override
	public void delete(int id) {
		itemRepository.delete(id);
	}
	//@Override
//	public void save(CatName catName) {
//		
//	}
//	@Override	
//	public Item findByName(String name) {
//		return itemRepository.findByName(name);
//		
//	}
}
