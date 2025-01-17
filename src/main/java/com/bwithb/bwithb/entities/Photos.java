package com.bwithb.bwithb.entities;

import java.util.UUID;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Photos")
public class Photos {
    @Id
    private UUID id;
    private UUID Listings_id;
  
    public Photos() {
    }
   
    
//id, Listings_id

public Photos(UUID id, UUID Listings_id) {
    super();
    this.id = id;
    this.Listings_id = Listings_id;
}

public UUID getId() {
    return id;
}

public void setId(UUID id) {
    this.id = id;
}

public UUID getListings_id() {
    return Listings_id;
}

public void setListings_id(UUID Listings_id) {
    this.Listings_id = Listings_id;
}

//id, Users_id

@Override
public String toString() {
 return "Role [id=" + id + ", Listings_id=" + Listings_id + "]";
}
}
