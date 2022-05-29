package main.ru.meow.bugtracker.repository;

import main.ru.meow.bugtracker.entities.Issues;

import java.util.ArrayList;
import java.util.List;

public class IssuesRepository {
    private List<Issues> issues = new ArrayList<>();

    public void reportIssue(String projId, String userId) {
        issues.add(new Issues(projId, userId));
    }


    public void viewAllIssues() {
        for (Issues i : issues) {
            System.out.println(i);
        }

    }
    public void viewIssueByUserId(String userId){
        for (Issues i : issues) {
            if (userId.equals(i.getUserId())) {
                System.out.println(i);
            }
        }
    }

    public void viewIssueByProjId(String projId) {
        for (Issues i : issues) {
            if (projId.equals(i.getProjectId())) {
                System.out.println(i);
            }
        }
    }
}




