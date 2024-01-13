package org.launchcode.munchincrunch.controllers;
import org.launchcode.munchincrunch.models.UserEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users") //check this API portion
public class UserController {

    @GetMapping("/{userId}")
    public ResponseEntity<String> getUser(@PathVariable Long userId) {
        // TODO implement logic to retrieve and return user information
        return ResponseEntity.ok("User with ID " + userId);
    }

    @PostMapping("/create")
    public ResponseEntity<String> createUser(@RequestBody UserEntity userEntity) {
        // TODO Implement logic to create a new user
        return ResponseEntity.ok("User created");
    }

    @PutMapping("/{userId}")
    public ResponseEntity<String> updateUser(@PathVariable Long userId, @RequestBody UserEntity userEntity) {
        // TODO Implement logic to update user information
        return ResponseEntity.ok("User updated");
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<String> deleteUser(@PathVariable Long userId) {
        // TODO Implement logic to delete a user
        return ResponseEntity.ok("User deleted");
    }
}