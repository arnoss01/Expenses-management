package ma.budget.gestionbudget.mappers;


import ma.budget.gestionbudget.entities.FinancialGoal;
import ma.budget.gestionbudget.models.requests.FinancialGoalRequest;
import ma.budget.gestionbudget.models.responses.FinancialGoalResponse;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Set;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface FinancialGoalMapper {

    FinancialGoalMapper INSTANCE = Mappers.getMapper(FinancialGoalMapper.class);

    FinancialGoal financialGoalRequestToFinancialGoal(FinancialGoalRequest financialGoalRequest);
    FinancialGoalResponse financialGoalToFinancialGoalRespoonse(FinancialGoal financialGoal);
    List<FinancialGoalResponse> mapFinancialGoal(List<FinancialGoal> financialGoal);
    Set<FinancialGoalResponse> mapFinancialGoal(Set<FinancialGoal> financialGoal);
    

}
