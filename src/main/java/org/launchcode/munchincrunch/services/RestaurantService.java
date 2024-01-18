package org.launchcode.munchincrunch.services;

import org.launchcode.munchincrunch.models.Restaurant;
import org.launchcode.munchincrunch.repositories.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// RestaurantService.java
@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    // Other methods...

    public Restaurant createRestaurant(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }
}
