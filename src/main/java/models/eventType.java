package models;

import javax.persistence.*;

@Entity
@Table(name="eventType",schema="public2")
public class eventType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="event_id")
    private int event_id;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="eventType_id")
    private int eventType_id;

    @Column(name="eventName")
    private String eventName;


    public eventType(){}

    public eventType(String eventName) {
        this.eventName = eventName;
    }

    public eventType(int eventType_id, String eventName) {
        this.eventType_id = eventType_id;
        this.eventName = eventName;
    }

    public eventType(int event_id, int eventType_id, String eventName) {
        this.event_id = event_id;
        this.eventType_id = eventType_id;
        this.eventName = eventName;
    }

    public int getEvent_id() {
        return event_id;
    }

    public eventType setEvent_id(int event_id) {
        this.event_id = event_id;
        return this;
    }




    public int getEventType_id() {
        return eventType_id;
    }

    public eventType setEventType_id(int eventType_id) {
        this.eventType_id = eventType_id;
        return this;
    }

    public String getEventName() {
        return eventName;
    }

    public eventType setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    @Override
    public String toString() {
        return "eventType{" +
                "eventType_id=" + eventType_id +
                ", eventName='" + eventName + '\'' +
                '}';
    }
}
