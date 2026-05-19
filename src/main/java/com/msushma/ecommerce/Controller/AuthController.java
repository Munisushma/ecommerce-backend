package com.msushma.ecommerce.Controller;

import com.msushma.ecommerce.Model.User;
import com.msushma.ecommerce.Repository.UserRepository;
import com.msushma.ecommerce.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JwtUtil jwtUtil;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody User user) {
        User existingUser = userRepository.findByEmail(user.getEmail());

        Map<String, String> response = new HashMap<>();

        if (existingUser != null &&
            encoder.matches(user.getPassword(), existingUser.getPassword())) {
            String token = jwtUtil.generateToken(user.getEmail());
            response.put("token", token);
        } else {
            response.put("error", "Invalid email or password");
        }
        return response;
    }
}