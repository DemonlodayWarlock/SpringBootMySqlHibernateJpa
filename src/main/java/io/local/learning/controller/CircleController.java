package io.local.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.local.learning.dao.service.CircleService;
import io.local.learning.model.Circle;

@RestController
public class CircleController {
	
	@Autowired
	private CircleService circleService;
	
	@RequestMapping(method=RequestMethod.GET,value="/circles")
	public List<Circle> getAllCircles(){	
		return circleService.getAllArticles();	
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/circles/add")
	public void addCircle(@RequestBody Circle circle) {
		circleService.addCircle(circle);	
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/circles/{id}")
	public Circle getCircleById(@PathVariable(value="id") int id) {
		return circleService.getCircleById(id);
	}
	

	
	

}
