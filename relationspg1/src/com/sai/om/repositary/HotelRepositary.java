package com.sai.om.repositary;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sai.om.Entity.HotelEntity;

public class HotelRepositary {
	
	public HotelRepositary() {
		System.out.println(this.getClass().getSimpleName()+"created");
	}

	public void save(HotelEntity entity)
	{
		SessionFactory factory=new Configuration().configure("resource/hibernate.cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
		try
		{
			session.beginTransaction();
			session.save(entity);
			session.getTransaction().commit();
		}catch(Exception e)
		{
			e.printStackTrace();
			session.getTransaction().rollback();
		}finally{
			session.close();
			factory.close();
		}
	}

}
