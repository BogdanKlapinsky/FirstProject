package ua.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.entity.Item;
import ua.form.ItemForm;
//import ua.repository.AmountAndItemRepository;
import ua.repository.CatNameRepository;
import ua.repository.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemRepository itemRepository;
	@Autowired
	private CatNameRepository catNameRepository;
//	@Autowired
//	private AmountAndItemRepository amountAndItemRepository;
	@Override
	public List<Item> findAll(){
		return itemRepository.findAll();
	}
	Item item = new Item();
	@Override
	public void save(ItemForm form) {
	Item item = new Item();
	item.setId(form.getId());
	item.setCountryName(form.getCountryName());
	item.setCatName(form.catName);
	//item.setTime
		//item.setCatName( name);
//	itemRepository.save(catName);		
	}
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void save(String name) {
		// TODO Auto-generated method stub
		
	}

}
