package com.jsp.ExpenseTracker.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.jsp.ExpenseTracker.Entity.Income;

@Repository
public interface IncomeRepository extends JpaRepository<Income, Long>{
	
	List<Income> findByPersonId(Long personId);

}
