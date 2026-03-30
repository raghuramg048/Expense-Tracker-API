package com.jsp.ExpenseTracker.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jsp.ExpenseTracker.Entity.Expense;
import com.jsp.ExpenseTracker.Repository.ExpenseRepository;

@Service
public class ExpenseService {

	@Autowired
	private ExpenseRepository repo;
	
	public Expense addExpense(Expense expense) {
		return repo.save(expense);
	}
	
	public List<Expense> getExpenses(Long personId){
		return repo.findByPersonId(personId);
	}
	
	public void deleteExpense(Long id) {
		repo.deleteById(id);
	}
	
}
