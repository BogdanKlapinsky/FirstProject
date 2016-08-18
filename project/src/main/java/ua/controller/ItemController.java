package ua.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.service.ItemService;;
//рефактор JSP
//як підключити гілку
//
@Controller
public class ItemController {
	@Autowired
	private ItemService itemService;
	@RequestMapping("/admin/addItemName")
	public String show(Model model){
		model.addAttribute("item", itemService.findAll());
		return "adminAddItemName";
		}
	@RequestMapping(value="/admin/addItemName", method=RequestMethod.POST)
	public String save(@RequestParam String name){
		itemService.save(name);
		return "redirect:/addCatNAme/addItemName";
	}
	@RequestMapping("/admin/addItemName/delete/{id}")
	public String delete(@PathVariable int id){
		itemService.delete(id);
		return "redirect:/admin/addItemName";
	}
}
