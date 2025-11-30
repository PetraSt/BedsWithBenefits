package com.bwithb.bwithb.entities;

import java.sql.Date;//maybe it should be changed to util
import java.util.UUID;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Bookings")
public class Bookings {
    @Id
    private UUID id;
    private UUID Users_id;
    private UUID Listings_id;
    private Date starting_date;
    private Date ending_date;
    private float total_cost;

    public Bookings() {

    }

    public Bookings(UUID id, UUID Users_id, UUID Listings_id, Date starting_date, Date ending_date, int total_cost) {
        super();
        this.id = id;
        this.Users_id = Users_id;
        this.Listings_id = Listings_id;
        this.starting_date = starting_date;
        this.ending_date = ending_date;
        this.total_cost = total_cost;
    }
    // "Users_id", "Listings_id", starting_date , ending_date , total_cost

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

    public UUID getListings_id() {
        return Listings_id;
    }

    public void setListings_id(UUID Listings_id) {
        this.Listings_id = Listings_id;
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

    // "Users_id", "Listings_id", starting_date , ending_date , total_cost

    @Override
    public String toString() {
        return "Listings [id=" + id + ", Users_id=" + Users_id + ", Listings_id=" + Listings_id + ", starting_date="
                + starting_date + ", ending_date=" + ending_date + ", total_cost=" + total_cost + "]";
    }

}
