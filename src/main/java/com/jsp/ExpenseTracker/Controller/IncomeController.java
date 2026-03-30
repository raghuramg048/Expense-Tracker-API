package com.jsp.ExpenseTracker.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.ExpenseTracker.Entity.Income;
import com.jsp.ExpenseTracker.Service.IncomeService;

@RestController
@RequestMapping("/income")
public class IncomeController {

	@Autowired
	private IncomeService service;

	@PostMapping
	public Income addIncome(@RequestBody Income income) {
		return service.addIncome(income);
	}

	@GetMapping
	public List<Income> getIncomeById(@RequestParam Long personId) {
		return service.getIncome(personId);
	}
	
	@DeleteMapping
	public String deleteIncome(@RequestParam Long id) {
		service.deleteIncome(id);
		return "Deleted successfully!";
	}

}
