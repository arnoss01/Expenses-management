package ma.budget.gestionbudget.controllers;


import ma.budget.gestionbudget.models.requests.UserRequest;
import ma.budget.gestionbudget.models.responses.UserResponse;
import ma.budget.gestionbudget.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    public ResponseEntity<UserResponse> add(@RequestBody UserRequest userRequest){
        UserResponse userResponse = userService.addUser(userRequest);
        return new ResponseEntity<UserResponse>(userResponse, HttpStatus.CREATED);
    }


    @GetMapping
    public ResponseEntity<List<UserResponse>> getall() {
        return new ResponseEntity<List<UserResponse>>(userService.getAll(), HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<UserResponse> getById(@PathVariable Long id) {
        return new ResponseEntity<UserResponse>(userService.getUser(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Long id) {
        userService.deleteUser(id);
        return new ResponseEntity<String>("deleted !", HttpStatus.OK);
    }


    @PutMapping("/{id}")
    public ResponseEntity<UserResponse> update( @RequestBody  UserRequest userRequest , @PathVariable("id") Long id)
             {
        return new ResponseEntity<UserResponse>(userService.updateUser(userRequest,id), HttpStatus.OK);
    }












}
