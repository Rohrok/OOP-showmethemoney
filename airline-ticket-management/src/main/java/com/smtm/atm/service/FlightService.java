package com.smtm.atm.service;

import com.smtm.atm.dto.FlightInformation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlightService {

    private final static List<FlightInformation> arrivalList = new ArrayList<>();
    private final CommonInformation commonInformation = new CommonInformation();
    private final Scanner scanner = new Scanner(System.in);

    public FlightService() {
    }

    public boolean findUser(String name) {
        for (FlightInformation flightInformation : arrivalList) {
            if (flightInformation.getPassengerName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param name
     * @param age
     * @param countryCode
     */
    public void addFlightInfo(String name, int age, String arrival, String countryCode) {

        // 티켓넘버 생성
        String tikectNum = commonInformation.createTicketNumber(countryCode);

        //승객정보 등록
        FlightInformation flightInformation = new FlightInformation(name, age, arrival, tikectNum);
        arrivalList.add(flightInformation);
        System.out.println(arrivalList.get(0).getArrival());
    }

    public String inputUserName() {

        while (true) {
            String name = "";
            System.out.print("이름을 입력하세요 : ");
            name = scanner.nextLine().replaceAll(" ", "");
            if (commonInformation.checkInputName(name)) {
                return name.toUpperCase();
            }
        }
    }

    public String inputArrivalCountryInfo() {

        while (true) {
            System.out.println("""
                    **********************
                    === 도착지를 선택하세요 ===
                            미국
                            중국
                            일본
                            독일
                            영국
                            이탈리아
                            프랑스
                            멕시코
                            남극
                            홍콩
                    ======================
                    **********************""");
            System.out.print("도착지를 입력해주세요. : ");
            String destination = scanner.nextLine();

            String countryCode = commonInformation.getCountry(destination);

            if (countryCode != null) {
                return destination + "," + countryCode;
            }
        }
    }

    public int inputCheckAge() {

        System.out.print("나이를 입력하세요 : ");
        int age = scanner.nextInt();
        if (age < 19) {

            return 0;
        }
        return age;
    }

    public void updateTicket(String name, String code, String destination) {
        for (FlightInformation flightInformation : arrivalList) {
            if (flightInformation.getPassengerName().equals(name)) {
                flightInformation.setFlightTicketCode(code);
                flightInformation.setArrival(destination);
            }
        }
    }
}
