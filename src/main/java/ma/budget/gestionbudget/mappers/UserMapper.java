package ma.budget.gestionbudget.mappers;


import ma.budget.gestionbudget.entities.User;
import ma.budget.gestionbudget.models.requests.UserRequest;
import ma.budget.gestionbudget.models.responses.UserResponse;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User userRequestToUser(UserRequest userRequest);
    UserResponse userToUserRespoonse(User user);
    List<UserResponse> mapUser(List<User> user);
    //Set<UserResponse> mapUser(Set<User> user);


}
