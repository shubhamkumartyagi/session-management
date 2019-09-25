package com.learn.session.service;

import com.learn.session.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
