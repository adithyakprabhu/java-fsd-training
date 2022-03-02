package com.hos.DemoPat.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Person {
@Id
private Long id;
private String name;
private Integer age;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
@Override
public String toString() {
	return "Patient [id=" + id + ", name=" + name + ", age=" + age + "]";
}
}
