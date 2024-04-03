package com.smtm.atm.controller;

import com.smtm.atm.service.CommonInformation;
import com.smtm.atm.service.FlightService;

import java.util.ArrayList;
import java.util.Scanner;

public class TicketManager {

    public void menu(){

        Scanner scanner = new Scanner(System.in);
        FlightService flightService = new FlightService();
        System.out.println("""
                1. 항공권 발급
                2. 항공권 정보 표시
                3. 항공권 검색
                4. 항공권 정보 변경
                0. 시스템 종료""");
        System.out.print("메뉴를 입력해주세요. : ");
        int menu = scanner.nextInt();
        scanner.nextLine();
        switch (menu){
            case 1:
                String name = flightService.inputUserName();
                String arrival = flightService.inputArrivalCountryInfo();
                int age = flightService.inputCheckAge();
                flightService.addFlightInfo(name,age,arrival);
                System.out.println("항공권이 발급되었습니다.");
                break;
            case 2:

                break;
            case 3:
                break;
            case 4:
                break;
            case 0:
                System.out.println("시스템을 종료합니다.");
                return;
            default:
                System.out.println("메뉴를 다시 선택해 주세요.");
        }
    }


}
