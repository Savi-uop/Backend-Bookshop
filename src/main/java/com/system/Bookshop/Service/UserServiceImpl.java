package com.system.Bookshop.Service;


import com.system.Bookshop.Entity.User;
import com.system.Bookshop.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepo userRepo;

   @Override
    public User saveUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public User getUserById(Integer id) {
        return userRepo.findById(id).get();
    }

    @Override
    public void deleteUser(Integer id) {
        userRepo.deleteById(id);
    }
}
