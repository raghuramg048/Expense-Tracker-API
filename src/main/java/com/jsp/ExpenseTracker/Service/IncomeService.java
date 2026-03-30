package com.jsp.ExpenseTracker.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jsp.ExpenseTracker.Entity.Income;
import com.jsp.ExpenseTracker.Repository.IncomeRepository;

@Service
public class IncomeService {
    
	@Autowired
	private IncomeRepository repo;

	public Income addIncome(Income income) {
		return repo.save(income);
	}

	public List<Income> getIncome(Long personId) {
		return repo.findByPersonId(personId);
	}

	public void deleteIncome(Long id) {
		repo.deleteById(id);
	}

}
