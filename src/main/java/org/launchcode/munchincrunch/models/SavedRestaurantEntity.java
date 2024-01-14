package org.launchcode.munchincrunch.models;

import jakarta.persistence.*;

@Entity
@Table(name = "saved_restaurants") //maps to MySQL
public class SavedRestaurantEntity {
    @Id //primary key for saved_restaurant table
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String restaurantName;
    private double restaurantRating;
    private String restaurantAddress;
    private String phoneNumber;

    // Constructors, getters, setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public double getRestaurantRating() {
        return restaurantRating;
    }

    public void setRestaurantRating(double restaurantRating) {
        this.restaurantRating = restaurantRating;
    }

    public String getRestaurantAddress() {
        return restaurantAddress;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}