package main.ru.meow.bugtracker.entities;

import java.util.UUID;

public class Issues {
        private String id;
        private String projectId;
        private String userId;
        private String name;
        public Issues (String projectId,String userId) {
            this.id = UUID.randomUUID().toString();
            this.projectId = projectId;
            this.userId = userId;
        }

    public void setId(String id){
            this.id = id;
    }
    public String getId() {
        return id;
    }

    public void setProjectId(String projectId){
            this.projectId = projectId;
    }
    public String getProjectId() {
        return projectId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
        public String toString() {
            return "Issue[" +
                    "issueName=" + name +
                    "projectId=" + projectId +
                    ", issueId=" + id +
                    ", userId: " + userId;
        }

    }
