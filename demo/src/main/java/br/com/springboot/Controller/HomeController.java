package br.com.springboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String HomeApp(Model model) {
		model.addAttribute("mensagem", "esta foi uma mensagem injetada pelo Model"); 
		return "index"; 
	}
	
}
