package ua.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.entity.CatName;
import ua.service.CatNameService;
import ua.service.ItemService;
@Controller
public class CatNameController {
	@Autowired
	private CatNameService catNameService;
	@ModelAttribute("catName")
	public CatName getCatName(){
		return new CatName();
	}
	@RequestMapping("/admin/addCatName")
	public String show(Model model){
		model.addAttribute("items", catNameService.findAll());
		return "addCatNamePanel";
		}
	@RequestMapping(value="/admin/addCatName/update/{id}", method=RequestMethod.POST)
	public String save(@PathVariable int id, Model model, @PageableDefault(size=5) Pageable pageable){
		model.addAttribute("catName", catNameService.findOne(id));
	//	model.addAttribute("catName", catNameService.findByName(name));
		return "addCatName";
	}
	@RequestMapping("/admin/addCatName/delete/{id}")
	public String delete(@PathVariable int id){
			catNameService.delete(id);
			return "redirect:/admin/addCatName";
	}
}