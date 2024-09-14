package com.CN.Gym.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


/*
    This is the entity class, complete this class by doing the following:
    a. Add the required annotations for making this class an entity.
    b. Add the required lombok annotations for getter, setter and constructors
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Gym {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private Long contactNo;
    private String membershipPlans;
    private String facilities;

    @OneToMany(mappedBy = "gym", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<User> users = new ArrayList<>();

    public Gym(String name, String address, Long contactNo, String membershipPlans, String facilities,
            List<User> users) {
        this.name = name;
        this.address = address;
        this.contactNo = contactNo;
        this.membershipPlans = membershipPlans;
        this.facilities = facilities;
        this.users = users;
    }

}
