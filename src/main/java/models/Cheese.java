package models;

public class Cheese {
    private Integer cheeseId;
    private String name;
    private String description;

    public Cheese(String name, String description){
        this();
        this.name=name;
        this.description=description;
    }
    public Cheese(){
        Integer nextId =1;
        cheeseId = nextId;
        nextId++;
    }
    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
