package ma.budget.gestionbudget.Repository;

import ma.budget.gestionbudget.entities.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense,Long> {
}
