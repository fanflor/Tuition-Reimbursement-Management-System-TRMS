package models;

import javax.persistence.*;

@Entity
@Table(name="request",schema="public2")
public class request   {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int requestID;

    @Column(name="request_time",columnDefinition = "BIGINT")
    private long request_time;
    @Column(name="eventDate",columnDefinition = "BIGINT")
    private long eventDate;
    @Column(name="eventlocation")
    private String eventLocation;
    @Column(name="eventDescription")
    private String eventDescription;

    @Column(name="eventCost",columnDefinition = "numeric(12,2)")
    private double eventCost;

//foregin keys
    @Column(name = "employeeINFO_fk")
    private int employeeINFO;
    @Column(name = "eventTypeID")
    private int eventType;//
    @Column(name="eventGradingFormatfk")
    private int grade;

//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int apprval_fk;
//    @Column(name = "apprval_fk")
//^nd of fk_keys

    @Column(name="work_justification")
    private String workJust;
    @Column(name="reimburstmentamount",columnDefinition = "numeric(12,2)")
    private double reimburstmentamount;




    public request() {
    }

    public request(int employeeINFO,long request_time, long eventDate, String eventLocation, String eventDescription, double eventCost, int eventType, int grade, String workJust) {
        this.request_time = request_time;
        this.eventDate = eventDate;
        this.eventLocation = eventLocation;
        this.eventDescription = eventDescription;
        this.eventCost = eventCost;
        this.eventType = eventType;
        this.workJust = workJust;
        this.employeeINFO=employeeINFO;
        this.grade=grade;


//        this.apprval_fk= requestID;
    }
//
//    public request(long request_time, long eventDate, String eventLocation, String eventDescription, double eventCost, int employeeINFO, int eventType, int grade, String workJust, int reimburstmentamount) {
//       this.request_time = request_time;
//        this.eventDate = eventDate;
//        this.eventLocation = eventLocation;
//        this.eventDescription = eventDescription;
//        this.eventCost = eventCost;
//        this.employeeINFO = employeeINFO;
//        this.eventType = eventType;
//        this.grade = grade;
////        this.apprval_fk=;
//        this.workJust = workJust;
//        this.reimburstmentamount = reimburstmentamount;
//    }

    public long getRequest_time() {
        return request_time;
    }

    public request setRequest_time(long request_time) {
        this.request_time = request_time;
        return this;
    }

    public long getEventDate() {
        return eventDate;
    }

    public request setEventDate(int eventDate) {
        this.eventDate = eventDate;
        return this;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public request setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
        return this;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public request setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
        return this;
    }

    public double getEventCost() {
        return eventCost;
    }

    public request setEventCost(int eventCost) {
        this.eventCost = eventCost;
        return this;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getWorkJust() {
        return workJust;
    }

    public request setWorkJust(String workJust) {
        this.workJust = workJust;
        return this;
    }

    public int getRequestID() {
        return requestID;
    }

    public request setRequestID(int requestID) {
        this.requestID = requestID;
        return this;
    }

    public request setEventDate(long eventDate) {
        this.eventDate = eventDate;
        return this;
    }

    public request setEventCost(double eventCost) {
        this.eventCost = eventCost;
        return this;
    }

    public int getEventType() {
        return eventType;
    }

    public request setEventType(int eventType) {
        this.eventType = eventType;
        return this;
    }

//    public int getApprval_fk() {
//        return apprval_fk;
//    }
//
//    public request setApprval_fk(int apprval_fk) {
//        this.apprval_fk = apprval_fk;
//        return this;
//    }

    public int getEmployeeINFO() {
        return employeeINFO;
    }

    public request setEmployeeINFO(int employeeINFO) {
        this.employeeINFO = employeeINFO;
        return this;
    }

    public double getReimburstmentamount() {
        return reimburstmentamount;
    }

    public request setReimburstmentamount(double reimburstmentamount) {
        this.reimburstmentamount = reimburstmentamount;
        return this;
    }

    @Override
    public String toString() {
        return "request{" +
                "requestID=" + requestID +
                ", request_time=" + request_time +
                ", eventDate=" + eventDate +
                ", eventLocation='" + eventLocation + '\'' +
                ", eventDescription='" + eventDescription + '\'' +
                ", eventCost=" + eventCost +
                ", employeeINFO=" + employeeINFO +
                ", eventType=" + eventType +
                ", grade=" + grade +
                ", workJust='" + workJust + '\'' +
                ", reimburstmentamount=" + reimburstmentamount +
                '}';
    }
}
