package org.launchcode.munchincrunch.services;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class RandomizerService {

    public String getRandomRestaurant(List<String> restaurantList) {
        if (restaurantList == null || restaurantList.isEmpty()) {
            return null; // Handle the case when the restaurant list is empty
        }

        Random random = new Random();
        int randomIndex = random.nextInt(restaurantList.size());

        return restaurantList.get(randomIndex);
    }
}
