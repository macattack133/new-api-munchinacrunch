package org.launchcode.munchincrunch.models.data;

import org.launchcode.munchincrunch.models.UserEntity;
import java.util.Optional;

public interface UserRepository {
    Optional<UserEntity> findByUsername(String username);
}
