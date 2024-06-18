package com.example.test.demos.pojo;

public class User {

    String account;
    String password;

    char permission;

    public User(String account, String password, char permission) {
        this.account = account;
        this.password = password;
        this.permission = permission;
    }

    public User() {
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public char getPermission() {
        return permission;
    }

    public void setPermission(char permission) {
        this.permission = permission;
    }

    @Override
    public String toString() {
        return "User{" +
                "account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", permission=" + permission +
                '}';
    }
}
