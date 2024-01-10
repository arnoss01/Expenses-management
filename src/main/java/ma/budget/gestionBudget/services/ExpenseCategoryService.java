package ma.budget.gestionBudget.services;

import ma.budget.gestionBudget.models.requests.ExpenseCategoryRequest;
import ma.budget.gestionBudget.models.responses.ExpenseCategoryResponse;

import java.util.List;

public interface ExpenseCategoryService {

    ExpenseCategoryResponse addExpenseCategory(ExpenseCategoryRequest expenseCategoryRequest);
    ExpenseCategoryResponse getExpenseCategory(Long id);
    List<ExpenseCategoryResponse> getAll();
    ExpenseCategoryResponse updateExpenseCategory(ExpenseCategoryRequest expenseCategoryRequest , Long id);
    void deleteExpenseCategory(Long id);
}
