package com.CN.Gym.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class GymSecurityConfig {

    /*
        1. Add relevant annotations to make this class a configuration class and enable method leve security.
        2. Create authenticationManager, passwordEncoder bean.
        3. Create securityFilterChain bean with httpBasic security and use antMatcher to make "/user/register"
           an open API.
     */

     @Bean
     public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http.csrf().disable()
            .authorizeRequests()
            .antMatchers("/user/register").permitAll()
            .anyRequest()
            .authenticated()
            .and()
            .httpBasic();
        
        return http.build();
     }

}
