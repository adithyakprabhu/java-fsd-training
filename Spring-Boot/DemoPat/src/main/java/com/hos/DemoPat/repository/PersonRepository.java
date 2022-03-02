package com.hos.DemoPat.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hos.DemoPat.model.Person;

public interface PersonRepository extends MongoRepository<Person,Long>
{

}
