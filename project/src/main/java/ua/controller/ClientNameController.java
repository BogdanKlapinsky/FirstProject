package ua.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.service.ClientNameService;

@Controller
public class ClientNameController {
	@Autowired
	private ClientNameService clientNameService;

	@RequestMapping("/admin/addClientName")
	public String showClient(Model model, @PageableDefault(size=5)Pageable pageable){
		model.addAttribute("clients", clientNameService.findAll(pageable));
		return "adminClientNamePanel";
		
	}
	@RequestMapping(value= "/admin/addClientName", method=RequestMethod.POST)
	public String saveClient(@RequestParam String name){
		clientNameService.save(name);
		return "redirect:/admin/addClientName";
	}
//	public String saveClient(@ModelAttribute("clientName") String name){
//		clientNameService.save(name);
//		return "redirect:/admin/addClientName";
//	}
	
	@RequestMapping("/admin/addClientName/delete/{id}")
	public String deleteClient(@PathVariable int id){
		clientNameService.delete(id);
		return "redirect:/admin/addClientName";
	}
	
	
}
