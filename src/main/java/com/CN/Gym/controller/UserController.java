package com.CN.Gym.controller;


import com.CN.Gym.model.User;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {


    // 1. GET “/user/all”: This API allows the admin to fetch all the users from the database
    //                          and returns an OK HTTP status.
    // @GetMapping("/all")
    public List<User> getAllUsers() {
        return null;
    }


    // 2. POST "/user/register" (@RequestBody UserRequest userRequest): This API registers a new user record into the database
    //                                                                  and can be accessed by anyone. It returns a CREATED HTTP status.
    public void registerUser() {

    }


    // 3. GET “/user/{id}”: This API allows the customer to fetch the user record by its
    //                      ID and returns an OK HTTP status.
    public User getUserById() {
        return null;
    }


   // 4. PUT "/user/{id}": This API allows customers to update a user record by its ID and
   //                      returns an OK HTTP status.
    public void updateUser(){

    }


    // 5. DELETE "/user/{id}" (@PathVariable Long id): This API lets the admin delete a User record by its ID
    //                                                 and returns an OK HTTP status.
    public void deleteUser(){

    }


    // 6. POST "/user/workout/{userId}" (@RequestBody WorkoutDto workoutDto, @PathVariable Long userId): This API allows the trainer to assign a workout to a customer by its
    //                                                                                                    ID and returns a CREATED HTTP status.
    public void addWorkout() {

    }
}
