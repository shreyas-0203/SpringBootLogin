package com.registeration.SpringLogin.Service;


import com.registeration.SpringLogin.Entity.Role;
import com.registeration.SpringLogin.Entity.User;
import com.registeration.SpringLogin.Repository.UserRepo;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserServiceImp implements UserService {

    private UserRepo userRepo;

    public UserServiceImp(UserRepo userRepo) {
        this.userRepo = userRepo;
    }


    @Override
    public User save(User theUser) {

        User user = new User(theUser.getFirstame(), theUser.getLastName(), theUser.getEmail(), theUser.getPassword(),
                Arrays.asList(new Role("ROLE_USER")));

        return userRepo.save(user);
    }
}
