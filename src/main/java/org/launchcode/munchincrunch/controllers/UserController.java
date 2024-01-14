package org.launchcode.munchincrunch.controllers;

import org.launchcode.munchincrunch.models.UserEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping("/{userId}")
    public ResponseEntity<UserEntity> getUser(@PathVariable Long userId) {
        // TODO: Implement logic to retrieve and return user information
        // Replace the placeholder logic with actual implementation
        UserEntity user = new UserEntity();
        user.setId(userId);
        user.setUsername("JohnDoe");
        // Set more user details as needed

        return ResponseEntity.ok(user);
    }

    @PostMapping("/create")
    public ResponseEntity<UserEntity> createUser(@RequestBody UserEntity userEntity) {
        // TODO: Implement logic to create a new user
        // Replace the placeholder logic with actual implementation
        userEntity.setId(1L); // Set a sample ID
        return ResponseEntity.ok(userEntity);
    }

    @PutMapping("/{userId}")
    public ResponseEntity<UserEntity> updateUser(@PathVariable Long userId, @RequestBody UserEntity userEntity) {
        // TODO: Implement logic to update user information
        // Replace the placeholder logic with actual implementation
        userEntity.setId(userId); // Update ID for demonstration purposes
        return ResponseEntity.ok(userEntity);
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<String> deleteUser(@PathVariable Long userId) {
        // TODO: Implement logic to delete a user
        // Replace the placeholder logic with actual implementation
        return ResponseEntity.ok("User deleted");
    }
}