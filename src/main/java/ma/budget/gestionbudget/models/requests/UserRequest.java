package ma.budget.gestionbudget.models.requests;

import lombok.Data;
import java.util.Set;

@Data
public class UserRequest {

    private String userName;
    private String password;
    private Double balance;

    private Set<Long> expenses;

    private Set<Long>financialGoals;


}
