//package org.launchcode.munchincrunch.models.data;
//
//import org.launchcode.munchincrunch.UserEntity;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.Optional;
//
//@Repository
//public interface UserRepository extends JpaRepository<UserEntity, Long> {
//    Optional<UserEntity> findByUsername(String username);
//}

package org.launchcode.munchincrunch.data;

import org.launchcode.munchincrunch.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {
    Optional<UserEntity> findByUsername(String username);
}