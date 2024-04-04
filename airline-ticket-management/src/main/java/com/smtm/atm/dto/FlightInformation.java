package com.smtm.atm.dto;


import com.smtm.atm.service.FlightService;

import java.util.ArrayList;
import java.util.List;

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

    // overloaded..
    public FlightInformation(String name, int age, String flightTicketCode, String arrival) {
        super(name, age);
        this.flightTicketCode = flightTicketCode;
        this.arrival = arrival;
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


    @Override
    public String toString() {
//
        return "========================================" +
               "\n이름 : " + getName() +
               "| 나이 : " + getArrival() +
               "\n항공권 번호 : "  + getAge() +
               "\n출발지" + FlightInformation.DEPARTURE +
               " | 도착지 : " + getFlightTicketCode() +
               "\n========================================" ;

    }

}
