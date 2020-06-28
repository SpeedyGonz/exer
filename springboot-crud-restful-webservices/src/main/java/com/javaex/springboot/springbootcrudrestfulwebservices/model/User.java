package com.javaex.springboot.springbootcrudrestfulwebservices.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int personId;

    private String personName;

    @OneToMany
    private Collection<Permission> permission = new ArrayList<Permission>();

    public User() {
        super();
    }

    public User(int personId, String personName, Collection<Permission> permission) {
        this.personId = personId;
        this.personName = personName;
        this.permission = permission;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }


    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public Collection<Permission> getPermission() {
        return permission;
    }

    public void setPermission(Collection<Permission> permission) {
        this.permission = permission;
    }

}
