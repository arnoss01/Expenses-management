package ma.budget.gestionbudget.models.responses;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class ExpenseCategoryResponse {

    private Long id;
    private String category;

    private Set<ExpenseResponse> expenses;

}
