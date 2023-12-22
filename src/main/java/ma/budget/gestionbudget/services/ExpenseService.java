package ma.budget.gestionbudget.services;

import ma.budget.gestionbudget.models.requests.ExpenseRequest;
import ma.budget.gestionbudget.models.responses.ExpenseResponse;

import java.util.List;

public interface ExpenseService {

    ExpenseResponse addExpense(ExpenseRequest expenseRequest);
    ExpenseResponse getExpense(Long id);
    List<ExpenseResponse> getAll();
    ExpenseResponse updateExpense(ExpenseRequest expenseRequest , Long id);
    void deleteExpense(Long id);
    
}
