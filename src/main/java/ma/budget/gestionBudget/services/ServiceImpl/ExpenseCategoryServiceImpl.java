package ma.budget.gestionBudget.services.ServiceImpl;

import ma.budget.gestionBudget.Repository.ExpenseCategoryRepository;
import ma.budget.gestionBudget.entities.ExpenseCategory;
import ma.budget.gestionBudget.mappers.IMapper;
import ma.budget.gestionBudget.models.requests.ExpenseCategoryRequest;
import ma.budget.gestionBudget.models.responses.ExpenseCategoryResponse;
import ma.budget.gestionBudget.services.ExpenseCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseCategoryServiceImpl implements ExpenseCategoryService {

    @Autowired
    ExpenseCategoryRepository expenseCategoryRepository;

    @Autowired
    IMapper<ExpenseCategory, ExpenseCategoryRequest, ExpenseCategoryResponse> mapper;


    @Override
    public ExpenseCategoryResponse addExpenseCategory(ExpenseCategoryRequest expenseCategoryRequest) {

        return mapper
            .objectToResponse(
                expenseCategoryRepository.save(
                    mapper.requestToObject(expenseCategoryRequest)));
    }

    @Override
    public ExpenseCategoryResponse getExpenseCategory(Long id) {
        return mapper.objectToResponse(expenseCategoryRepository.findById(id).get());
    }

    @Override
    public List<ExpenseCategoryResponse> getAll() {
        return expenseCategoryRepository.findAll()
            .stream()
            .map(ec -> mapper.objectToResponse(ec))
            .toList();
    }

    @Override
    public ExpenseCategoryResponse updateExpenseCategory(ExpenseCategoryRequest expenseCategoryRequest, Long id) {
        ExpenseCategory expenseCategory = mapper.requestToObject(expenseCategoryRequest);
        expenseCategory.setId(id);

        expenseCategory = expenseCategoryRepository.save(expenseCategory);
        return mapper.objectToResponse(expenseCategory);
    }

    @Override
    public void deleteExpenseCategory(Long id) {
        expenseCategoryRepository.deleteById(id);
    }
}
