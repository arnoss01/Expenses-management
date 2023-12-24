package ma.budget.gestionbudget.services.ServiceImpl;

import ma.budget.gestionbudget.Repository.FinancialGoalRepository;
import ma.budget.gestionbudget.entities.FinancialGoal;
import ma.budget.gestionbudget.mappers.FinancialGoalMapper;
import ma.budget.gestionbudget.models.requests.FinancialGoalRequest;
import ma.budget.gestionbudget.models.responses.FinancialGoalResponse;
import ma.budget.gestionbudget.services.FinancialGoalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinancialGoalServiceImpl implements FinancialGoalService {

    @Autowired
    FinancialGoalRepository financialGoalRepository;

    @Override
    public FinancialGoalResponse addFinancialGoal(FinancialGoalRequest financialGoalRequest) {
        return FinancialGoalMapper.INSTANCE.financialGoalToFinancialGoalRespoonse(financialGoalRepository.save(FinancialGoalMapper.INSTANCE.financialGoalRequestToFinancialGoal(financialGoalRequest)));
    }

    @Override
    public FinancialGoalResponse getFinancialGoal(Long id) {
        return FinancialGoalMapper.INSTANCE.financialGoalToFinancialGoalRespoonse(financialGoalRepository.getReferenceById(id));
    }

    @Override
    public List<FinancialGoalResponse> getAll() {
        return FinancialGoalMapper.INSTANCE.mapFinancialGoal(financialGoalRepository.findAll());
    }

    @Override
    public FinancialGoalResponse updateFinancialGoal(FinancialGoalRequest financialGoalRequest, Long id) {
        FinancialGoal financialGoal = FinancialGoalMapper.INSTANCE.financialGoalRequestToFinancialGoal(financialGoalRequest);
        financialGoal.setId(id);
        return FinancialGoalMapper.INSTANCE.financialGoalToFinancialGoalRespoonse(financialGoal);
    }

    @Override
    public void deleteFinancialGoal(Long id) {financialGoalRepository.deleteById(id);}
}
