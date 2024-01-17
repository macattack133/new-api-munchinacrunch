package org.launchcode.munchincrunch.controllers;

import org.launchcode.munchincrunch.services.RandomizerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/restaurants")
public class RestaurantController {

    @Autowired
    private RandomizerService randomizerService;

    // Other methods for adding restaurants, etc.

    @GetMapping("/random")
    public String getRandomRestaurant() {
        // Placeholder comment: Retrieve the restaurant list from your data source (e.g., database)
        List<String> restaurantList = null /* Implement logic to retrieve your restaurant list */;

        // Use RandomizerService to get a random restaurant
        return randomizerService.getRandomRestaurant(restaurantList);
    }
}
