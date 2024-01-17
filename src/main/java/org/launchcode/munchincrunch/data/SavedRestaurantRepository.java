package org.launchcode.munchincrunch.data;

import org.launchcode.munchincrunch.SavedRestaurantEntity;
import org.launchcode.munchincrunch.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SavedRestaurantRepository extends JpaRepository<SavedRestaurantEntity, Long> {
    List<SavedRestaurantEntity> findByUser(UserEntity user);
    List<SavedRestaurantEntity> findAll();
}
