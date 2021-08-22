package com.hw2.service;

import com.hw2.exception.WrongLoginException;
import com.hw2.exception.WrongPasswordException;
import com.hw2.service.AuthenticationService;

import static com.hw2.constants.Constants.MAX_LOGIN;
import static com.hw2.constants.Constants.MAX_PASSWORD;

public class AuthenticationServiceImpl implements AuthenticationService {
    @Override
    public boolean checkAuthorization(String login, String password, String confirmPassword) throws Exception {
        if (login.length() > MAX_LOGIN) {
            throw new WrongLoginException("В поле ЛОГИН введено больше чем 20 символов");
        }
        if (password.length() > MAX_PASSWORD) {
            throw new WrongPasswordException("В поле ПАРОЛЬ введено больше чем 20 символов");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Введеные даннные не совпадают");
        }
        return true;
    }
}
