package ma.budget.gestionbudget.Repository;

import ma.budget.gestionbudget.entities.FinancialGoal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FinancialGoalRepository extends JpaRepository<FinancialGoal,Long>{}