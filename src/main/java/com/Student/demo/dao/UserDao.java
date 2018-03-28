package com.Student.demo.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Student.demo.pojo.User;

@Repository

public class UserDao {
@Autowired
	private SessionFactory sessionFactory;
	
	public User findbyUsernameAndPassword(String username, String password)
	
	{
		Session session=null;
		
		try{
			
			session= sessionFactory.openSession();
			
			Query query = session.createQuery("* from emp where username = :param1 and password = :param2");
		
			query.setParameter("param1", username);
			query.setParameter("param2", password);
			User user = (User) query.uniqueResult();
			
			return user;
		}catch (Exception e) {
			// TODO: handle exception
			return null;
		}finally{
			session.close();
			
			
		}
	
}
}
