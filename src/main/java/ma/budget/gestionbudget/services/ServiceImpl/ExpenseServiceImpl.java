package ma.budget.gestionbudget.services.ServiceImpl;

import ma.budget.gestionbudget.Repository.ExpenseRepository;
import ma.budget.gestionbudget.entities.Expense;
import ma.budget.gestionbudget.mappers.ExpenseMapper;
import ma.budget.gestionbudget.models.requests.ExpenseRequest;
import ma.budget.gestionbudget.models.responses.ExpenseResponse;
import ma.budget.gestionbudget.services.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseServiceImpl implements ExpenseService {

    @Autowired
    ExpenseRepository expenseRepository;

    @Override
    public ExpenseResponse addExpense(ExpenseRequest expenseRequest) {
        return ExpenseMapper.INSTANCE.expenseToExpenseRespoonse(expenseRepository.save(ExpenseMapper.INSTANCE.expenseRequestToExpense(expenseRequest)));
    }

    @Override
    public ExpenseResponse getExpense(Long id) {
        return ExpenseMapper.INSTANCE.expenseToExpenseRespoonse(expenseRepository.getReferenceById(id));
    }

    @Override
    public List<ExpenseResponse> getAll() {
        return ExpenseMapper.INSTANCE.mapExpense(expenseRepository.findAll());
    }

    @Override
    public ExpenseResponse updateExpense(ExpenseRequest expenseRequest, Long id) {
        Expense expense = ExpenseMapper.INSTANCE.expenseRequestToExpense(expenseRequest);
        expense.setId(id);
        return ExpenseMapper.INSTANCE.expenseToExpenseRespoonse(expenseRepository.save(expense));
    }

    @Override
    public void deleteExpense(Long id) {
        expenseRepository.deleteById(id);
    }
}

