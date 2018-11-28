package com.sample.drop.entities;


public class Resource {

    private Integer resourceId;

    private Integer resourceName;

    private String projectName;

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    public Integer getResourceName() {
        return resourceName;
    }

    public void setResourceName(Integer resourceName) {
        this.resourceName = resourceName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Override
    public String toString() {
        return "Resource{" +
                "resourceId=" + resourceId +
                ", resourceName=" + resourceName +
                ", projectName='" + projectName + '\'' +
                '}';
    }
}
