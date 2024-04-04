package com.smtm.atm.dto;


import com.smtm.atm.service.FlightService;

import java.util.ArrayList;
import java.util.List;

public class FlightInformation extends UserInformation {

    private String flightTicketCode;
    public static final String DEPARTURE = "KOR";
    private String arrival;
    private String passengerName;


    public FlightInformation(String flightTicketCode) {
        this.flightTicketCode = flightTicketCode;
    }

    public FlightInformation(String name, int age,String arrival, String flightTicketCode) {
        super(name, age);
        this.arrival = arrival;
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

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    @Override
    public String toString() {
//
        return "========================================" +
               "\n이름 : " + getName() +
               " | 나이 : " + getAge() +
               "\n 항공권 번호 : "  + getArrival() +
               "\n출발지" + FlightInformation.DEPARTURE +
               " | 도착지 : " + getFlightTicketCode() +
               "\n========================================" ;

    }

}
