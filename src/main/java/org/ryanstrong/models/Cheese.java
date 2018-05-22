package org.ryanstrong.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Cheese {
//    @Id
//    @GeneratedValue
    private int id;
    private static int nextId =1;

    @NotNull
    @Size(min=1, max=15)
    private String name;

    @NotNull
    @Size(min=1, message = "Description can not be empty")
    private String description;

    private Integer cheeseId;

    public Cheese(String name, String description){
        this();
        this.name=name;
        this.description=description;
    }
    public Cheese(){
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

    public Integer getId() {
        return id;
    }
    public void setId(int id){this.id=id;}
}
