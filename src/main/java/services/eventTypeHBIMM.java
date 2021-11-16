package services;

import Repository.eventTypeRepo;
import models.eventType;

import java.util.List;

public class eventTypeHBIMM implements eventTypeService{
    eventTypeRepo oner;

    public eventTypeHBIMM(eventTypeRepo oner){this.oner=oner;}

    @Override
    public eventType addEvent(eventType one) {
        return oner.addEvent(one);
    }

    @Override
    public eventType getById(int id) {
        return oner.getById(id);
    }

    @Override
    public List<eventType> getAlleventTypes() {
        return oner.getAlleventTypes();
    }
}
