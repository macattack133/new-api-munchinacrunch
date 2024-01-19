package org.launchcode.munchincrunch.services;

import org.launchcode.munchincrunch.Restaurant;
import org.launchcode.munchincrunch.data.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    public List<Restaurant> getAllRestaurants() {
        return restaurantRepository.findAll();
    }

    // Other methods...

    public Restaurant createRestaurant(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }

    public Restaurant updateRestaurant(Long id, Restaurant updatedRestaurant) {
        Optional<Restaurant> existingRestaurant = restaurantRepository.findById(id);
        if (((Optional<?>) existingRestaurant).isPresent()) {
            Restaurant restaurant = existingRestaurant.get();
            restaurant.setName(updatedRestaurant.getName());
            restaurant.setCuisine(updatedRestaurant.getCuisine());
            return restaurantRepository.save(restaurant);
        }
        return null; // Handle not found case
    }
    public void deleteRestaurant(Long id) {
        restaurantRepository.deleteById(id);
    }
}


