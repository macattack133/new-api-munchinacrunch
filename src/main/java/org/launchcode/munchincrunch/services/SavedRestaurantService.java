package org.launchcode.munchincrunch.services;

import org.launchcode.munchincrunch.SavedRestaurantEntity;
import org.launchcode.munchincrunch.data.SavedRestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SavedRestaurantService {

    private final SavedRestaurantRepository savedRestaurantRepository;

    @Autowired
    public SavedRestaurantService(SavedRestaurantRepository savedRestaurantRepository) {
        this.savedRestaurantRepository = savedRestaurantRepository;
    }

    public void saveRestaurant(SavedRestaurantEntity restaurant) {
        savedRestaurantRepository.save(restaurant);
    }

    public List<SavedRestaurantEntity> getSavedRestaurants() {
        return savedRestaurantRepository.findAll();
    }

    public Optional<SavedRestaurantEntity> getSavedRestaurantById(Long id) {
        return savedRestaurantRepository.findById(id);
    }

}

