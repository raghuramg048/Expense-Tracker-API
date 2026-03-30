package com.jsp.ExpenseTracker.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.jsp.ExpenseTracker.Entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long>{

}
