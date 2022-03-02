package com.hos.DemoPat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hos.DemoPat.model.Person;
import com.hos.DemoPat.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@PostMapping("/save")
	public Person savePerson(@RequestBody Person person)
	{
		return personService.savePerson(person);
	}
	
	@GetMapping("/list")
	public List<Person> getPerons(@RequestBody Person person)
	{
		return personService.getPersons();
	}
	
	@PutMapping("/update/{person_id}")
	public Person updatePerson(@RequestBody Person person, @PathVariable("person_id") Long id)
	{
		return personService.updatePerson(id, person);
	}
	
	@PutMapping("/delete/{person_id}")
	public String deletePerson(@PathVariable("person_id") Long id)
	{
		 personService.deletePerson(id);
		 return "deleted successfully";
	}
}
