package com.bwithb.bwithb.entities;


import java.util.UUID;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Role")
public class Role {
    @Id
    private UUID id;

    @NotNull
    private String role_name;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private Users user_id;
  
    public Role() {
    }

    public Role(UUID id, String role_name) {
        super();
        this.id = id;
        this.role_name = role_name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public Users getUser_id() {
        return user_id;
    }

    public void setUser_id(Users user_id) {
        this.user_id = user_id;
    }

 //id, Users_id
 
 @Override
 public String toString() {
     return "Role [id=" + id + ", role_name=" + role_name + "]";
 }
}
