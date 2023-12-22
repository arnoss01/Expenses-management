package ma.budget.gestionbudget.models.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {

    private Long id;
    private String userName;
    private String password;
    private Double balance;
    private Set<ExpenseResponse> expenses;
    private Set<FinancialGoalResponse>financialGoals;
}
