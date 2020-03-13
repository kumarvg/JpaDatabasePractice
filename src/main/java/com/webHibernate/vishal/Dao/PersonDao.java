package com.webHibernate.vishal.Dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import nate.com.webHibernate.vishal.model.Person;

//@Repository
@Component
@Transactional
public class PersonDao {

	@Autowired
	EntityManager mgr;
	
	public void savePerson(Person person)
	{
		mgr.persist(person);
	}
	
	public Person authenticate(Person person)
	{
		String query ="From Person userId=:userid and password=:passward";
		return (Person) mgr.createQuery(query).setParameter("userid",person.getId())
		.setParameter("passward",person.getName()).getSingleResult();
			
	}
	
	@SuppressWarnings("unchecked")
	public List<Person> getPerson()
	{
		//return	 (List<Person>)mgr.createNativeQuery("select * from Person where id=2").getResultList();
	 
		/*
		 * return (List<Person>)
		 * mgr.createNativeQuery("select * from Person where id=?")
		 * .setParameter(1,2).getSingleResult();
		 */
		return mgr.createQuery("from Person").getResultList();
	}
	
	public Person findUser(int id)
	{
	  return mgr.find(Person.class, id);
	}
	
	public String deleteUser(int id)
	{
		mgr.remove(findUser(id));
		return "String";
	}
	
	}
