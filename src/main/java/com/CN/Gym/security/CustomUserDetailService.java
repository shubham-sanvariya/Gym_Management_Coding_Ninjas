package com.CN.Gym.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.CN.Gym.exception.UserNotFoundException;
import com.CN.Gym.repository.UserRepository;

@Service
public class CustomUserDetailService implements UserDetailsService {

	private UserRepository userRepository;

	public CustomUserDetailService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return this.userRepository.findByEmail(username).
			orElseThrow(() -> new UserNotFoundException("user not found by email: " + username));
	}

	/*
	 1. Autowire the necessary dependencies and override the interface methods.
	 */

}
