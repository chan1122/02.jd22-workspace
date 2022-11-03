import java.text.DecimalFormat;
import java.util.Scanner;

// Java04. 자바 제어문(if,switch,while,for문), 배열
public class JAVA04 {
    public static void main(String[] args) {
        // [Java 조건 및 If 문]

        // 1. Java는 수학의 일반적인 논리 조건사용

        // (1) 미만: a < b
        // (2) 이하: a <= b
        // (3) 초과: a > b
        // (4) 이상: a >= b
        // (5) 같음: a == b
        // (6) 다름: a != b

        // [ Scanner 를 사용하여 입력데이터 받기! ]
        // java.util.Scanner를 import하여 사용함!
        // 자동import 단축키: alt+shift+O (알쉬오~~~!)
        // 스캐너 생성시 값으로 System.in을 설정하여
        // 입력라인이 생성되게 한다!

        // 스캐너는 메모리 영역을 try문으로 감싸서 관리한다!
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("배우의 이름을 입력하시오!");
            // 아래쪽에 입력라인이 생김
            // 입력후 입력 데이터를 변수에 할당한다!
            // nextLine() 메서드로 입력 라인 전체를 가져옴
            // next() 메서드는 단어하나를 가져옴(띄어쓰기 맨앞단어만)
            // nextInt() -> 숫자를 입력받는 스캐너 메서드(형별로 다 있음)
            String actor = myObj.nextLine();
            System.out.println();
            System.out.println("배우이름: " + actor);

            System.out.println();
            System.out.println("이 배우의 성별을 입력하시오.(남자/여자)");
            String gender = myObj.nextLine();
            System.out.println();
            System.out.println("성별: " + gender);
            System.out.println();

            // 입력창으로 받은 데이터는 엔터기호등 다른
            // 데이터가 포함되어 있어서 == 비교연산자로 하지말고
            // 변수.equals(내용) 메서드로 비교하면
            // 정확히 입력된 데이터만 비교한다!!!

            // 배우 이름에 해당하는 대표작으로 표시하는 if문
            // if(actor=="공유"){ // 데이터때문에 비교못함
            if (actor.equals("공유") && gender.equals("남자")) {
                System.out.println("대표작: 도깨비");
            } /////// if ///////////
            else if (actor.equals("김수현") && gender.equals("남자")) {
                System.out.println("대표작: 해품달");
            } /////// else if ///////
            else if (actor.equals("김수현") && gender.equals("여자")) {
                System.out.println("대표작: 어벤져스 - 에이지 오브 울트론");
            } /////// else if ///////
            else {
                System.out.println("넌 누구냐?");
            } /////// else /////////

            System.out.println();

            /////////////////////////////////////
            // 2. if문
            // : 조건이 true일때 실행할 코드를 제어함

            // if (조건문) {
            // // 실행코드
            // } else if (조건문) {
            // // 실행코드
            // } else {
            // // 실행코드
            // }

            // if : 지정된 조건이 true인 경우 실행할 코드
            // else if : 상단 조건이 false인 경우 새로운 조건 추가
            // else : 모든 조건에 해당없을 경우 실행할 코드

            System.out.println("오늘은 금요일 인가요?(예/아니요)");
            String friday = myObj.nextLine();
            System.out.println();
            System.out.println(
                    friday.equals("예?") ? ("오 축하합니다!!") : ("하하..파이팅.."));

            // 3. 삼항연산자(짧은 if문)
            // 변수 = (조건문) ? true시 실행문 : false시 실행문;
            System.out.println();
            System.out.println("오늘 점심메뉴를 선택하세요!");
            System.out.println("1.마라탕");
            System.out.println("2.감자탕");
            System.out.println("3.쌀국수");
            System.out.println("4.떡국");
            System.out.println("5.떡복이");
            System.out.println("6.짜장면");

            System.out.println("#메뉴 선택번호: ");
            int menu = myObj.nextInt();
            System.out.println();

            switch (menu) {
                case 1:
                    System.out.println("마라탕");
                    break;
                case 2:
                    System.out.println("감자감자막ㅁ자!");
                    break;
                case 3:
                    System.out.println("쌀쌀 구국 수수");
                    break;
                case 4:
                    System.out.println("떡떡국");
                    break;
                case 5:
                    System.out.println("떡떡 복이");
                    break;
                case 6:
                    System.out.println("짜장ㅁㄴ");
                    break;
                case 7:
                    System.out.println("아무거나 먹자 제발 응?");
                    break;
            }
            // 4. switch 문

            // : 단일조건을 분류하여 실행코드를 나눔

            // switch(변수) {
            // case x:
            // // 실행코드
            // break;
            // case y:
            // // 실행코드
            // break;
            // default:
            // // 실행코드
            // }

            System.out.println();
            System.out.println("지금 빵을 몇개 먹고 싶은가? \n 개수를 숫자로 쏘라 그럼 빵줄게!^^");
            System.out.println("#빵개수: ");
            int bread = myObj.nextInt();
            System.out.println();

            // 숫자 증가변수
            int bnum = 0;
            while (bnum < bread) {
                bnum++;
                System.out.println("빵");
            }
            System.out.println("\n");
            // 5. while문
            // - 조건이 true인 동안 반복실행 코드를 제어함

            // while (조건문) {
            // // 실행코드
            // }

            // 세자리마다 콤마찍기 방법;
            // DecimalFormat 클래스
            // 생성: DecimalFormat 변수 = new DecmalFormat(형식)
            // 사용: 변수.format(사용할변수)
            DecimalFormat df = new DecimalFormat("###,###");
            // ### 은 숫자를 의미 -> 샵은 숫자자리를 의미 ,는 3자리마다 콤마형식

            // 자신의 월급을 쓰고 몇번월급 받고 싶은지 써서
            // 월급의 총액을 알아보자!
            System.out.println("당신의 월급은 얼마입니까?");
            int mypay = myObj.nextInt();
            System.out.println("월급: " + df.format(mypay) + "원");
            System.out.println();

            System.out.println("당신은 당신의 회사에서 몇 번이나 월급을 받고 싶나요?");
            int paynum = myObj.nextInt();
            System.out.println("월급횟수: " + paynum);
            System.out.println();

            // 월급 횟수 증가변수

            int pacycle = 1;
            do {
                System.out.println("월급 " + df.format(mypay) + "원 *" + pacycle + "번 받고 \n총액: "
                        + df.format((mypay * pacycle)) + "원");
                pacycle++;
            } while (pacycle <= paynum); // 세미콜론 필수!!

            System.out.println();

            // 6. Do/While문
            // - 먼저 코드를 실행후 반복실행 여부를 제어함

            // do {
            // // 실행코드
            // }
            // while (조건문);

            // 무지개색을 배열변수에 넣고 for문 돌리기
            /*  */
            String[] rb = { "빨강", "주황", "노랑", "초록", "파랑", "남", "보라" };

            for (String i : rb) {
                System.out.print(i + "색  ");
                if (i.equals("보라")) {
                    System.out.print(" 입니다\n\n");
                } else {
                    System.out.print(",");
                }
            }

            // 7. for문
            // - 지정된 횟수 만큼 코드를 반복실행하여 제어함

            // for (시작값; 한계값; 증감) {
            // // 실행코드
            // }

            // (1) 시작값 : 변수선언과 시작값 할당
            // (2) 한계값 : 변수의 한계값 설정
            // (3) 증감 : 변수의 증가 / 감소

            // 8. for-each 문
            // - 배열값 만큼 자동으로 변수에 할당하면 실행코드 반복 제어함

            // for (타입선언변수 : 배열변수명) {
            // // 실행코드
            // }

            // 9. for문 중단,계속 옵션 키워드
            // (1) continue 빼고 계속
            // (2) break 중단
        } // try문
          // cath 문 (에러 발생시 처리구역임)
        catch (Exception e) {
            // e.getmessage() -> 기본 에러메시지
            System.out.println(e.getMessage());
            // 사용자가 보여주는 메시지
            System.out.println("숫자로 입력 바랍니다 \n 다시가겟습니다 \n");

        }
    }
}