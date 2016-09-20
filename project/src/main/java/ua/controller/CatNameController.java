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
import ua.entity.Item;
import ua.form.CatNameFilterForm;
import ua.form.CountryFilterForm;
import ua.form.ItemFilterForm;
import ua.form.ItemForm;
import ua.service.CatNameService;
import ua.service.ItemService;
@Controller
public class CatNameController {
	@Autowired
	private CatNameService catNameService;
	
	@ModelAttribute("catName")
	public CatNameFilterForm getForm(){
		return new CatNameFilterForm();
	}
	@ModelAttribute("filter")
	public CatNameFilterForm getFilter(){
		return new CatNameFilterForm();
	}
	@RequestMapping("/admin/addCatName")
	public String show(Model model, @PageableDefault(size=5)Pageable pageable){
		model.addAttribute("item", catNameService.findAll());
		return "addCatNamePanel";
		}
	@RequestMapping(value="/admin/addCatName", method=RequestMethod.POST)
	public String save(@RequestParam String name){
		catNameService.save(name);
		return "redirect:/admin/addCatName";
	}
	@RequestMapping("/admin/addCatName/delete/{id}")
	public String delete(@PathVariable int id){
			catNameService.delete(id);
			return "redirect:/admin/addCatName";
	}
}