package com.CN.Gym.controller;

import com.CN.Gym.dto.GymDto;
import com.CN.Gym.model.Gym;
import com.CN.Gym.service.GymService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gym")
public class GymController {

    @Autowired
    private GymService gymService;
    
    // 1. GET “/gym/all”: This API allows the admin to fetch all the gym records and returns an OK HTTP status.
    @GetMapping("/all")
    public List<Gym> getAllGyms() {
        return gymService.getAllGyms();
    }


    // 2. GET “/gym/{id}” (@PathVariable Long id): This API allows the user to fetch the tax record by its ID
    //                                             and returns an OK HTTP status.
    @GetMapping("/{id}")
    public Gym getGymById(@PathVariable Long id){
        return gymService.getGymById(id);
    }


    // 3. POST /gym/create: This API allows the admin to create a gym record and returns a CREATED HTTP status.
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void createGym(@RequestBody GymDto gymDto) {
        gymService.createGym(gymDto);
    }


    // 4. PUT "/gym/{id}" (@RequestBody GymDto gymDto, @PathVariable Long id): This API allows admins to update a
    //                                                                         gym record by its ID and returns an OK HTTP status.
    public void updateGym(){

    }


    // 5. DELETE "/gym/{id}" (@PathVariable Long id): This API lets admins delete a gym record by its ID and returns an OK HTTP status.
    public void deleteGym(){

    }


    // 6. POST "/gym/addMember" (@RequestParam Long userId, @RequestParam Long gymId): This API allows the admin to add users to a particular gym by passing userId
    //                                                                                 and gymId as requestParam. It returns a CREATED HTTP status.
    public void addMember() {

    }


    // 7. DELETE "/gym/deleteMember" (@PathParam("userId") Long userId, @PathParam("gymId") Long gymId): This API allows the admin to delete users to a particular gym
    //                                                                                                    by passing userId and gymId as path params. It returns an OK HTTP status.
    public void deleteMember() {

    }

}
