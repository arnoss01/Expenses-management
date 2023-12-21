package ma.budget.gestionbudget.models.requests;

import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.budget.gestionbudget.entities.Expense;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExpenseCategoryRequest {

    private String category;
    private Set<Long> expenses;
}
