//package org.launchcode.munchincrunch.controllers;
//
//import org.launchcode.munchincrunch.UserEntity;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import org.launchcode.munchincrunch.services.UserService;
//
//@RestController
//@RequestMapping("/api/users")
//public class UserController {
//
//    private final UserService userService;
//
//    @Autowired
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
//
//    @GetMapping("/{userId}")
//    public ResponseEntity<UserEntity> getUser(@PathVariable Long userId) {
//        UserEntity user = userService.getUserById(userId);
//
//        if (user != null) {
//            return ResponseEntity.ok(user);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//
//    @PostMapping("/create")
//    public ResponseEntity<UserEntity> createUser(@RequestBody UserEntity userEntity) {
//
//
//        UserEntity createdUser = userService.createUser(userEntity);
//        return ResponseEntity.ok(createdUser);
//    }
//
//    @PutMapping("/{userId}")
//    public ResponseEntity<UserEntity> updateUser(@PathVariable Long userId, @RequestBody UserEntity userEntity) {
//
//
//        UserEntity updatedUser = userService.updateUser(userId, userEntity);
//
//
//        if (updatedUser != null) {
//            return ResponseEntity.ok(updatedUser);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//
//    @DeleteMapping("/{userId}")
//    public ResponseEntity<String> deleteUser(@PathVariable Long userId) {
//
//        boolean deleted = userService.deleteUser(userId);
//        if (deleted) {
//            return ResponseEntity.ok("User deleted");
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//
//}