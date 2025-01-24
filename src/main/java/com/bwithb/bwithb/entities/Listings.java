package com.bwithb.bwithb.entities;
import java.util.ArrayList;
import java.util.UUID;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Listings")
public class Listings {
    @Id
    private UUID id;
    @NotNull
    private String title;
    @NotNull
    private String description ;
    @NotNull
    private String location;
    @NotNull
    private float price;
    @NotNull
    private int max_guests;

    @OneToMany(mappedBy = "listing_id")
    private ArrayList<Photos> photos;


    public Listings(){

    }
    public Listings(UUID id, String title, String description, String location, float price, int max_guests, ArrayList<Photos> photos) {
        super();
        this.id = id;
        this.title = title;
        this.description = description;
        this.location = location;
        this.price = price;
        this.max_guests = max_guests;
        this.photos=photos;
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


    public ArrayList<Photos> getPhotos(){
        return photos;
    }

    public void setPhotos (ArrayList<Photos> photos){
        this.photos =photos;
    }

// String title, String description, String location, float price, int max_guests
    @Override
    public String toString() {
        return "Listings [id=" + id + ", title=" + title + ", description=" + description + ", location=" + location + ", price=" + price +  ", max_guests=" + max_guests +", photos=" + photos +"]";
    }
}
