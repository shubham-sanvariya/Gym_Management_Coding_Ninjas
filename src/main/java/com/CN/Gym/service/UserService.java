package com.CN.Gym.service;

import com.CN.Gym.dto.UserRequest;
import com.CN.Gym.model.Role;
import com.CN.Gym.model.User;
import com.CN.Gym.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class UserService {

        /*
        This is the service class for User, you need to complete the class by doing the following:
        a. Use appropriate annotations.
        b. Complete the methods given below.
        c. Autowire the necessary dependencies.
     */


    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // public void createUser(UserRequest userRequest) {
    //     BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    //     String encodedPassword = encoder.encode(userRequest.getPassword());
    //     User user = User.builder().email(userRequest.getEmail()).age(userRequest.getAge())
    //             .gender(userRequest.getGender()).password(encodedPassword)
    //             .build();
    //     Role role = new Role();
    //     Set<Role> roles = new HashSet<>();
    //     if(userRequest.getUserType() != null) {
    //         if (userRequest.getUserType().equalsIgnoreCase("TRAINER")) {
    //             role.setRoleName("ROLE_TRAINER");
    //             roles.add(role);
    //             user.setRoles(roles);
    //         } else if (userRequest.getUserType().equalsIgnoreCase("ADMIN")) {
    //             role.setRoleName("ROLE_ADMIN");
    //             roles.add(role);
    //             user.setRoles(roles);
    //         } else {
    //             role.setRoleName("ROLE_CUSTOMER");
    //             roles.add(role);
    //             user.setRoles(roles);
    //         }
    //     }
    //     else {
    //         role.setRoleName("ROLE_CUSTOMER");
    //         roles.add(role);
    //         user.setRoles(roles);
    //     }
    //     userRepository.save(user);
    // }

    // public User getUserById(Long id) {

    // }

    // public void updateUser(UserRequest userRequest, Long id) {

    // }

    // public void deleteUser(Long id){
        
    // }

    // public void addWorkout(WorkoutDto workoutDto, Long userId) {

    // }
}
