package ma.budget.gestionbudget.services;

import ma.budget.gestionbudget.models.requests.ExpenseCategoryRequest;
import ma.budget.gestionbudget.models.responses.ExpenseCategoryResponse;

import java.util.List;

public interface ExpenseCategoryService {

    ExpenseCategoryResponse addExpenseCategory(ExpenseCategoryRequest expenseCategoryRequest);
    ExpenseCategoryResponse getExpenseCategory(Long id);
    List<ExpenseCategoryResponse> getAll();
    ExpenseCategoryResponse updateExpenseCategory(ExpenseCategoryRequest expenseCategoryRequest , Long id);
    void deleteExpenseCategory(Long id);
}
