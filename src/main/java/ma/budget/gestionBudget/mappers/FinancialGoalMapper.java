package ma.budget.gestionBudget.mappers;

import org.springframework.stereotype.Component;

import ma.budget.gestionBudget.entities.FinancialGoal;
import ma.budget.gestionBudget.models.requests.FinancialGoalRequest;
import ma.budget.gestionBudget.models.responses.FinancialGoalResponse;

/**
 * FinancialGoalMapper
 */
@Component
public class FinancialGoalMapper implements IMapper<FinancialGoal, FinancialGoalRequest, FinancialGoalResponse>{

    @Override
    public FinancialGoal requestToObject(FinancialGoalRequest req) {
        return FinancialGoal.builder()
            .goal(req.getGoal())
            .capitalPercentage(req.getCapitalPercentage())
            .title(req.getTitle())
            .deadline(req.getDeadline())
            .build();
    }

    @Override
    public FinancialGoalResponse objectToResponse(FinancialGoal object) {
        return FinancialGoalResponse.builder()
            .id(object.getId())
            .goal(object.getGoal())
            .capitalPercentage(object.getCapitalPercentage())
            .title(object.getTitle())
            .deadline(object.getDeadline())
            .build();
    }

    
}
