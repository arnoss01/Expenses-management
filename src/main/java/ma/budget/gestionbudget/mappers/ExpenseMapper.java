package ma.budget.gestionbudget.mappers;


import ma.budget.gestionbudget.entities.Expense;
import ma.budget.gestionbudget.models.requests.ExpenseRequest;
import ma.budget.gestionbudget.models.responses.ExpenseResponse;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR, unmappedTargetPolicy = ReportingPolicy.IGNORE)public interface ExpenseMapper
{
    ExpenseMapper INSTANCE = Mappers.getMapper(ExpenseMapper.class);
    Expense expenseRequestToExpense(ExpenseRequest expenseRequest);
    ExpenseResponse expenseToExpenseResponse(Expense expense);
    List<ExpenseResponse> mapExpense(List<Expense> expense);
   // Set<ExpenseResponse> mapExpense(Set<Expense> expense);

}
