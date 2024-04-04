package com.smtm.atm.service;

import java.util.Random;
import java.util.Scanner;

public class CommonInformation {

    private static final String REGEX_ONLY_ENG = "^[a-z|A-Z]*$";
    private static final String REGEX_ONLY_KOR = "^[가-힣]*$";


    /**
     * 입력받은 이름이 영문으로 되어있는지 확인
     * @param name
     *        사용자가 입력한 이름
     * @return boolean
     * 영문으로만 이뤄진 경우 true
     * 영문이외(한글, 특수문자 다른언어)인 경우 false
     */
    public boolean checkInputName(String name) {
        Scanner scanner = new Scanner(System.in);
        if (name.isBlank()) {
            System.out.println("이름을 입력해주세요.");
            return false;
        } else if (!name.matches(REGEX_ONLY_ENG)) {
            System.out.println("이름은 영문만 입력해주세요.");
            return false;
        }
        return true;
    }

    public boolean checkInputAge(int age) {

        return false;
    }

    //항공권 번호 생성
    public String createTicketNumber(String countryCode) {
        int randomNum = new Random().nextInt(100, 999);
        String ticketNum = countryCode + (Integer.toString(randomNum));
        System.out.println("ticketNum = " + ticketNum);
        return ticketNum;
    }


    public String getCountry(String destination) {

        boolean isValid = destination.matches(REGEX_ONLY_KOR);

        if (!isValid) {
            System.out.println("도착지를 한글로 입력 해주세요.");
            return null;
        }

        CommonInformation commonInformation = new CommonInformation();
        String code = commonInformation.getCountryCode(destination);
        return code;
    }

    /**
     * 입력받은 도착지를 영문코드로 반환
     *
     * @param code 입력받은 도착지
     * @return String
     * 도착지의 영문코드
     */
//국가 코드 반환
    public String getCountryCode(String code) {

        switch (code) {
            case "미국":
                return "USA";
            case "중국":
                return "CHN";
            case "일본":
                return "JPN";
            case "독일":
                return "GER";
            case "영국":
                return "UK";
            case "이탈리아":
                return "ITA";
            case "프랑스":
                return "FRA";
            case "멕시코":
                return "MEX";
            case "남극":
                return "ATA";
            case "홍콩":
                return "HKG";
            default:
                System.out.println("도착지를 다시 입력해주세요.");
        }
        return null;
    }
}
