package com.CN.Gym.jwt;

import java.util.Date;

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

    public String getUserNameFromToken(String token){
        Claims claims = getClaimsFromToken(token);

        String username = claims.getSubject();

        return username;
    }

    public boolean isTokenExpired(String token){
        Claims claims = getClaimsFromToken(token);

        Date expireDate = claims.getExpiration();

        return expireDate.before(new Date());
    }
}
