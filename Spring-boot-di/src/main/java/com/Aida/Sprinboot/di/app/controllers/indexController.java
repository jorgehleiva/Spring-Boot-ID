package com.Aida.Sprinboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.Aida.Sprinboot.di.app.models.service.IServicio;


@Controller
public class indexController {
	
	@Autowired
	private IServicio servicio;
	
	@GetMapping({"/","","index"})
	public String index(Model model) {
		
		model.addAttribute("objeto",servicio.operaciones());
		return "index";
	}


}
