package com.oocl.testlogin.transaction.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.oocl.testlogin.model.User;
import com.oocl.testlogin.session.NewSession;
import com.oocl.testlogin.transaction.inf.UserTransaction;

public class UserTransactionImpl implements UserTransaction {

	private NewSession newSession = new NewSession();
	private SessionFactory factory = newSession.newSessionFactory();
	
	public List<User> getAllUsers() {

		return new ArrayList<User>();
	}

	public List<User> getUserById(String userId) {

		return new ArrayList<User>();
	}

	public int validateUser(String user, String pass) {
		int validate = 0;
		Session session = factory.openSession();
		Transaction tx = null;
		tx = session.beginTransaction();
		Query query = session.createQuery("select count(username) FROM User where username = ? and password = ? ");
		query.setParameter(0, user);
		query.setParameter(1, pass);
		validate = Integer.parseInt(query.uniqueResult().toString());
		tx.commit();
		return validate;
	}
	
	

}
