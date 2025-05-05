package com.example.FirstProject.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import com.example.FirstProject.entity.SiteUser;
import com.example.FirstProject.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public SiteUser create(String username, String email, String password){
        SiteUser user = new SiteUser();
        user.SetUsername(username);
        user.SetEmail(email);
        user.setPassword(passwordEncoder.encode(password));
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        user.setPassword(passwordEncoder.encode(password));
        this.userRepository.save(user);
        return user;
    }
}
