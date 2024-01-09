package ma.budget.gestionbudget.models.requests;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExpenseRequest {

    private String title;
    private String description;
    private LocalDateTime spendingDate;
    private Double ammount;
    private Long expenseCategoryId;

}
