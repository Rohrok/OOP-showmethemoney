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
        switch (menu) {
            case 1:
                String name = flightService.inputUserName();
                String[] arrival = flightService.inputArrivalCountryInfo().split(",");
                int age = flightService.inputCheckAge();
                flightService.addFlightInfo(name,age,arrival[0],arrival[1]);
                System.out.println("항공권이 발급되었습니다.");
                break;
            case 2:
                flightService.printAllTickets();
                break;
            case 3:
                flightService.searchTicketWithName();
                break;
            case 4:
                String userName = null;
                String ticketNumber = null;
                String destination = null;

                while (true) {
                    System.out.print("항공권을 변경할 승객 이름을 입력해주세요: ");
                    userName = scanner.nextLine();

                    //변경할 사람의 이름을 받고 검증
                    boolean isUser = flightService.findUser(userName);

                    // 이름 확인되면 아래 로직 수행
                    if (!isUser) {
                        System.out.println("검색된 이름은 없는 이름입니다. 다시 입력해주세요.");
                        continue;
                    }
                    break;
                }
                arrival = flightService.inputArrivalCountryInfo().split(",");

                    // 국가 코드 가지고 가서 항공권 번호 새로 발급 받아오기
                    ticketNumber = commonInformation.createTicketNumber(arrival[1]);
                    break;

                //유저리스트에있는  정보에 가서 항공권 번호 도착지 같이 수정
//                flightService.updateTicket(userName, ticketNumber, destination);

//                System.out.println("항공권을 새로 발급했습니다.");
//                break;
                flightService.updateTicket();
                break;
            case 0:
                System.out.println("시스템을 종료합니다.");
                return;
            default:
                System.out.println("메뉴를 다시 선택해 주세요.");
        }
    }
}
