package com.oocl.testlogin.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.oocl.testlogin.session.NewSession;
import com.oocl.testlogin.transaction.impl.UserTransactionImpl;
import com.oocl.testlogin.transaction.inf.UserTransaction;
import com.oocl.testlogin.dao.inf.UserDAO;

public class UserDAOImpl implements UserDAO {

	UserTransaction tx = new UserTransactionImpl();

	@Override
	public int validateUser(String username, String password) {		
		return tx.validateUser(username, password);
	}

}
