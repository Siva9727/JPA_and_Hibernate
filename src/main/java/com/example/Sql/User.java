package com.example.Sql;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // hibernate will understand whose attributes are taken to create a table
@Table(name = "user_info") //  for giving table name ,by default table name == class name
public class User {
    @Id// used to specify the primary key of the table
    private int id;
    private String name;
    private int age;
    private String mobNo;

    // always create a default constructor
    User(){

    }
    // best practice create a constructor for all attributes
    public User(int id, String name, int age,String mobNo) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mobNo = mobNo;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
