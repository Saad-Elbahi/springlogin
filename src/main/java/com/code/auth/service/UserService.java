package com.code.auth.service;

import com.code.auth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
