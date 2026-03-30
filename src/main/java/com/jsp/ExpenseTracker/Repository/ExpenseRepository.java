package com.jsp.ExpenseTracker.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.jsp.ExpenseTracker.Entity.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long>{
	
	List<Expense> findByPersonId(Long personId);

}
