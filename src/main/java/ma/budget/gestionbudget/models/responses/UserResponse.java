package ma.budget.gestionbudget.models.responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserResponse {

    private Long id;
    private String userName;
    private String password;
    private Double balance;
    private List<ExpenseResponse> expenses;
    private List<FinancialGoalResponse>financialGoals;
}
