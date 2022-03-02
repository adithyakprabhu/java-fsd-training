package com.hos.DemoPat.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hos.DemoPat.model.Person;
import com.hos.DemoPat.repository.PersonRepository;
import com.hos.DemoPat.service.PersonService;

@Service
public  class PersonServiceImpl implements PersonService{

	@Autowired
	private PersonRepository personRepository;
	@Override
	public Person savePerson(Person person) {
		// TODO Auto-generated method stub
		return personRepository.save(person);
	}

	@Override
	public List<Person> getPersons() {
		// TODO Auto-generated method stub
		return personRepository.findAll();
	}

	@Override
	public Person updatePerson(Long id, Person person) {
		Optional<Person> findById  = personRepository.findById(id);
		if(findById.isPresent())
		{
			Person personEntity = findById.get();
			if(person.getName() != null && !person.getName().isEmpty())
			{
				personEntity.setName(person.getName());
			}
			
			if(person.getAge() != null)
			{
				personEntity.setAge(person.getAge());
			}
			personRepository.save(personEntity);
		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletePerson(Long id) {
		personRepository.deleteById(id);
		
	}
	

}
