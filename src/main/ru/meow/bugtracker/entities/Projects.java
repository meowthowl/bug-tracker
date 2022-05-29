package main.ru.meow.bugtracker.entities;

import java.util.UUID;

public class Projects {
    private String id;
    private String name;

    public Projects(String name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Projects[" +
                "projectId=" + id +
                ", projectName='" + name + '\'' +
                ']';
    }

}
