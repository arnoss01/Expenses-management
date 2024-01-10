package ma.budget.gestionBudget.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Builder
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private LocalDateTime spendingDate;
    private Double ammount;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="expense_category_id", nullable=false)
    private ExpenseCategory expenseCategory;

}
