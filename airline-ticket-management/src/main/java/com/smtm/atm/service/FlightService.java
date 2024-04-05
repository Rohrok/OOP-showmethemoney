package com.smtm.atm.service;

import com.smtm.atm.dto.FlightInformation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlightService {

    private List<FlightInformation> arrivalList = null;
    private Scanner scanner = new Scanner(System.in);
    private CommonInformation commonInformation = new CommonInformation();

    public FlightService() {

        arrivalList = new ArrayList<>();
    }

    /**
     * @param name
     * @param age
     * @param countryCode
     */
    public void addFlightInfo(String name, int age, String arrival ,String countryCode) {

        // 티켓넘버 생성
        String ticketNum = commonInformation.createTicketNumber(countryCode);
        //승객정보 등록
        FlightInformation flightInformation = new FlightInformation(name,age,arrival,ticketNum);
        arrivalList.add(flightInformation);
    }

    public String inputUserName() {

        while (true) {
            System.out.print("이름을 입력하세요 : ");
            String name = scanner.nextLine().replaceAll(" ", "");
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

    public int inputCheckAge(){
        while(true){
            System.out.print("나이를 입력하세요 : ");
            int age = scanner.nextInt();
            scanner.nextLine();
            if(age>=19){
                return age;
            }else{
                System.out.println("19세 미만은 티켓발급이 불가능합니다.");
            }

        }
    }

    public boolean isNull(){
        if (arrivalList.isEmpty()) {
            System.out.println("예약 내역이 존재하지 않습니다.");
            return true;
        }
        return false;
    }
    public void printAllTickets(){
        if (!isNull()) {
            for (int i = 0; i < arrivalList.size(); i++) {
                System.out.println(arrivalList.get(i));
            }
        }
    }

    public int searchTicketWithName(){
        if (isNull()){
            return -1;
        } else {
            System.out.print("선택할 ");
            String name = inputUserName();

            for (int i = 0; i < arrivalList.size(); i++) {
                if (arrivalList.get(i).getName().equals(name)) {
                    System.out.println((arrivalList.get(i)).toString());
                    return i;
                }
            }
            System.out.println(name + "님을 찾을 수 없습니다.");
            return -1;
        }
    }

    public void updateTicketInformation(int index, String ticketNumber, String destination) {
        arrivalList.get(index).setFlightTicketCode(ticketNumber);
        arrivalList.get(index).setArrival(destination);

    }

    public void updateTicket(){
        System.out.println("""
                =====**항공권수정하기**=====
                1. 이름 수정하기
                2. 도착지 수정하기
                =========================""");
        System.out.print("수정할 항목을 선택하세요 : ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1 :
                if (isNull()){
                    break;
                } else {
                    printAllTickets();
                    int index = searchTicketWithName();
                    if (index != -1) {
                        arrivalList.get(index).setName(nameForUpdate());
                        System.out.println("변경이 완료되었습니다.");
                        break;
                    }
                    break;
                }
            case 2 :
                if (isNull()) {
                    break;
                } //if 문 추가 >> 목록이 비어있으면, 메인메뉴로 돌아간다.
                printAllTickets(); // 항공권 전체 출력 후 이름 보고 치는 느낌으로 추가함.
                String userName = null;
                String ticketNumber = null;
                String destination = null;
                int index = 0;

                while (true) {

                    // 이름 검색해서 index 반환
                    index = searchTicketWithName();
                    if (index == -1 ) {
                        return;
                    }

                    //arrival에 미국, USA 담기    "미국,USA".split
                    String[] arrival = inputArrivalCountryInfo().split(",");

                    //USA 코드로 티켓넘버 생성하고 ticketNumber에 저장
                    CommonInformation commonInformation = new CommonInformation();
                    ticketNumber = commonInformation.createTicketNumber(arrival[1]);

                    destination = arrival[0];
                    System.out.println("변경이 완료되었습니다."); //추가함
                    break;
                }

                updateTicketInformation(index,ticketNumber, destination);
                break;
        }
    }

    public String nameForUpdate(){
        System.out.print("변경할 ");
        return inputUserName();
    }
}
