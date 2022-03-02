package com.hos.DemoPat.service;

import java.util.List;

import com.hos.DemoPat.model.Person;

public interface PersonService {
	
	public Person savePerson(Person person);
	
	public List<Person> getPersons();
	
	public Person updatePerson(Long id, Person person);
	
	public void deletePerson(Long id); 
}
