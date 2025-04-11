

package com.arakelan.springcourse.service;

import com.arakelan.springcourse.model.User;

import java.util.List;


public interface UserService {

    List<User> getAllUsers();

    User getUserById(long id);

    void createUser(User user);

    void updateUser(User user);

    void deleteUser(Long id);
}