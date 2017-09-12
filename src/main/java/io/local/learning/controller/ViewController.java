package io.local.learning.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.local.learning.dao.service.CircleService;
import io.local.learning.model.Circle;


@Controller
public class ViewController {
	
	@Autowired
	private CircleService circleService;
	
	@RequestMapping("/view/index")
	public String gotoIndex(Model model) {
		
		List<Circle> circles = circleService.getAllArticles();	
		model.addAttribute("circles", circles);
		return "index";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/view/{circle}")
	public String forwardLoginPage(Circle circle) {
		
		circleService.addCircle(circle);
		
		return "index";
	}
	
	@RequestMapping("/view/circles")
	public String gotoCircles(Model model) {
		
		List<Circle> circles = 
				circleService.getAllArticles();	
		model.addAttribute("circles", circles);
		
		return "circles";
	}
	
	@RequestMapping("/view/{id}")
	public String deleteCircle(@PathVariable int id,Model model) {
		
		circleService.deleteCircle(id);
		
		List<Circle> circles = circleService.getAllArticles();	
		model.addAttribute("circles", circles);
		
		return "circles";
		
	}

}
