package com.oocl.testlogin.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.oocl.testlogin.session.NewSession;
import com.oocl.testlogin.dao.inf.UserDAO;

public class UserDAOImpl implements UserDAO {

	private NewSession newSession = new NewSession();
	private SessionFactory factory = newSession.newSessionFactory();

	@Override
	public int validateUser(String username, String password) {
		int validate = 0;
		Session session = factory.openSession();
		Transaction tx = null;
		tx = session.beginTransaction();
		Query query = session.createQuery("select count(username) FROM User where username = ? and password = ? ");
		query.setParameter(0, username);
		query.setParameter(1, password);
		validate = Integer.parseInt(query.uniqueResult().toString());
		tx.commit();
		return validate;
	}

}
