package org.launchcode.munchincrunch.models;
import jakarta.persistence.*;
import java.util.List;

@Table(name = "users") //maps to MySQL
public class UserEntity {
    @Id //primary key for the users table
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Will use the identity column strategy

    private Long id;
    private String username;
    private String password;

    @ManyToMany //users can have many favorite dining spots & vice versa
    @JoinTable(
            name = "favorite_restaurants",
            joinColumns = @JoinColumn(name = "users_id"),
            inverseJoinColumns = @JoinColumn(name = "restaurants_id")
    )

    private List<FavoriteRestaurantEntity> favoriteRestaurantEntity;

    // Constructors, getters, setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
