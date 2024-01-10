package ma.budget.gestionBudget.services.ServiceImpl;

import ma.budget.gestionBudget.Repository.FinancialGoalRepository;
import ma.budget.gestionBudget.entities.FinancialGoal;
import ma.budget.gestionBudget.mappers.IMapper;
import ma.budget.gestionBudget.models.requests.FinancialGoalRequest;
import ma.budget.gestionBudget.models.responses.FinancialGoalResponse;
import ma.budget.gestionBudget.services.FinancialGoalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinancialGoalServiceImpl implements FinancialGoalService {

    @Autowired
    FinancialGoalRepository financialGoalRepository;
    @Autowired
    IMapper<FinancialGoal, FinancialGoalRequest, FinancialGoalResponse> mapper;

    @Override
    public FinancialGoalResponse addFinancialGoal(FinancialGoalRequest financialGoalRequest) {
        FinancialGoal goal = mapper.requestToObject(financialGoalRequest);
        goal = financialGoalRepository.save(goal);
        FinancialGoalResponse response = mapper.objectToResponse(goal);
        return response;
    }

    @Override
    public FinancialGoalResponse getFinancialGoal(Long id) {
        FinancialGoal goal = financialGoalRepository.findById(id).get();
        return mapper.objectToResponse(goal);
    }

    @Override
    public List<FinancialGoalResponse> getAll() {
        return financialGoalRepository.findAll()
            .stream()
            .map((goal) -> mapper.objectToResponse(goal))
            .toList();
    }

    @Override
    public FinancialGoalResponse updateFinancialGoal(FinancialGoalRequest financialGoalRequest, Long id) {
        FinancialGoal financialGoal = mapper.requestToObject(financialGoalRequest);
        financialGoal.setId(id);
        financialGoal = financialGoalRepository.save(financialGoal);
        return mapper.objectToResponse(financialGoal);
    }

    @Override
    public void deleteFinancialGoal(Long id) {financialGoalRepository.deleteById(id);}
}
