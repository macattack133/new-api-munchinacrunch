package org.launchcode.munchincrunch.controllers;

import org.launchcode.munchincrunch.services.SavedRestaurantService;
import org.launchcode.munchincrunch.SavedRestaurantEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/favorites")
public class SavedRestaurantController {

    private final SavedRestaurantService savedRestaurantService;

    @Autowired
    public SavedRestaurantController(SavedRestaurantService savedRestaurantService) {
        this.savedRestaurantService = savedRestaurantService;
    }

    @PostMapping("/add")
    public ResponseEntity<?> addSavedRestaurant(@RequestBody SavedRestaurantEntity restaurant) {
        savedRestaurantService.saveRestaurant(restaurant);
        return ResponseEntity.ok("Restaurant added to favorites.");
    }

    @GetMapping("/list")
    public ResponseEntity<List<SavedRestaurantEntity>> getSavedRestaurant() {
        List<SavedRestaurantEntity> savedRestaurants = savedRestaurantService.getSavedRestaurants();
        return ResponseEntity.ok(savedRestaurants);
    }
    @GetMapping("/filtered")
    public ResponseEntity<List<SavedRestaurantEntity>> getFilteredRestaurants(@RequestParam List<String> qualities) {
        List<SavedRestaurantEntity> filteredRestaurants = savedRestaurantService.getRestaurantsByQualities(qualities);
        return ResponseEntity.ok(filteredRestaurants);
    }
}
