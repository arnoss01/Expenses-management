package ma.budget.gestionbudget.models.responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class FinancialGoalResponse {
    private Long id;
    private Double goal;
    private Float capitalPercentage;
    private String title;
    private LocalDateTime deadline;

}
