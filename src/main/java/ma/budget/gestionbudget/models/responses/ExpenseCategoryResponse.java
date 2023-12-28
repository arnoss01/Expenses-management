package ma.budget.gestionbudget.models.responses;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ExpenseCategoryResponse {

    private Long id;
    private String category;

    private List<ExpenseResponse> expenses;

}
