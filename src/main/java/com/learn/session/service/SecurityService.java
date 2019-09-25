package com.learn.session.service;


public interface SecurityService {
    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
