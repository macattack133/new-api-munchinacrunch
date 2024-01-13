package org.launchcode.munchincrunch.controllers;

import org.launchcode.munchincrunch.models.FavoriteRestaurantService;
import org.launchcode.munchincrunch.models.FavoriteRestaurantEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/favorites")
public class FavoriteRestaurantController {

    private final FavoriteRestaurantService favoriteRestaurantService;

    @Autowired
    public FavoriteRestaurantController(FavoriteRestaurantService favoriteRestaurantService) {
        this.favoriteRestaurantService = favoriteRestaurantService;
    }

    @PostMapping("/add")
    public ResponseEntity<?> addFavoriteRestaurant(@RequestBody FavoriteRestaurantEntity restaurant) {
        favoriteRestaurantService.addFavoriteRestaurant(restaurant);
        return ResponseEntity.ok("Restaurant added to favorites.");
    }

    @GetMapping("/list")
    public ResponseEntity<List<FavoriteRestaurantEntity>> getFavoriteRestaurant() {
        List<FavoriteRestaurantEntity> favorites = favoriteRestaurantService.getFavoriteRestaurant();
        return ResponseEntity.ok(favorites);
    }

}