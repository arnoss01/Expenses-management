package ma.budget.gestionBudget.models.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FinancialGoalRequest {

    private Double goal;
    private Float capitalPercentage;
    private String title;
    private LocalDateTime deadline;

}
