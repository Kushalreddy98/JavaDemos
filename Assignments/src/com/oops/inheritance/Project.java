package com.oops.inheritance;

public class Project {
    String projectName;
    int durationinMonths;
    String domain;
    String projectManager;

    public Project(String projectName, int durationinMonths, String domain, String projectManager) {
        this.projectName = projectName;
        this.durationinMonths = durationinMonths;
        this.domain = domain;
        this.projectManager = projectManager;
    }

    void showProjectDetails(){
        System.out.println(projectName);
        System.out.println(durationinMonths);
        System.out.println(domain);
        System.out.println(projectManager);
    }
}
