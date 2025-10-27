package com.huy.auth.services;

public interface JwtService {
    String extractUserEmail(String jwt);
}
