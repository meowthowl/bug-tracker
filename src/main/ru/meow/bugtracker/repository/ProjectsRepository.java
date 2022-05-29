package main.ru.meow.bugtracker.repository;

import main.ru.meow.bugtracker.entities.Projects;

import java.util.ArrayList;
import java.util.List;

public class ProjectsRepository {
        private List<Projects> projects = new ArrayList<>();

        public void createProject(String name) {
            projects.add(new Projects(name));
        }

        public Projects viewByProjId(String id){
            for (Projects p : projects){
                if (id.equals(p.getId())){
                    return p;
                }
            }
            return null;
        }

        public void viewAllProjects() {
            for (Projects p : projects) {
                System.out.println(p);
            }

        }

        public void update(String id, String name) {
            for (Projects p : projects) {
                if (id.equals(p.getId())) {
                    p.setName(name);
                }
            }
            System.out.println("New project name " + name);

        }


        public void remove(String id) {
            for (Projects p : projects) {
                if (id.equals(p.getId())) {
                    projects.remove(p);
                }
            }
        }

}
