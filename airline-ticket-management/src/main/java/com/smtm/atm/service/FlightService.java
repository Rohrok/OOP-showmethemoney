package com.smtm.atm.service;

import com.smtm.atm.dto.FlightInformation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlightService {

    private List<FlightInformation> arrivalList = null;
    private Scanner sc = new Scanner(System.in);
    private CommonInformation commonInfo = new CommonInformation();

    public FlightService() {
        arrivalList = new ArrayList<>();
    }


    /**
     *
     * @param name
     * @param age
     * @param countryCode
     * */
    public void addFlightInfo(String name, int age, String countryCode){

        // 티켓넘버 생성
        String tikectNum = commonInfo.createTicketNumber(countryCode);
        //승객정보 등록
        FlightInformation flightInformation = new FlightInformation(name,age,tikectNum);
        arrivalList.add(flightInformation);
        System.out.println(arrivalList.get(0).toString());
    }

    public String inputUserName(){

        String name = "";
        while (true) {
            System.out.print("이름을 입력하세요 : ");
            name =  sc.nextLine().replaceAll(" ","");
            if(commonInfo.checkkInputName(name)){
                return name.toUpperCase();
            }
        }

    }

    public String inputArrivalCountryInfo(){

        System.out.println("""
                1. 미국
                2. 중국
                3. 일본
                4. 독일
                5. 영국
                6. 이탈리아
                7. 프랑스
                8. 멕시코
                9. 남극
                10. 홍콩""");
        System.out.print("위의 나라에서 도착지를 입력해주세요. : ");
        String arrivalCountry = sc.nextLine();
        String countryCode = commonInfo.countryCode(arrivalCountry);
        return countryCode;
    }

    public int inputCheckAge(){

        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
        if(age<19){

            return 0;
        }
        return age;
    }

}
