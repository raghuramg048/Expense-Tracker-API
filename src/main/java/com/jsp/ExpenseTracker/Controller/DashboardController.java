package com.jsp.ExpenseTracker.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.ExpenseTracker.Entity.Expense;
import com.jsp.ExpenseTracker.Entity.Income;
import com.jsp.ExpenseTracker.Repository.ExpenseRepository;
import com.jsp.ExpenseTracker.Repository.IncomeRepository;

@RestController
@RequestMapping("/dashboard")
public class DashboardController {

	@Autowired
	private ExpenseRepository expenseRepo;

	@Autowired
	private IncomeRepository incomeRepo;

	@GetMapping
	public Map<String,Double> getSummary(@RequestParam Long personId){
		
		double income = 0;
		double expense = 0;
		
		List<Income> incomes = incomeRepo.findByPersonId(personId);
		for(Income i : incomes) {
			income += i.getAmount();
		}
		
		List<Expense> expenses = expenseRepo.findByPersonId(personId);
		for(Expense e : expenses) {
			expense += e.getAmount();
		}
		
		Map<String, Double> result = new HashMap<>();
		
		result.put("Income", income);
		result.put("Expense", expense);
		result.put("Balance", income - expense);
		
		return result;
		
	}

}
