package ma.budget.gestionBudget;

import java.time.LocalDateTime;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ma.budget.gestionBudget.Repository.ExpenseCategoryRepository;
import ma.budget.gestionBudget.Repository.FinancialGoalRepository;
import ma.budget.gestionBudget.entities.Expense;
import ma.budget.gestionBudget.entities.ExpenseCategory;
import ma.budget.gestionBudget.entities.FinancialGoal;
import ma.budget.gestionBudget.Repository.ExpenseRepository;

@SpringBootApplication
public class GestionBudgetApplication implements CommandLineRunner{
    @Autowired
    FinancialGoalRepository financialGoalRepository;
    @Autowired
    ExpenseCategoryRepository categoryRepository;
    @Autowired
    ExpenseRepository expenseRepository;

    public static void main(String[] args) {
                SpringApplication.run(GestionBudgetApplication.class, args);
        }

    @Override
    public void run(String... args) throws Exception {
        // Create and save multiple ExpenseCategories
        ExpenseCategory category1 = ExpenseCategory.builder().category("Utilities").build();
        ExpenseCategory category2 = ExpenseCategory.builder().category("Groceries").build();
        categoryRepository.saveAll(Arrays.asList(category1, category2));

        // Create and save multiple FinancialGoals
        FinancialGoal goal1 = FinancialGoal.builder()
                .goal(5000.0)
                .capitalPercentage(0.1f)
                .title("Emergency Fund")
                .deadline(LocalDateTime.now().plusMonths(12))
                .build();
        FinancialGoal goal2 = FinancialGoal.builder()
                .goal(10000.0)
                .capitalPercentage(0.2f)
                .title("Vacation Fund")
                .deadline(LocalDateTime.now().plusMonths(6))
                .build();
        financialGoalRepository.saveAll(Arrays.asList(goal1, goal2));

        // Create and save multiple Expenses
        Expense expense1 = Expense.builder()
                .title("Electricity Bill")
                .description("Monthly electricity bill payment")
                .spendingDate(LocalDateTime.now())
                .ammount(100.0)
                .expenseCategory(category1)
                .build();
        Expense expense2 = Expense.builder()
                .title("Grocery Shopping")
                .description("Weekly grocery expenses")
                .spendingDate(LocalDateTime.now())
                .ammount(50.0)
                .expenseCategory(category2)
                .build();
        Expense expense3 = Expense.builder()
                .title("Water Bill")
                .description("Monthly water bill payment")
                .spendingDate(LocalDateTime.now())
                .ammount(50.0)
                .expenseCategory(category1)
                .build();
        expenseRepository.saveAll(Arrays.asList(expense1, expense2, expense3));

        // Associate Expenses with ExpenseCategories
        category1.setExpenses(Arrays.asList(expense1, expense3));
        category2.setExpenses(Arrays.asList(expense2));
        categoryRepository.saveAll(Arrays.asList(category1, category2));
    }

}
