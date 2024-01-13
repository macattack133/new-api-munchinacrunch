package org.launchcode.munchincrunch.models.data;

import org.launchcode.munchincrunch.models.FavoriteRestaurantEntity;
import org.launchcode.munchincrunch.models.UserEntity;
import java.util.List;

public interface FavoriteRestaurantRepository {
    List<FavoriteRestaurantEntity> findByUser(UserEntity user);

    List<FavoriteRestaurantEntity> findAll();

    void save(FavoriteRestaurantEntity restaurant);
}
