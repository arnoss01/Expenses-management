package ma.budget.gestionbudget.models.responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class ExpenseResponse {
    private Long id;
    private String title;
    private String description;
    private LocalDateTime spendingDate;
    private Double ammount;
    private UserResponse user;
    private ExpenseCategoryResponse expenseCategory;

}
