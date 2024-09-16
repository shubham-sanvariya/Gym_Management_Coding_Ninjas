package com.CN.Gym.jwt;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

@Component
public class JwtAuthenticationHelper {

    private static final String TOKEN_SECRECT_KEY = "ValarMorghulisvalardohaeris";
    
    public Claims getClaimsFromToken(String token){
        Claims claims = Jwts.parserBuilder().setSigningKey(TOKEN_SECRECT_KEY.getBytes())
                            .build().parseClaimsJws(token).getBody();
                        
            return claims;
    }
}
