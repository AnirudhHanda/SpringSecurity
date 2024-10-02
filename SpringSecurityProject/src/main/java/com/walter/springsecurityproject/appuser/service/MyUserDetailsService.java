package com.walter.springsecurityproject.appuser.service;

import com.walter.springsecurityproject.appuser.model.AppUser;
import com.walter.springsecurityproject.appuser.model.UserPrincipal;
import com.walter.springsecurityproject.appuser.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        AppUser user = userRepo.findByUsername(username);

        if (user == null) {
            System.out.println("User 404");
            throw new UsernameNotFoundException("User not found");
        }

        return new UserPrincipal(user);
    }
}
