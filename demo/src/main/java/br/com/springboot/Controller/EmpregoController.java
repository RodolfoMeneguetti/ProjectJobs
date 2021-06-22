package br.com.springboot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.springboot.Model.Emprego;
import br.com.springboot.Repository.EmpregoRepository;

@Controller
@RequestMapping("/Emprego")
public class EmpregoController {

	@Autowired
	private EmpregoRepository empregoRepository;

	@GetMapping("/")
	public String listarEmprego(Model model) {
		model.addAttribute("empregos", empregoRepository.findAll());
		return "list";
	}

	@GetMapping("/Add")
	public String empregoForm(Model model) {
		model.addAttribute("emprego", new Emprego());
		return "empregoForm";
	}

	@PostMapping("/process")
	public String processForm(@Validated Emprego emprego, BindingResult result) {

		if (result.hasErrors()) {
			return "empregoForm";
		}
		empregoRepository.save(emprego);
		return "redirect:/";

	}

}
