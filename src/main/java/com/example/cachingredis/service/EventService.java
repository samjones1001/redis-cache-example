package com.example.cachingredis.service;

import com.example.cachingredis.Event;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@CacheConfig(cacheNames = {"Event"})
public class EventService {

    @Cacheable(key = "#id")
    public Event getEventById(String id) {
        return new Event("12-12344", "TEST EVENT");
    }
}
