package com.CN.Gym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.CN.Gym.dto.JwtRequest;
import com.CN.Gym.dto.JwtResponse;
import com.CN.Gym.jwt.JwtAuthenticationHelper;

@Service
public class AuthService {

    @Autowired
    AuthenticationManager manager;

    @Autowired
    UserDetailsService userDetailsService;

    @Autowired
    JwtAuthenticationHelper jwtHelper;
    
    public JwtResponse getResponse(JwtRequest jwtRequest){
        this.doAuthenticate(jwtRequest.getUsername(),jwtRequest.getPassword());

        UserDetails userDetails = userDetailsService.loadUserByUsername(jwtRequest.getUsername());

        String token = jwtHelper.generateToken(userDetails);

        JwtResponse response = new JwtResponse().builder().jwtToken(token).build();
        return response;
    }

    private void doAuthenticate(String username, String password) {
        UsernamePasswordAuthenticationToken upat = new UsernamePasswordAuthenticationToken(username,password);
        try {
            manager.authenticate(upat);
        } catch (BadCredentialsException e) {
            throw new BadCredentialsException("Invalid username or password");
        }
    }
}
