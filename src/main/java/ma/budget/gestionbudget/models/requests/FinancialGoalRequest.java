package ma.budget.gestionbudget.models.requests;

import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.budget.gestionbudget.entities.User;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FinancialGoalRequest {

    private Double goal;
    private Float capitalPercentage;
    private String title;
    private LocalDateTime deadline;
    private Long user;

}
