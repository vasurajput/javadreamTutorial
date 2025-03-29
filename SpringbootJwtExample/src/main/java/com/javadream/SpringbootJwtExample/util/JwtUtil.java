package com.javadream.SpringbootJwtExample.util;

import java.security.Key;
import java.util.Date;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtUtil {

	private static final String SECRET_KEY = "sdfjwer9238r9hfsf92jfksnf8329jfksn92";
    private static final long EXPIRATION_TIME = 86400000;
    
    public String generateToken(String username) {
    	 Key secretKey = Keys.hmacShaKeyFor(SECRET_KEY.getBytes());
    	 return Jwts.builder()
    			 	.setHeaderParam("typ", "JWT")
    	            .setSubject(username)
    	            .setIssuedAt(new Date())
    	            .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
    	            .claim("name", "Vasu Rajput") 
    	            .claim("admin", true)     
    	            .signWith(secretKey, SignatureAlgorithm.HS256) 
    	            .compact();
    }
    
    public String extractUsername(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(Keys.hmacShaKeyFor(SECRET_KEY.getBytes()))
                .build()
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
    }
    
    public boolean validateToken(String token, UserDetails userDetails) {
        String username = extractUsername(token);
        return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
    }
    
    private boolean isTokenExpired(String token) {
        Date expiration = Jwts.parserBuilder()
                .setSigningKey(Keys.hmacShaKeyFor(SECRET_KEY.getBytes()))
                .build()
                .parseClaimsJws(token)
                .getBody()
                .getExpiration();
        return expiration.before(new Date());
    }
}
