package ma.budget.gestionBudget.mappers;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.budget.gestionBudget.Repository.ExpenseCategoryRepository;
import ma.budget.gestionBudget.entities.Expense;
import ma.budget.gestionBudget.entities.ExpenseCategory;
import ma.budget.gestionBudget.models.requests.ExpenseRequest;
import ma.budget.gestionBudget.models.responses.ExpenseResponse;

@Component
public class ExpenseMapper implements IMapper<Expense, ExpenseRequest, ExpenseResponse>{

    @Autowired
    ExpenseCategoryRepository expenseCategoryRepository;

    @Override
    public Expense requestToObject(ExpenseRequest req) {
        Long categoryId = req.getExpenseCategoryId();
        Optional<ExpenseCategory> category = expenseCategoryRepository.findById(categoryId);

        return Expense.builder()
            .title(req.getTitle())
            .description(req.getDescription())
            .spendingDate(req.getSpendingDate())
            .ammount(req.getAmmount())
            .expenseCategory(category.get())
            .build();
    }

    @Override
    public ExpenseResponse objectToResponse(Expense object) {
        ExpenseCategory expenseCategory = object.getExpenseCategory();

        return ExpenseResponse.builder()
            .id(object.getId())
            .title(object.getTitle())
            .description(object.getDescription())
            .spendingDate(object.getSpendingDate())
            .ammount(object.getAmmount())
            .expenseCategoryId(expenseCategory.getId())
            .build();
    }

    
}
