package ma.budget.gestionbudget.models.requests;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class ExpenseCategoryRequest {

    private String category;
    private List<Long> expensesId;
}
