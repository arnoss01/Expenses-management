package ma.budget.gestionBudget.Repository;

import ma.budget.gestionBudget.entities.FinancialGoal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FinancialGoalRepository extends JpaRepository<FinancialGoal,Long>{}