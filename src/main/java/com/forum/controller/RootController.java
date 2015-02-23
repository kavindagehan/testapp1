package com.forum.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@Component
public class RootController {


	@RequestMapping(value = "/")
	public String root(Model model) {
		return "index";
	}

}
