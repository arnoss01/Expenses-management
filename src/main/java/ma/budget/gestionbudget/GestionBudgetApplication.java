package ma.budget.gestionbudget;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ma.budget.gestionbudget.Repository.UserRepository;
import ma.budget.gestionbudget.entities.User;
import ma.budget.gestionbudget.models.requests.UserRequest;
import ma.budget.gestionbudget.services.UserService;

@SpringBootApplication
public class GestionBudgetApplication implements CommandLineRunner{

    @Autowired
    UserRepository userRepo;

    public static void main(String[] args) {
        SpringApplication.run(GestionBudgetApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        userRepo.deleteAll();
        User u1 = new User(
                1L, "user1", "pass1", 
                5000.0, null, null
            );
        User u2 = new User(
                2L, "user2", "pass2", 
                500000.0, null, null
            );
        u1 = userRepo.save(u1);
        u2 = userRepo.save(u2);

        

    }

}
