package services;

import models.eventType;

import java.util.List;

public interface eventTypeService {
//
    public eventType addEvent(eventType one);
    public eventType getById(int id);
    public List<eventType> getAlleventTypes();

}
