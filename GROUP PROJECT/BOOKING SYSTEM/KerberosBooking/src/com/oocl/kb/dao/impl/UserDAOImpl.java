package com.oocl.kb.dao.impl;

import java.util.ArrayList;
import java.util.List;

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
		try {
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
		catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public User getUserDetails(String username, String password) {		
		try {
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
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@Override
	public User getUser(String username) {
		
		try {
			User user = null;
			Session session = sessionFactory.openSession();
			tx = session.beginTransaction();
			Query query = session.createQuery("FROM User WHERE username = ?");
			query.setParameter(0, username);
			tx.commit();
			user = (User) query.uniqueResult();
			session.close();
			return user;
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Role getUserRole(String userRole) {		
		try {
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
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}		
	}

	@Override
	public String deleteUser(User user) {		
		try {
			Session session = sessionFactory.openSession();
			tx = session.beginTransaction();
			session.update(user);
			tx.commit();
			session.close();
			return "Success";
		}
		catch(Exception e) {
			e.printStackTrace();
			return "Fail";
		}		
	}
	
	@Override
	public List<User> getAllUsers(String userName,String fname,String lname,String role) {		
		try {
			Session session = sessionFactory.openSession();
			tx = session.beginTransaction();
			Query query = session.createQuery("FROM User WHERE username LIKE ? AND firstName LIKE ? AND lastName LIKE ? AND role LIKE ? AND isDeleted = 0");
			query.setParameter(0, "%" + userName + "%");
			query.setParameter(1, "%" + fname + "%");
			query.setParameter(2, "%" + lname + "%");
			query.setParameter(3, "%" + role + "%");
			tx.commit();
			List<User> returnList = (ArrayList<User>) query.list();
			session.close();
			
			return returnList;
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}	
	}
	
	@Override
	public String updateUser(User user) {	
		// TODO Auto-generated method stub
		try {
			Session session = sessionFactory.openSession();
			tx = session.beginTransaction();
			session.update(user);
			tx.commit();
			session.close();
			return "Success";
		}
		catch(Exception e) {
			e.printStackTrace();
			return "Fail";
		}
	}

	@Override
	public String createUser(User user) {
		// TODO Auto-generated method stub
		try {
			Session session = sessionFactory.openSession();
			tx = session.beginTransaction();
			Query query = session.createQuery("FROM User WHERE username = ? OR (firstName = ? AND lastName = ?)");
			query.setParameter(0, user.getUsername());
			query.setParameter(1, user.getFirstName());
			query.setParameter(2, user.getLastName());
			
			User ifExistingUser = (User) query.uniqueResult();
			
			if (ifExistingUser == null) {
				session.save(user);
				tx.commit();
			}else throw new Exception();			
			session.close();
			return "Success";
		}
		catch(Exception e) {
			e.printStackTrace();
			return "Fail";
		}	
	}
}
