package com.eventfinder.controller;

import com.eventfinder.model.Event;
import com.eventfinder.service.EventService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/events")
public class EventController {

    private final EventService service;

    public EventController(EventService service) {
        this.service = service;
    }

    @GetMapping
    public List<Event> getEvents() {
        return service.getAllEvents();
    }

    @PostMapping
    public void addEvent(@RequestBody Event event) {
        service.addEvent(event);
    }
}
