package ma.budget.gestionBudget.services.ServiceImpl;

import ma.budget.gestionBudget.Repository.ExpenseRepository;
import ma.budget.gestionBudget.entities.Expense;
import ma.budget.gestionBudget.mappers.IMapper;
import ma.budget.gestionBudget.models.requests.ExpenseRequest;
import ma.budget.gestionBudget.models.responses.ExpenseResponse;
import ma.budget.gestionBudget.services.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseServiceImpl implements ExpenseService {

    @Autowired
    ExpenseRepository expenseRepository;

    @Autowired
    IMapper<Expense, ExpenseRequest, ExpenseResponse> mapper;

    @Override
    public ExpenseResponse addExpense(ExpenseRequest expenseRequest) {
        return mapper.objectToResponse(expenseRepository.save(mapper.requestToObject(expenseRequest)));
    }

    @Override
    public ExpenseResponse getExpense(Long id) {
        return mapper.objectToResponse(expenseRepository.findById(id).get());
    }

    @Override
    public List<ExpenseResponse> getAll() {
        return expenseRepository.findAll().stream()
            .map(mapper::objectToResponse)
            .toList();
    }

    @Override
    public ExpenseResponse updateExpense(ExpenseRequest expenseRequest, Long id) {
        Expense expense = mapper.requestToObject(expenseRequest);
        expense.setId(id);
        return mapper.objectToResponse(expenseRepository.save(expense));
    }

    @Override
    public void deleteExpense(Long id) {
        expenseRepository.deleteById(id);
    }
}

