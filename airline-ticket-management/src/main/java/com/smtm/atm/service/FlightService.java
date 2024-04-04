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
        /*tikect>> ticket*/
        String ticketNum = commonInformation.createTicketNumber(countryCode);
        //승객정보 등록
        FlightInformation flightInformation = new FlightInformation(name,age,arrival,ticketNum);
        arrivalList.add(flightInformation);
        System.out.println(arrivalList.get(0).toString());
    }

    public String inputUserName() {

        while (true) {
            System.out.print("이름을 입력하세요 : ");
            String name =  scanner.nextLine().replaceAll(" ","");
            if(commonInformation.checkInputName(name)){
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
            return 0;
        }
        System.out.print("검색할 ");
        String name = inputUserName();

        for (int i = 0; i < arrivalList.size(); i++) {
            if (arrivalList.get(i).getName().equals(name)) {
                System.out.println((arrivalList.get(i)).toString());
            }
            return i;
        }
        System.out.println(name + "님을 찾을 수 없습니다.");
        return 0;
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
                    if (index != 0) {
                        arrivalList.get(index).setName(nameForUpdate());
                    }
                }
            case 2 :

        }
    }

    public String nameForUpdate(){
        System.out.print("변경할 ");
        return inputUserName();
    }







//    public void updateTicketWithName(){
//        if (arrivalList.isEmpty()) {
//            System.out.println("저장된 항공권 내역이 없습니다.\n항공권을 등록 후 이용해 주세요.");
//            return;
//        }
//        printAllTickets();
//        searchTicketWithName();
//    }



}
