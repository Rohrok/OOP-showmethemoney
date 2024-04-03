package com.smtm.atm.service;

import com.smtm.atm.dto.FlightInformation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CommonInformation {

    private static final String REGEX = "^[a-zA-Z]*$";


    /**
     * 입력받은 이름이 영문으로 되어있는지 확인
     * @param name
     *        사용자가 입력한 이름
     * @return boolean
     *          영문으로만 이뤄진 경우 true
     *          영문이외(한글, 특수문자 다른언어)인 경우 false
     * */
    public boolean checkkInputName(String name) {

        if(name.isBlank()){
            System.out.println("이름을 입력해주세요.");
            return false;
        } else if (!name.matches(REGEX)) {
            System.out.println("이름은 영문만 입력해주세요.");
            return false;
        }
        return  true;

    }

    public boolean checkInputAge(int age){

        return false;
    }

    //항공권 번호 생성
    public String createTicketNumber(String ticket) {
        int randomNum = new Random().nextInt(999)+1;
        String tikecketNum = ticket+ (Integer.toString(randomNum));
        System.out.println("tikecketNum = " + tikecketNum);
        return tikecketNum;
    }

    //국가 코드 반환
    /**
     * 입력받은 도착지를 영문코드로 반환
     * @param code
     *        입력받은 도착지
     * @return String
     *         도착지의 영문코드
     * */
    public String countryCode(String code) {

        switch (code){
            case "미국":
                return "UK";
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
                System.out.println("일치하는 도착지가 없습니다. 다시 입력해주세요.");
        }
        return null;
    }
}
