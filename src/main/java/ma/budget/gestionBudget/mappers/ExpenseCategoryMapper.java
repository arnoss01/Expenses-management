package ma.budget.gestionBudget.mappers;

import org.springframework.stereotype.Component;

import ma.budget.gestionBudget.entities.ExpenseCategory;
import ma.budget.gestionBudget.models.requests.ExpenseCategoryRequest;
import ma.budget.gestionBudget.models.responses.ExpenseCategoryResponse;

@Component
public class ExpenseCategoryMapper implements IMapper<ExpenseCategory, ExpenseCategoryRequest, ExpenseCategoryResponse>{

    @Override
    public ExpenseCategory requestToObject(ExpenseCategoryRequest req) {
        return ExpenseCategory.builder()
            .category(req.getCategory())
            .build();
    }

    @Override
    public ExpenseCategoryResponse objectToResponse(ExpenseCategory object) {
        return ExpenseCategoryResponse.builder()
        .id(object.getId())
        .category(object.getCategory())
        .build();
    }

}
