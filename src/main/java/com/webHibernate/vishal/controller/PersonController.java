package com.webHibernate.vishal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.webHibernate.vishal.Dao.PersonDao;

import nate.com.webHibernate.vishal.model.Person;

@RestController
@RequestMapping("/spring-boot-orm")
public class PersonController {

	@Autowired
	private PersonDao dao;
	
	@PostMapping("/savePerson")
	public String save(@RequestBody Person person)
	{
		System.out.println(person.getDesignation());
		System.out.println(person.getName());
		dao.savePerson(person);
		return "sucess";
	}
	
	
	  @GetMapping("/getAll") 
	  public List<Person> getallPerson() 
	  { 
		 return dao.getPerson();
	  }
	  
	  
	  @GetMapping(path = "/removeUser")
	  public String deleteUser(@RequestParam int a)
	  {
		 System.out.println("id is - "+a);
		 dao.deleteUser(a);
		 System.out.println("user deleted");
		 return "User deleted Sucessfully";
		 
	  }
	  
}
