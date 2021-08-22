package com.hw2.service;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String[]> passwordList = List.of(
                new String[]{"kmjkm", "11111111", "11111111"},
                new String[]{"kmjkm", "11111111", "11111111"},
                new String[]{"km", "1111", "1111"},
                new String[]{"kmjkmgjnhb", "111", "111"},
                new String[]{"kmjkm", "11111111", "11111111"},
                new String[]{"kmjkm", "1111111111111111111111111111111111111", "11111111"},
                new String[]{"kmjkm", "11111111", "11111111"}
        );
        AuthenticationService authenticationService = new AuthenticationServiceImpl();
        for (String[] lists : passwordList) {
            System.out.println("Логин: " + lists[0] + "; Пароль: " + lists[1] + "; Подтверждение пароля: " + lists[2] + ";");

            try {
                System.out.println(authenticationService.checkAuthorization(lists[0], lists[1], lists[2]) ? "Авторизация прошла успешно!" : "Авторизация отклонена");
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
}
