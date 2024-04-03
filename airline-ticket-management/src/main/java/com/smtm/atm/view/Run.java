package com.smtm.atm.view;

import com.smtm.atm.controller.TicketManager;

public class Run {

    public static void main(String[] args) {
        TicketManager ticketManager = new TicketManager();
        ticketManager.menu();
    }
}
