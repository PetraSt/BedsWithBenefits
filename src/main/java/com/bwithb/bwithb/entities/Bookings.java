package com.bwithb.bwithb.entities;

import java.sql.Date;//maybe it should be changed to util
import java.util.UUID;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Bookings")
public class Bookings {
    @Id
    private UUID id;
    @NotNull
    private Date starting_date;
    @NotNull
    private Date ending_date;
    @NotNull
    private float total_cost;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "users_id", referencedColumnName = "id")
    private Users users_id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "listing_id", referencedColumnName = "id")
    private Listings listing_id;


    public Bookings() {

    }

    public Bookings(UUID id, Users users_id, Listings listing_id, Date starting_date, Date ending_date, int total_cost) {
        super();
        this.id = id;
        this.users_id = users_id;
        this.listing_id = listing_id;
        this.starting_date = starting_date;
        this.ending_date = ending_date;
        this.total_cost = total_cost;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Users getUser_id() {
        return users_id;
    }

    public void setUser_id(Users users_id) {
        this.users_id = users_id;
    }

    public Listings getListing_id() {
        return listing_id;
    }

    public void setListing_id(Listings listing_id) {
        this.listing_id = listing_id;
    }

    public Date getStarting_date() {
        return starting_date;
    }

    public void setStarting_date(Date starting_date) {
        this.starting_date = starting_date;
    }

    public Date getending_date() {
        return ending_date;
    }

    public void setEnding_date(Date ending_date) {
        this.ending_date = ending_date;
    }

    public float getTotal_cost() {
        return total_cost;
    }

    public void setTotal_cost(float total_cost) {
        this.total_cost = total_cost;
    }

    // "Users", "Listings", starting_date , ending_date , total_cost

    @Override
    public String toString() {
        return "Listings [id=" + id + ", User=" + users_id + ", Listing=" + listing_id + ", starting_date="
                + starting_date + ", ending_date=" + ending_date + ", total_cost=" + total_cost + "]";
    }

}
