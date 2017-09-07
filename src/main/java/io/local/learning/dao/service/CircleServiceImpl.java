package io.local.learning.dao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.local.learning.dao.CircleDAO;
import io.local.learning.model.Circle;

@Service
public class CircleServiceImpl implements CircleService {
	
	@Autowired
	private CircleDAO circleDAO;

	@Override
	public List<Circle> getAllArticles() {
		
		return circleDAO.getAllArticles();
	}

	@Override
	public Circle getCircleById(int circleId) {
		
		return circleDAO.getCircleById(circleId);
	}

	@Override
	public void addCircle(Circle circle) {
		circleDAO.addCircle(circle);
		
	}

	@Override
	public void updateCircle(Circle circle) {
		circleDAO.updateCircle(circle);
		
	}

	@Override
	public void deleteCircle(int articleId) {
		circleDAO.deleteCircle(articleId);
		
	}

	@Override
	public boolean circleExists(int circleId, String name) {
		
		return circleDAO.circleExists(circleId, name);
	}

}
