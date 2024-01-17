package org.launchcode.munchincrunch.services;

import org.launchcode.munchincrunch.models.UserEntity;
import org.launchcode.munchincrunch.models.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {


    private final UserRepository userRepository;


    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public UserEntity createUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }


    public UserEntity updateUser(Long userId, UserEntity userEntity) {
        return userRepository.save(userEntity);
    }


    public boolean deleteUser(Long userId) {
        try {
            userRepository.deleteById(userId);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public UserEntity getUserById(Long userId) {
        return userRepository.findById(userId).orElse(null);
    }
}
