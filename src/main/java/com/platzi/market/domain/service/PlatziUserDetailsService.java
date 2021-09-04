package com.platzi.market.domain.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PlatziUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return new User("manu","{noop}admin",new ArrayList<>());
    }
// Codigo para acceder desde db
//    @Autowired
//    private AccesoRepo accesoRepo;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Access access = accesoRepo.auth(username);
//        return new User(access.getUser(), ("{noop}" + access.getPass()), new ArrayList<>());
//    }
}
