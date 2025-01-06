package com.kai.cache_h2_practice.services;

import com.kai.cache_h2_practice.models.User;
import com.kai.cache_h2_practice.repositories.UserRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Cacheable(value = "users", key = "#id", cacheManager = "cacheManager")
    public User getUserById(Long id) {
        // 模擬延遲以驗證緩存效果
        // 如果沒有使用緩存，每次請求都會花費 3 秒
        // 如果使用緩存，則這個方法內的所有邏輯都不會執行，直接返回緩存中的結果
        // 藉此驗證緩存是否生效
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return userRepository.findById(id).orElse(null);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
