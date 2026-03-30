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

import com.jsp.ExpenseTracker.Entity.Expense;
import com.jsp.ExpenseTracker.Service.ExpenseService;



@RestController
@RequestMapping("/expenses")
public class ExpenseController {

	@Autowired
	private ExpenseService service;
	
	@PostMapping
	public Expense addExpense(@RequestBody Expense expense) {
		return service.addExpense(expense);
	}
	
	@GetMapping
	public List<Expense> getExpenseById(@RequestParam Long personId){
		return service.getExpenses(personId);
	}
	
	@DeleteMapping
	public String deleteExpense(@RequestParam Long id) {
		service.deleteExpense(id);
		return "Deleted successfully!";
	}
	
	
}
