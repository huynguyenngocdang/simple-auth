package com.huy.auth.services;

import io.jsonwebtoken.Claims;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Map;
import java.util.function.Function;

public interface JwtService {
    String extractUserEmail(String jwt);

    <T> T extractClaims(String token, Function<Claims, T> claimsResolver);

    String generateToken(Map<String, Object> claims, UserDetails userDetails);

    String generateToken(UserDetails userDetails);

    boolean isTokenValid(String token, UserDetails userDetails);

}
