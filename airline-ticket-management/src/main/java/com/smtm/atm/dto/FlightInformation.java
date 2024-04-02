package com.smtm.atm.dto;

public class FlightInformation extends UserInformation {

    private String flightTicketCode;
    public static final String DEPARTURE = "KOR";
    private String arrival;

    public FlightInformation(String flightTicketCode) {
        this.flightTicketCode = flightTicketCode;
    }

    public FlightInformation(String name, int age, String flightTicketCode) {
        super(name, age);
        this.flightTicketCode = flightTicketCode;
    }

    public String getFlightTicketCode() {
        return flightTicketCode;
    }

    public void setFlightTicketCode(String flightTicketCode) {
        this.flightTicketCode = flightTicketCode;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }
}
