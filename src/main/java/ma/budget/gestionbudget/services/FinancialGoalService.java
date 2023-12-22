package ma.budget.gestionbudget.services;

import ma.budget.gestionbudget.models.requests.FinancialGoalRequest;
import ma.budget.gestionbudget.models.responses.FinancialGoalResponse;

import java.util.List;

public interface FinancialGoalService {

    FinancialGoalResponse addFinancialGoal(FinancialGoalRequest financialGoalRequest);
    FinancialGoalResponse getFinancialGoal(Long id);
    List<FinancialGoalResponse> getAll();
    FinancialGoalResponse updateFinancialGoal(FinancialGoalRequest financialGoalRequest , Long id);
    void deleteFinancialGoal(Long id);
    
}
