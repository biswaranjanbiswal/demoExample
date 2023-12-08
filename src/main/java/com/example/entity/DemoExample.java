package com.example.entity;

import jakarta.persistence.*;

@Entity
public class DemoExample {
    @Id //for primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //for auto_increment
    private int id;
    private String name; //name should same with database column name
    private String course;
    private int fee;

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

    public String getCourse() {

        return course;
    }

    public void setCourse(String course) {

        this.course = course;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {

        this.fee = fee;
    }
}
