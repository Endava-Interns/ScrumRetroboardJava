package com.endava.intern.service;

import com.endava.intern.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sstamenkova on 7/8/2016.
 */

@Service
public interface UserService {
    void saveUser(User u);
    List<User> getUserByUsername(String username);
    void deleteUser(User u);
    void deleteUserByID(Long ID);

}
