package com.vaklin.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

//THIS IS A MODEL   NOT IN ANY LAYER ITS GROUNDWORK

@Entity
@Table
public class Student {
@Id	
@SequenceGenerator(name= "student_sequence",
				   sequenceName= "student_sequence",
				   allocationSize=1
				   )
@GeneratedValue(
		strategy = GenerationType.SEQUENCE,
		generator= "student_sequence"
		)
int id;
String name;
int age;
String email;
public Student() {
}
public Student(int id, String name, int age, String email) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.email = email;
}
public Student(String name, int age, String email) {
	super();
	this.name = name;
	this.age = age;
	this.email = email;
}

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + "]";
}
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
}
