package ua.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.entity.CatName;
import ua.service.ItemService;
@Controller
public class CatNameController {
	@Autowired
	private ItemService itemService;
	@RequestMapping("/admin/addCatName")
	public String show(Model model){
		model.addAttribute("items", itemService.findAll());
		return "addCatNamePanel";
		}
	@RequestMapping(value="/admin/addCatName", method=RequestMethod.POST)
	public String save(@RequestParam String name){
		itemService.save(name);
		return "redirect:/admin/addCatName";
	}
	@RequestMapping("/admin/addCatName/delete/{id}")
	public String delete(@PathVariable int id){
			itemService.delete(id);
			return "redirect:/admin/addCatName";
	}
}