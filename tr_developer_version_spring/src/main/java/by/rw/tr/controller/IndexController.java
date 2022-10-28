package by.rw.tr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@GetMapping("/")
	public String indexGET(ModelMap model) {
		String name = "sergei";
		model.addAttribute("name",name);
		return "index";
	}

}
