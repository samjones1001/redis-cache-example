package com.example.cachingredis.controller;

import com.example.cachingredis.Event;
import com.example.cachingredis.service.EventService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/events")
public class EventController {
    @Resource
    EventService eventService;

    @GetMapping("/event/{id}")
    public Event getEvent(@PathVariable String id) {
        return eventService.getEventById(id);
    }
}
