package ru.netology.hw81;

public class Main {
    public static void main (String[] args) {
        Post post = new Post();
        post.name = "Ivan";
        post.surname = "Ivanov";
        post.patronymic = "Ivanovich";
        post.passport = "3333 № 123456";
        post.phone = "79991234567";
        post.subscription = true;
        post.birthday.day = 15;
        post.birthday.month = 02;
        post.birthday.year = 1988;
    }
}