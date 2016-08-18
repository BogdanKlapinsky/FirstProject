package ua.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.service.CountryNameService;
import ua.service.CountryNameServiceImpl;
@Controller
public class CountryController {
	@Autowired
	private CountryNameService countryNameService;
	
	@RequestMapping("/adminPanel/countryName")
	public String showCountry(Model model){
		model.addAttribute("countries", countryNameService.findAll());
		return "countryName";
	}
	@RequestMapping("/adminPanel/countryName/delete/{id}")
	public String deleteClient(@PathVariable int id){
		countryNameService.delete(id);
		return "redirect:/adminPanel/countryName";
	}
	@RequestMapping(value = "/adminPanel/country", method = RequestMethod.POST)
	public String showCountry(@RequestParam String name){
		countryNameService.save(name);
		return "redirect:/adminPanel/countryName";
	}
}
