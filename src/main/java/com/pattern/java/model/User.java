package com.pattern.java.model;

public class User {

    private String name;
    private String email;
    private String password;
    private Boolean Archived;

    public User(String name, String email, String password, Boolean Archived) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.Archived = Archived;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getArchived() {
        return Archived;
    }

    public void setArchived(Boolean archived) {
        Archived = archived;
    }

    public void Archive() {
        this.Archived = true;
    }
}
