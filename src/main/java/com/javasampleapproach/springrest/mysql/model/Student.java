package com.javasampleapproach.springrest.mysql.model;

import javax.persistence.*;

@Entity
@Table(name= "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Column(name= "level")
    private int level;

    public Student() {
    }

    public Student(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", level=" + level + "]";
    }

}
