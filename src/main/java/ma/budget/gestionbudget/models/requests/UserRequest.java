package ma.budget.gestionbudget.models.requests;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {

    private String userName;
    private String password;
    private Double balance;

    private List<Long> expensesId;

    private List<Long>financialGoalsId;


}
