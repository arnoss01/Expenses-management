package ma.budget.gestionBudget.services;

import ma.budget.gestionBudget.models.requests.FinancialGoalRequest;
import ma.budget.gestionBudget.models.responses.FinancialGoalResponse;

import java.util.List;

public interface FinancialGoalService {

    FinancialGoalResponse addFinancialGoal(FinancialGoalRequest financialGoalRequest);
    FinancialGoalResponse getFinancialGoal(Long id);
    List<FinancialGoalResponse> getAll();
    FinancialGoalResponse updateFinancialGoal(FinancialGoalRequest financialGoalRequest , Long id);
    void deleteFinancialGoal(Long id);
    
}
