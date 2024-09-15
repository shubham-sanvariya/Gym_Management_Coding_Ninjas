package com.CN.Gym.controller;

import com.CN.Gym.model.Gym;

import java.util.List;

public class GymController {


    // 1. GET “/gym/all”: This API allows the admin to fetch all the gym records and returns an OK HTTP status.
    public List<Gym> getAllGyms() {
        return null;
    }


    // 2. GET “/gym/{id}” (@PathVariable Long id): This API allows the user to fetch the tax record by its ID
    //                                             and returns an OK HTTP status.
    public Gym getGymById(){
        return null;
    }


    // 3. POST /gym/create: This API allows the admin to create a gym record and returns a CREATED HTTP status.
    public void createGym() {

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
