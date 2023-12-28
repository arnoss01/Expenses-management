package ma.budget.gestionbudget;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestionBudgetApplication implements CommandLineRunner{

    public static void main(String[] args) {
        SpringApplication.run(GestionBudgetApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // populate database
    }

}
