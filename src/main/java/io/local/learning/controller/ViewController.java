package io.local.learning.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ViewController {
	
	@RequestMapping("/view/index")
	public String gotoIndex() {
		
		return "index";
	}

}
