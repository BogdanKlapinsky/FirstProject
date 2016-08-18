package ua.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
//	item.setCatName(name);
//	itemRepository.save(catName);		
	}
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
