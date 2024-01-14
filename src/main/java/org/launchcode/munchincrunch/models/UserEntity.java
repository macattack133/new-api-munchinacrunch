package org.launchcode.munchincrunch.models;

import org.springframework.data.annotation.Id;
import javax.persistence.*;

@Entity
@Table(name = "users") //maps to MySQL
public class UserEntity {
    @Id //primary key for the users table
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Will use the identity column strategy

    private Long id;
    private String username;
    private String password;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    // one user can save many restaurants

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
