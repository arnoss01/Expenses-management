package ma.budget.gestionbudget.models.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExpenseResponse {
    private Long id;
    private String title;
    private String description;
    private LocalDateTime spendingDate;
    private Double ammount;
}
