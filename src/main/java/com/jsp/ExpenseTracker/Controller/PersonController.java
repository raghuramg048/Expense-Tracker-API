package com.jsp.ExpenseTracker.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.ExpenseTracker.Entity.Person;
import com.jsp.ExpenseTracker.Repository.PersonRepository;

@RestController
@RequestMapping("/persons")
public class PersonController {

	@Autowired
	private PersonRepository repo;
	
	@PostMapping
	public Person addPerson(@RequestBody Person person) {
		return repo.save(person);
	}
	
	@GetMapping
	public List<Person> getPersons(){
		return repo.findAll();
	}
	
}
