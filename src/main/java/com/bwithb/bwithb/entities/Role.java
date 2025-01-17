package com.bwithb.bwithb.entities;


import java.util.UUID;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Role")
public class Role {
    @Id
    private UUID id;
    private UUID Users_id;
  
    public Role() {
    }

    public Role(UUID id, UUID Users_id) {
        super();
        this.id = id;
        this.Users_id = Users_id;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getUsers_id() {
        return Users_id;
    }

    public void setUsers_id(UUID Users_id) {
        this.Users_id = Users_id;
    }

 //id, Users_id
 
 @Override
 public String toString() {
     return "Role [id=" + id + ", Users_id=" + Users_id + "]";
 }
}
