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

import ua.entity.CountryName;
import ua.form.CountryFilterForm;
import ua.service.CountryNameService;
import ua.service.CountryNameServiceImpl;
@Controller
public class CountryController {
	@Autowired
	private CountryNameService countryNameService;
	
	@ModelAttribute("countryName")
	public CountryName getForm(){
		return new CountryName();
	}
	
	@ModelAttribute("filter")
	public CountryFilterForm getFilter(){
		return new CountryFilterForm();
	}
	@RequestMapping("/admin/countryName")
	public String showCountry(Model model,@PageableDefault(5) Pageable pageable,@ModelAttribute(value="filter") CountryFilterForm form){
		model.addAttribute("page", countryNameService.findAll(pageable, form));
		return "countryName";
	}
	@RequestMapping("/admin/countryName/delete/{id}")
	public String deleteCountry(@PathVariable int id){
		countryNameService.delete(id);
		return "redirect:/admin/countryName";
	}
	@RequestMapping(value="/admin/countryName", method=RequestMethod.POST)
	public String saveCountry(@RequestParam String name){
		countryNameService.save(name);
		return "redirect:/admin/countryName";
	}
//	@RequestMapping(value = "/admin/countryName", method = RequestMethod.POST)
//	public String showCountry(@RequestParam String name){
//		countryNameService.save(name);
//		return "redirect:/admin/countryName";
//	}
}
