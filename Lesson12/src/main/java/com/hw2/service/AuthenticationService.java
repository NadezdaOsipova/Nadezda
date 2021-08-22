package com.hw2.service;

public interface AuthenticationService {

    boolean checkAuthorization(String login, String password, String confirmPassword) throws Exception;
}