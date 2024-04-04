    
# ✈️항공권 발급관리

<br>

## 프로젝트 소개
- 항공사 직원이 항공권을 발급하고 발급정보를 수정하거나 검색하는 시스템입니다.
- 출발지는 한국으로 고정되어있습니다.
- 이름은 영문으로만 입력 가능하며, 도착지는 한국어로만 입력이 가능합니다.
- 항공권 번호는 도착지 영문3자리와 랜덤숫자 3자로 구성되어있습니다.


<br>

## 팀원 구성
<div align="center">

| **👑노영록** | **이창민** | **이은솔** |
| :------: |  :------: | :------: |
|[<img src = "https://github.com/ssg-240304-java2/OOP-showmethemoney/assets/90363122/4cbb0fcc-5b2b-4f02-ac6e-92691aa3fe26" width="150" height="auto"> <br> @Rohrok](https://github.com/Rohrok)|[<img src = "https://github.com/ssg-240304-java2/OOP-showmethemoney/assets/90363122/c5298cf4-4ff3-468e-ba48-4e4ba75d54c0" width="150" height="auto"> <br> @l2chmnl](https://github.com/l2chmnl)|[<img src = "https://github.com/ssg-240304-java2/OOP-showmethemoney/assets/90363122/87871f03-4192-4a0e-8159-a64e3b69a63f" width="150" height="auto"> <br>@lucinda96](https://github.com/lucinda96)| 
     
</div>

<br>


## 1. 개발 환경
- **java 버전 : 17**
- **개발툴 : intelliJ IDEA**
- **버전 및 이슈관리 : Github, Github Issues**
- **협업 툴 : Notion, Slack**


<br>

## 2. 개발 기간 및 작업 관리
- 2024-04-02 ~ 2024-04-04

<br>

## 3. 작업 관리
- GitHub Projects와 Issues를 사용하여 진행 상황을 공유했습니다.

<br>


## 4. 프로젝트 구조
```
├── README.md
├── .gitignore
└── airline-ticket-management
     ├── src/main/java/com/smtm/atm
           ├── controller  
           |    └── TicketManager.java   
           ├── dto  
           |    ├── FlightInformation.java
           |    └── UserInformation.java
           ├── service 
           |     ├── CommonInformation.java
           |     └── FlightService.java
           └──view
                └── Run.java

```

<br>


## 5. 역할 분담
### 👑노영록
- **기능**
1. [항공권 정보 수정 - 도착 변경]
2. 도착지 변경 후 항공권 번호 수정
3. 입력한 이름 입력체크

  <br>
  
### 이창민
- **기능**
1. 저장된 항공권 목록 전체 출력
2. 저장된 항공권 이름으로 검색
3. 저장된 항공권 이름으로 검색 후 이름 수정하기
   
  <br>
  
### 이은솔
- **기능**
1. 항공권 정보 등록
2. 입력한 이름 입력체크
3. 도착지와 랜덤번호를 활용해 항공권 번호 생성


  <br>


## 6. 설계문서

- ### 순서도(Flow Chart) - 🔗[자세히 보기](https://github.com/ssg-240304-java2/OOP-showmethemoney/wiki/%5B%ED%95%AD%EA%B3%B5%EA%B6%8C-%EB%B0%9C%EA%B8%89-%EA%B4%80%EB%A6%AC%5D-%EC%88%9C%EC%84%9C%EB%8F%84)
<img src="https://private-user-images.githubusercontent.com/90363122/319667335-020bc88f-f55d-4878-8990-d643d3ed7c2d.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTIyNDY5NjcsIm5iZiI6MTcxMjI0NjY2NywicGF0aCI6Ii85MDM2MzEyMi8zMTk2NjczMzUtMDIwYmM4OGYtZjU1ZC00ODc4LTg5OTAtZDY0M2QzZWQ3YzJkLnBuZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA0MDQlMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwNDA0VDE2MDQyN1omWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPWVlZGUxN2MyZDUxMDI2Y2EwZGIyNDBlZDdjYjUyNWUzMmMwMDZlNDdiNmVlZTIyYzU4Yjk5NWM5YWU1MTMyNWQmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.XA0k_xyp7iIdiVdhJ116E_AQ337hOWdrbSa4zB6qPvQ" height=500px width=auto >

- ### 클래스 다이어그램(Class Diagram) - 🔗[자세히 보기](https://github.com/ssg-240304-java2/OOP-showmethemoney/wiki/%5B%ED%95%AD%EA%B3%B5%EA%B6%8C-%EB%B0%9C%EA%B8%89-%EA%B4%80%EB%A6%AC%5D-%ED%81%B4%EB%9E%98%EC%8A%A4-%EB%8B%A4%EC%9D%B4%EC%96%B4%EA%B7%B8%EB%9E%A8)
<img src="https://private-user-images.githubusercontent.com/90363122/319669907-ed8b453a-98b5-41c6-a249-3cdeb0e6e079.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTIyNDcwOTEsIm5iZiI6MTcxMjI0Njc5MSwicGF0aCI6Ii85MDM2MzEyMi8zMTk2Njk5MDctZWQ4YjQ1M2EtOThiNS00MWM2LWEyNDktM2NkZWIwZTZlMDc5LnBuZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA0MDQlMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwNDA0VDE2MDYzMVomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTNhYzYwNmMwN2JhOWFkZjM5MGM1Yzg5NzUwMGI4OTUwMTVkMGIzNDY1MThkOGIzYTBjYjdlZWMwNmEyNDc5OTkmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.LbXpCogb7k-2pKpKeJsRMvLfFk08Joavf0RrZ80Z_AY" height=500px width=auto >

<br>

## 7. 메뉴별 기능
<img src="https://github.com/ssg-240304-java2/OOP-showmethemoney/assets/90363122/3bb1372f-bd7b-486d-9227-53656d51c279" height=auto width=500px >

<details>
<summary> <h3>[메뉴표시]</h3> </summary>
<div markdown="1">
<img src="https://github.com/ssg-240304-java2/OOP-showmethemoney/assets/90363122/24450dd8-f31f-4d6e-9278-1f0d71e7d7f0" height=auto width=300px >
</div>
</details>

<details>
<summary> <h3>[항공권 발급]</h3> </summary>
<div markdown="1">
<img src="https://github.com/ssg-240304-java2/OOP-showmethemoney/assets/90363122/77a89752-6d6f-41ed-ab9d-b148f610e6e6" height=auto width=300px>
</div>
</details>

<details>
<summary> <h3>[항공권 정보 표시]</h3> </summary>
<div markdown="1">
<img src="https://github.com/ssg-240304-java2/OOP-showmethemoney/assets/90363122/1bcf53fc-5364-44c5-b7d6-f4475b45474b" height=auto width=300px>
</div>
</details>

<details>
<summary> <h3>[항공권 검색]</h3> </summary>
<div markdown="1">
<img height=auto width=300px src="https://github.com/ssg-240304-java2/OOP-showmethemoney/assets/90363122/e968fbac-cda3-4895-90be-b3084e781bc3">
</div>
</details>

<details>
<summary> <h3>[항공권 정보 수정 - 이름 변경]</h3> </summary>
<div markdown="1">
</div>
</details>

<details>
<summary> <h3>[항공권 정보 수정 - 도착 변경]</h3> </summary>
<div markdown="1">
<img height=auto width=300px src="https://github.com/ssg-240304-java2/OOP-showmethemoney/assets/90363122/1026d640-3073-4e21-a81c-2acfd8bc56a7">
<img height=auto width=300px src="https://github.com/ssg-240304-java2/OOP-showmethemoney/assets/90363122/f4aa49ef-2ae9-47f2-9dfe-b5c1285b2456">
</div>
</details>
<br>

## 8. 프로젝트 후기

### 👑 노영록
- 프로젝트를 진행하기 전 주제를 정하고 가장 먼저 든 생각이 어떻게 코드를 짜야 할까였다.
하지만 실제로 프로젝트를 시작하고 내 생각이 틀렸다는 걸 느꼈다.
요구사항을 토대로 객체를 도출하고 각각의 기능을 나누고 그 기능들을 모아 하나의 프로그램으로 만들기 위해
무작정 코드를 작성하는 것이 아닌 세분화된 설계도가 필요했다. 
또 정확한 순서로 진행해야 했기 때문에 코드 한 줄 차이로 원했던 내용과는 전혀 다른 내용이 출력되는 걸 보고 
구조를 먼저 구체적으로 작성해야 한다는 걸 크게 느꼈다.
구체적으로 구조를 먼저 생각하는 연습이 많이 필요할 것 같다.

- 수업에서 들었던 내용을 직접 코드로 적용시켜보려니 원하는 결과를 얻는 데 여러 번의 과정이 필요했다.

- 내가 아닌 다른 사람의 코드를 보고 흐름을 이해하는 게 조금 어렵게 느껴졌다.

### 이창민
-

### 이은솔
- 나노 프로젝트라고는 하지만 두 분에게는 처음 하는 프로젝트이기 때문에 제가 우리가 만들려고 한 로직에 대해 서로 이해하고, 이해한 내용을 바탕으로 코드를 작성할 수 있도록 돕고 싶은 마음에 시간이 걸리더라도 이것저것 진행하고자 했습니다.
프로젝트를 진행하면서 내가 유리한 쪽으로 끌고 가거나 내 말 대로해! 라는 태도가 안 되도록 경계했다고 했지만, 다른 팀에 비해 테스트케이스를 만들거나 코드 리뷰라고하고 내가 보기에 이상한 것 같다는 이유로 너무 지적만 한 것만 같아서 후회됩니다.
다음 프로젝트에서는 다른 분들이 조금 더 적극적으로 참여하고 의견 나눌 수 있도록 자중할 필요가 있을 것 같습니다.


