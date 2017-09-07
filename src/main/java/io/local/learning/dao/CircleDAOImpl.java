package io.local.learning.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import io.local.learning.model.Circle;

@Transactional
@Repository
public class CircleDAOImpl implements CircleDAO {
	
	@PersistenceContext	
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Circle> getAllArticles() {
		String hql = "FROM Circle";
		return (List<Circle>) entityManager.createQuery(hql).getResultList();
	}

	@Override
	public Circle getCircleById(int circleId) {
		
		return entityManager.find(Circle.class, circleId);
	}

	@Override
	public void addCircle(Circle circle) {
		entityManager.persist(circle);

	}

	@Override
	public void updateCircle(Circle circle) {
		Circle circle1 = getCircleById(circle.getId());
		circle.setName(circle1.getName());
		entityManager.flush();

	}

	@Override
	public void deleteCircle(int circleId) {
		entityManager.remove(getCircleById(circleId));

	}

	@Override
	public boolean circleExists(int circleId, String name) {
		String hql = "FROM Circle as circle where circle.id= ? and circle.name=?";
		int count = entityManager.createQuery(hql).setParameter(1, circleId).setParameter(2, name).getResultList().size();
		return count > 0 ? true : false;
	}

}
