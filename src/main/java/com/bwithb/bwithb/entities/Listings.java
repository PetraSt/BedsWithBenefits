package com.bwithb.bwithb.entities;
import java.util.UUID;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Listings")
public class Listings {
    @Id
    private UUID id;
    private String title;
    private String description ;
    private String location;
    private float price;
    private int max_guests;

    public Listings(){

    }
    public Listings(UUID id, String title, String description, String location, float price, int max_guests) {
        super();
        this.id = id;
        this.title = title;
        this.description = description;
        this.location = location;
        this.price = price;
        this.max_guests = max_guests;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getMax_guests() {
        return max_guests;
    }

    public void setMax_guests(int max_guests) {
        this.max_guests = max_guests;
    }

// String title, String description, String location, float price, int max_guests
    @Override
    public String toString() {
        return "Listings [id=" + id + ", title=" + title + ", description=" + description + ", location=" + location + ", price=" + price +  ", max_guests=" + max_guests +"]";
    }
}
