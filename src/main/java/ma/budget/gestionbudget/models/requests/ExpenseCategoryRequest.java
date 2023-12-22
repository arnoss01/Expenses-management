package ma.budget.gestionbudget.models.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExpenseCategoryRequest {

    private String category;
    private Set<Long> expenses;
}
