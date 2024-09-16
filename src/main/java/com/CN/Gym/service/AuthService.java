package com.CN.Gym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

import com.CN.Gym.dto.JwtRequest;
import com.CN.Gym.dto.JwtResponse;

@Service
public class AuthService {

    @Autowired
    AuthenticationManager manager;
    
    public JwtResponse getResponse(JwtRequest jwtRequest){
        this.doAuthenticate(jwtRequest.getUsername(),jwtRequest.getPassword());

        return null;
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
