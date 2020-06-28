package com.javaex.springboot.springbootcrudrestfulwebservices.model;

import javax.persistence.*;

@Entity
@Table(name = "permission")
public class Permission {

    private int permissionId;
    private String permissionName;

    public Permission() {
        super();
    }

    public Permission(int permissionId, String permissionName) {
        super();
        this.permissionId = permissionId;
        this.permissionName = permissionName;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(int permissionId) {
        this.permissionId = permissionId;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }


}
