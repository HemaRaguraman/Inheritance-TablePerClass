package com.model;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class TPCExample {
	public static void main(String[] args)
	{
		Transaction tr=null;
		try(Session session=HBUtil.getSesFactory().openSession())
		{
			tr=session.beginTransaction();
			Employee e1=new Employee("Kumar");
			RegEmployee e2=new RegEmployee(5500,"Sales","Santhosh");
			Trainee e3=new Trainee(200,"6","Dinesh");
			session.persist(e1);
			session.persist(e2);
			session.persist(e3);
			tr.commit();
			session.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
