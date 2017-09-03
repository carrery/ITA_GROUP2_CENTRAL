package com.oocl.testlogin.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.oocl.testlogin.dao.inf.UserDAO;

@Repository
@Transactional
public class UserDAOImpl implements UserDAO {

	@Autowired
	SessionFactory sessionFactory;
	Session session;
	Transaction tx;

	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		this.session = sessionFactory.openSession();
		this.tx = session.beginTransaction();
	}

	@Override
	public int validateUser(String username, String password) {
		int validate = 0;
		try {
			Query query = session.createQuery("select count(username) FROM User where username = ? and password = ? ");
			query.setParameter(0, username);
			query.setParameter(1, password);
			tx.commit();
			validate =  Integer.parseInt(query.uniqueResult().toString());
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
			
		}
		return validate;

	}

}
