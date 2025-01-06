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

//    value 為緩存名稱，key 為緩存的 key，cacheManager 為緩存管理器
//    我們可以在不同德地方藉由使用 緩存名稱 來指定使用哪個緩存，例如在 CacheEvictScheduler.java 中就指定時間到了要將緩存名稱為 users 的緩存清除
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
