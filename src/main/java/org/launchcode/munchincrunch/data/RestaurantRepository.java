package org.launchcode.munchincrunch.data;

import org.launchcode.munchincrunch.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
    // You can add custom query methods here if needed
}
