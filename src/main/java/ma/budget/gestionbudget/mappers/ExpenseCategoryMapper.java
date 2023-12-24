package ma.budget.gestionbudget.mappers;


import ma.budget.gestionbudget.entities.ExpenseCategory;
import ma.budget.gestionbudget.models.requests.ExpenseCategoryRequest;
import ma.budget.gestionbudget.models.responses.ExpenseCategoryResponse;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Set;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ExpenseCategoryMapper {
    ExpenseCategoryMapper INSTANCE = Mappers.getMapper(ExpenseCategoryMapper.class);

    ExpenseCategory expenseCategoryRequestToExpenseCategory(ExpenseCategoryRequest expenseCategoryRequest);
    ExpenseCategoryResponse expenseCategoryToExpenseCategoryRespoonse(ExpenseCategory expenseCategory);
    List<ExpenseCategoryResponse> mapExpenseCategory(List<ExpenseCategory> expenseCategory);
   // Set<ExpenseCategoryResponse> mapExpenseCategory(Set<ExpenseCategory> expenseCategory);

}
