package com.CN.Gym.jwt;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.spec.SecretKeySpec;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtAuthenticationHelper {

    private static final String TOKEN_SECRECT_KEY = "ValarMorghulisvalardohaeris";
    private static final long TOKEN_VALIDITY = 60*60;
    
    public Claims getClaimsFromToken(String token){
        Claims claims = Jwts.parserBuilder().setSigningKey(TOKEN_SECRECT_KEY.getBytes())
                            .build().parseClaimsJws(token).getBody();
                        
            return claims;
    }

    public String generateToken(UserDetails userDetails){
        Map<String ,Object> map = new HashMap<>();

        return Jwts.builder().setClaims(map)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + TOKEN_VALIDITY * 1000))
                .signWith(new SecretKeySpec(TOKEN_SECRECT_KEY.getBytes(), 
                    SignatureAlgorithm.HS512.getJcaName()),SignatureAlgorithm.HS512)
                .compact();
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
