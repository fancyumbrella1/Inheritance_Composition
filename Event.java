public abstract class Event {
    private String eventID;
    private String eventName;
    private String eventLocation;
    private String eventPointOfContact;
    public double eventCost;
    private int totalParticipants;
    private int totalEventDays;

    // Constructor that initializes all properties
    public Event(String eventID, String eventName, String eventLocation, String eventPointOfContact, double eventCost, int totalParticipants, int totalEventDays) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.eventPointOfContact = eventPointOfContact;
        this.eventCost = eventCost;
        this.totalParticipants = totalParticipants;
        this.totalEventDays = totalEventDays;
    }

    // Abstract method for calculating event costs
    public abstract double calculateEventCost(); // Modification: Made the method abstract

    // Override the toString method to print the details of the event
    @Override
    public String toString() {
        return "Event{" + "eventID='" + eventID + '\'' + ", eventName='" + eventName + '\'' + ", eventLocation='" + eventLocation + '\'' + ", eventPointOfContact='" + eventPointOfContact + '\'' + ", eventCost=" + eventCost + ", totalParticipants=" + totalParticipants + ", totalEventDays=" + totalEventDays + '}';
    }
}