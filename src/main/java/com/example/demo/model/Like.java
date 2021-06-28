package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "likes")
public class Like {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "id_user")
    private long id_user;

    @Column(name = "id_blog")
    private long id_blog;

    @Column(name = "count")
    private int count;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId_user() {
        return id_user;
    }

    public void setId_user(long id_user) {
        this.id_user = id_user;
    }

    public long getId_blog() {
        return id_blog;
    }

    public void setId_blog(long id_blog) {
        this.id_blog = id_blog;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
