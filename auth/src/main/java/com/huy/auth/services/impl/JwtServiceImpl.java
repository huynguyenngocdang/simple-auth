package com.huy.auth.services.impl;

import com.huy.auth.services.JwtService;
import org.springframework.stereotype.Service;

@Service
public class JwtServiceImpl implements JwtService {
    @Override
    public String extractUserEmail(String jwt) {
        return "";
    }
}
