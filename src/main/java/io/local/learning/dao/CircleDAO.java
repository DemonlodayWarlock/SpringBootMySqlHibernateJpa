package io.local.learning.dao;

import java.util.List;

import io.local.learning.model.Circle;

public interface CircleDAO {
	
	 List<Circle> getAllArticles();
	 Circle getCircleById(int circleId);
	 void addCircle(Circle circle);
	 void updateCircle(Circle circle);
	 void deleteCircle(int articleId);
	 boolean circleExists(int circleId, String name);

}
