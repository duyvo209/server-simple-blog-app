package com.example.demo.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user")
public class Test implements Serializable {

    private static final long serialVersionUID = 5926468583005150707L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    //default constructor for JSON Parsing
    public Test()
    {
    }

    public Test(long id, String name) {
        this.setId(id);
        this.setName(name);
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

