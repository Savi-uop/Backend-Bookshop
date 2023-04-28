package com.system.Bookshop.Service;


import com.system.Bookshop.Entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    public User saveUser(User user);

    public List<User> getAllUsers();

    public abstract User getUserById(Integer id);

    public void deleteUser(Integer id);
}
