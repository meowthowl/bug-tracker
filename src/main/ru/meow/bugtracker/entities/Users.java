package main.ru.meow.bugtracker.entities;

import java.util.UUID;

public class Users {
    private String id;
    private String userName;

    public Users(String userName) {
        this.id = UUID.randomUUID().toString();
        this.userName = userName;
    }

    public String getUserId() {
        return id;
    }

    public void setUserId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User[" +
                "userId=" + id +
                ", userName='" + userName + '\'' +
                ']';
    }
}
