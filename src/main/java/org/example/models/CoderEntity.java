package org.example.models;

public class CoderEntity {

    private int id;
    private String name;
    private String[] technologies;
    private int experience;
    private String clan;

    public CoderEntity(){}

    public CoderEntity(int id, String name, String[] technologies, int experience, String clan) {
        this.id = id;
        this.name = name;
        this.technologies = technologies;
        this.experience = experience;
        this.clan = clan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getTechnologies() {
        return technologies;
    }

    public void setTechnologies(String[] technologies) {
        this.technologies = technologies;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getClan() {
        return clan;
    }

    public void setClan(String clan) {
        this.clan = clan;
    }
}
