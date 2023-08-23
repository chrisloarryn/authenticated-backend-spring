package com.chrisloarryn.services;

import com.chrisloarryn.models.ApplicationUser;
import com.chrisloarryn.models.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("In the loadUserByUsername method of the UserService class.");

        if(!username.equals("Ethan")) {
            throw new UsernameNotFoundException("User not found by name: " + username);
        }

        Set<Role> roles = new HashSet<>();
        roles.add(new Role(1, "USER"));

        return new ApplicationUser(1, "Ethan", passwordEncoder.encode("password"), roles);
    }
}
