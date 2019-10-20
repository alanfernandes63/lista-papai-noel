package dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;

public class GenericDaoHibernate <T, ID extends Serializable> implements GenericDaoInterface<T, Serializable>{
	
	private Class<T> className;
	
	public GenericDaoHibernate(Class<T> className) {
		super();
		this.className = className;
	}

	public T saveOrUpdate(T t) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.getTransaction();
		
		transaction.begin();
		session.saveOrUpdate(t);
		transaction.commit();
		session.close();
		
		
		return null;
	}

	public List<T> findAll() {
		// TODO Auto-generated method stub
		
		List<T> list = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.getTransaction();
		transaction.begin();
		list = session.createQuery("select o from " + className.getSimpleName() + " o").getResultList();
		transaction.commit();
		session.close();
		return list;
	}

	public T delete(T t) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.delete(t);
		transaction.commit();
		session.close();
		return null;
	}

	public T findByUserName(String username) {
		// TODO Auto-generated method stub
		return null;
	}
}
