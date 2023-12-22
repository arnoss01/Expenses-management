package ma.budget.gestionbudget.Repository;

import ma.budget.gestionbudget.entities.ExpenseCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseCategoryRepository extends JpaRepository<ExpenseCategory,Long> {
}