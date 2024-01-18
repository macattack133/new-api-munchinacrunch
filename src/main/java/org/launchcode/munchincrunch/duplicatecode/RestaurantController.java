//package org.launchcode.munchincrunch.controllers;
//
//import org.launchcode.munchincrunch.models.Restaurant;
//import org.launchcode.munchincrunch.services.RandomizerService;
//import org.launchcode.munchincrunch.services.RestaurantService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/restaurants")
//public class RestaurantController {
//
//    @Autowired
//    private RandomizerService randomizerService;
//
//    @Autowired
//    private RestaurantService restaurantService;
//
//    @PutMapping("/{id}")
//    public ResponseEntity<Restaurant> updateRestaurant(@PathVariable Long id, @RequestBody Restaurant updatedRestaurant) {
//        Restaurant restaurant = restaurantService.updateRestaurant(id, updatedRestaurant);
//        if (restaurant != null) {
//            return ResponseEntity.ok(restaurant);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteRestaurant(@PathVariable Long id) {
//        restaurantService.deleteRestaurant(id);
//        return ResponseEntity.noContent().build();
//    }
//
//    // Other methods for adding restaurants, etc.
//
//    @GetMapping("/random")
//    public String getRandomRestaurant() {
//        // Placeholder comment: Retrieve the restaurant list from your data source (e.g., database)
//        List<String> restaurantList = null /* Implement logic to retrieve your restaurant list */;
//
//        // Use RandomizerService to get a random restaurant
//        return randomizerService.getRandomRestaurant(restaurantList);
//    }
//}

//duplicate code that merged over?