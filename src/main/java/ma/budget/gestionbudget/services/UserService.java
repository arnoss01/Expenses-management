package ma.budget.gestionbudget.services;

import ma.budget.gestionbudget.models.requests.UserRequest;
import ma.budget.gestionbudget.models.responses.UserResponse;

import java.util.List;
import java.util.Set;

public interface UserService {

    UserResponse addUser(UserRequest userRequest);
    UserResponse getUser(Long id);
    List<UserResponse> getAll();
    UserResponse updateUser(UserRequest userRequest , Long id);
    void deleteUser(Long id);
}
