package nate.com.webHibernate.vishal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
@Entity
public class Person {

	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int id;
	@Column
	private String name;
	@Column
	private String designation;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", designation=" + designation + "]";
	}
	
	
	}
