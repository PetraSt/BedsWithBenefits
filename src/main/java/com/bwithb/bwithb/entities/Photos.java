package com.bwithb.bwithb.entities;

import java.util.UUID;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Photos")
public class Photos {
    @Id
    private UUID id;
   

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "listsing_id", referencedColumnName = "id")
    private Listings listing_id;
  
    public Photos() {
    }
   
    
//id, Listings_id

public Photos(UUID id) {
    super();
    this.id = id;
}

public UUID getId() {
    return id;
}

public void setId(UUID id) {
    this.id = id;
}

public Listings getListing_id() {
    return listing_id;
}

public void setListing_id(Listings listing_id) {
    this.listing_id = listing_id;
}

//id, Users_id

@Override
public String toString() {
 return "Role [id=" + id + "]";
}
}
