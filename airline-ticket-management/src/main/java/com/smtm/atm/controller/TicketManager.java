package com.smtm.atm.controller;

import com.smtm.atm.service.CommonInformation;
import com.smtm.atm.service.FlightService;

import java.util.ArrayList;
import java.util.Scanner;

public class TicketManager {

//    private CommonInformation commonInfo = null;
    public void menu(){

//        commonInfo= new CommonInformation();
        Scanner sc = new Scanner(System.in);
        FlightService flightService = new FlightService();
        System.out.println("""
                1. 항공권 발급
                2. 항공권 정보 표시
                3. 항공권 검색
                4. 항공권 정보 변경""");
        System.out.print("메뉴를 입력해주세요. : ");
        int menu = sc.nextInt();
        sc.nextLine();
        switch (menu){
            case 1:
                String name = flightService.inputUserName();
                String arrival = flightService.inputArrivalCountryInfo();
                int age = flightService.inputCheckAge();
                if(age == 0){
                    System.out.println("19세 미만은 비행기 티켓 발급이 불가능합니다.");
                    break;
                }
                flightService.addFlightInfo(name,age,arrival);
                System.out.println("name = " + name);
                System.out.println("arrival = " + arrival);
                System.out.println("age = " + age);
                System.out.println("항공권이 발급되었습니다.");
                break;
            case 2:

                break;
            case 3:
                break;
            case 4:
                break;
            default:
                System.out.println("메뉴를 다시 선택해 주세요.");
        }
    }


}
