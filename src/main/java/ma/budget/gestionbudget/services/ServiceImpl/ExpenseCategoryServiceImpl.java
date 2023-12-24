package ma.budget.gestionbudget.services.ServiceImpl;

import ma.budget.gestionbudget.Repository.ExpenseCategoryRepository;
import ma.budget.gestionbudget.entities.ExpenseCategory;
import ma.budget.gestionbudget.mappers.ExpenseCategoryMapper;
import ma.budget.gestionbudget.models.requests.ExpenseCategoryRequest;
import ma.budget.gestionbudget.models.responses.ExpenseCategoryResponse;
import ma.budget.gestionbudget.services.ExpenseCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseCategoryServiceImpl implements ExpenseCategoryService {

    @Autowired
    ExpenseCategoryRepository expenseCategoryRepository;


    @Override
    public ExpenseCategoryResponse addExpenseCategory(ExpenseCategoryRequest expenseCategoryRequest) {
        return ExpenseCategoryMapper.INSTANCE.expenseCategoryToExpenseCategoryRespoonse(expenseCategoryRepository.save(ExpenseCategoryMapper.INSTANCE.expenseCategoryRequestToExpenseCategory(expenseCategoryRequest)));
    }

    @Override
    public ExpenseCategoryResponse getExpenseCategory(Long id) {
        return ExpenseCategoryMapper.INSTANCE.expenseCategoryToExpenseCategoryRespoonse(expenseCategoryRepository.getReferenceById(id));
    }

    @Override
    public List<ExpenseCategoryResponse> getAll() {
        return ExpenseCategoryMapper.INSTANCE.mapExpenseCategory(expenseCategoryRepository.findAll());
    }

    @Override
    public ExpenseCategoryResponse updateExpenseCategory(ExpenseCategoryRequest expenseCategoryRequest, Long id) {
        ExpenseCategory expenseCategory = ExpenseCategoryMapper.INSTANCE.expenseCategoryRequestToExpenseCategory(expenseCategoryRequest);
        expenseCategory.setId(id);

        return ExpenseCategoryMapper.INSTANCE.expenseCategoryToExpenseCategoryRespoonse(expenseCategoryRepository.save(expenseCategory));
    }

    @Override
    public void deleteExpenseCategory(Long id) {
    expenseCategoryRepository.deleteById(id);
    }
}
