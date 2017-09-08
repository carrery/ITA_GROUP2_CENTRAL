package com.oocl.kb.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.oocl.kb.dao.inf.UserDAO;
import com.oocl.kb.model.Role;
import com.oocl.kb.model.User;

@Component
public class UserDAOImpl implements UserDAO {

	@Autowired
	SessionFactory sessionFactory;
	Session session;
	Transaction tx;

	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public int validateUser(String username, String password) {
		int validate = 0;
		Session session = sessionFactory.openSession();
		tx = session.beginTransaction();
		Query query = session.createQuery("SELECT COUNT(username) FROM User WHERE username = ? and password = ? ");
		query.setParameter(0, username);
		query.setParameter(1, password);
		tx.commit();
		validate = Integer.parseInt(query.uniqueResult().toString());
		session.close();
		return validate;
	}

	@Override
	public User getUserDetails(String username, String password) {
		User user = null;
		Session session = sessionFactory.openSession();
		tx = session.beginTransaction();
		Query query = session.createQuery("FROM User WHERE username = ? and password = ? ");
		query.setParameter(0, username);
		query.setParameter(1, password);
		tx.commit();
		user = (User) query.uniqueResult();
		session.close();
		return user;
	}

	@Override
	public Role getUserRole(String userRole) {
		Role role = null;
		Session session = sessionFactory.openSession();
		tx = session.beginTransaction();
		Query query = session.createQuery("FROM Role WHERE role = ?");
		query.setParameter(0, userRole);
		tx.commit();
		role = (Role) query.uniqueResult();
		session.close();	
		return role;
	}

}
