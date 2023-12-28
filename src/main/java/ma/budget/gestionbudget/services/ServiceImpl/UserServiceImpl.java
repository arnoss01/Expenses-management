package ma.budget.gestionbudget.services.ServiceImpl;

import ma.budget.gestionbudget.Repository.UserRepository;
import ma.budget.gestionbudget.entities.User;
import ma.budget.gestionbudget.mappers.UserMapper;
import ma.budget.gestionbudget.models.requests.UserRequest;
import ma.budget.gestionbudget.models.responses.UserResponse;
import ma.budget.gestionbudget.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserResponse addUser(UserRequest userRequest) {
        return UserMapper.INSTANCE.userToUserRespoonse(userRepository.save(UserMapper.INSTANCE.userRequestToUser(userRequest)));
    }

    @Override
    public UserResponse getUser(Long id) {
        return UserMapper.INSTANCE.userToUserRespoonse(userRepository.getReferenceById(id));
    }

    @Override
    public List<UserResponse> getAll() {
        return UserMapper.INSTANCE.mapUser(userRepository.findAll());
    }

    @Override
    public UserResponse updateUser(UserRequest userRequest, Long id) {
        User u = UserMapper.INSTANCE.userRequestToUser(userRequest);
        u.setId(id);
        return UserMapper.INSTANCE.userToUserRespoonse(userRepository.save(u));

    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
