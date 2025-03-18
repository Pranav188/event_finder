package com.eventfinder.service;

import com.eventfinder.model.Event;
import com.eventfinder.repository.EventRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EventService {

    private final EventRepository repository;

    public EventService(EventRepository repository) {
        this.repository = repository;
    }

    public List<Event> getAllEvents() {
        return repository.findAll();
    }

    public void addEvent(Event event) {
        repository.save(event);
    }
}
