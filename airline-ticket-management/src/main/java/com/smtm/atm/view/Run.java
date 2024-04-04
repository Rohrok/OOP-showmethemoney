package com.smtm.atm.view;

import com.smtm.atm.controller.TicketManager;
import com.smtm.atm.service.FlightService;

public class Run {

    public static void main(String[] args) {
        FlightService flightService = new FlightService();
        flightService.setting();
        TicketManager ticketManager = new TicketManager();
        ticketManager.menu();
    }
}
