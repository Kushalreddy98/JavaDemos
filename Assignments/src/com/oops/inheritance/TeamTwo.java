package com.oops.inheritance;

public class TeamTwo extends Project {

    String[] tools = new String[]{"junit", "Maven", "git", "docker"};
    public TeamTwo(String projectName, int durationinMonths, String domain, String projectManager, String[] tools) {
        super(projectName, durationinMonths, domain, projectManager);
        this.tools=tools;
    }

    void showSupportTools() {

        for (String tool : tools) {
            System.out.println(tool);
        }
    }
}
