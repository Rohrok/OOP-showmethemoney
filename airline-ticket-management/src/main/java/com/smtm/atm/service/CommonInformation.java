package com.smtm.atm.service;

import com.smtm.atm.dto.FlightInformation;

import java.util.ArrayList;
import java.util.List;

public class CommonInformation {

    private List<FlightInformation> arrivalList = new ArrayList<>();

    private static final String REGEX = "^[a-zA-Z]*$";

    //입력 내용 체크
    public boolean checkkInputValue(String name) {
        return false;
    }

    //항공권 번호 생성
    public String createTicketNumber(String ticket) {
        return null;
    }

    //국가 코드 반환
    public String countryCode(String code) {
        return null;
    }
}
