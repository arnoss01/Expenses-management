package ma.budget.gestionBudget.models.responses;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ExpenseCategoryResponse {

    private Long id;
    private String category;

}
