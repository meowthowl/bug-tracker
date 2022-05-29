package main.ru.meow.bugtracker.repository;

import main.ru.meow.bugtracker.entities.Issues;
import main.ru.meow.bugtracker.entities.Users;

import java.util.ArrayList;
import java.util.List;

public class UsersRepository {

    private List<Users> users = new ArrayList<>();

    public void createUser(String name){
        users.add(new Users(name));
    }

    public Users viewByUserId(String id){
        for (Users u : users){
            if (id.equals(u.getUserId())){
                return u;
            }
        }return null;
    }

    public void viewAllUsers(){
        for (Users u : users){
            System.out.println(u);
        }
    }


}
