package com.CN.Gym.service;


import com.CN.Gym.exception.GymNotFoundException;
import com.CN.Gym.model.Gym;
import com.CN.Gym.repository.GymRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GymService {

    /*
        This is the service class for Gym, you need to complete the class by doing the following:
        a. Use appropriate annotations.
        b. Complete the methods given below.
        c. Autowire the necessary dependencies.
     */

     @Autowired
     private GymRepository gymRepository;


    public List<Gym> getAllGyms() {   
        return gymRepository.findAll();
    }

     public Gym getGymById(Long id) {
        return gymRepository.findById(id)
            .orElseThrow(() -> new GymNotFoundException("gym not found by Id: " + id));
    }

    // public void deleteGymById(Long id) {        

    // }

    // public void updateGym(GymDto gymDto, Long id) {

    // }

    // public void createGym(GymDto gymDto) {

    // }

    // public void addMember(Long userId, Long gymId) {

    // }

    // public void deleteMember(Long userId, Long gymId) {

    // }
}
