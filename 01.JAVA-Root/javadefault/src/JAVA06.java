public class JAVA06 {
    public static void main(String[] args) {
        /***********************************
         * 
         * [ 자바 메서드 기본 특징 ]
         * 1. 메서드는 호출시에만 실행되는 코드블록이다.
         * 2. 메개변수로 데이터를 메서드에 전달함
         * 3. 메서드는 특정 작업을 수행하는 함수로 볼 수 있다.
         * 4. 메서드를 쓰는 이유는? 코드의 재사용!
         * 5. 메서드 안에 메서드는 만들수 없다!(주의!!!)
         * 
         * 
         * [ 메서드의 생성 ]
         * 1. 메서드는 클래스 내부에 선언 한다
         * 2. 메서드의 이름과 소괄호,중괄호로 구성
         * 3. JAVA에는 내장메서드도 있고 사용자지정의 메서드도 있음!
         * 4. 메서드는 클래스와 구분하기 위해 소문자로 시작한다!
         * (보통 캐물케이스 즉, 두번쨰 단어부터 대문자로씀)
         * 5. void는 메서드의 리턴값이 없다는 뜻
         * -> string / int 등의 데이터 형을 쓰면 그형의 리턴값이 있다는뜻!
         * 
         * [ 메서드의 매개변수 ]
         * 1. 특정 데이터를 메서드에 전달하는 변수임
         * 2. 매개변수는 메서드 내에서만 사용되는 지역변수임
         * 3. 매개변수는 변수형 선언과 함께소괄호 안에 작성됨
         * 4. 매개변수 개수만큼 콤마로 구분하여 소괄호에 작성됨
         * 
         * 
         * [ main메서드 소개 ]
         * 1. 클래스에서 자동으로 가장먼저 실행되는 메서드임
         * 2. 메인 메서드에서 사용자 정의 메서드를 호출할수 있다.
         * 3. public 접근 제한자는 모든 클래스에서 접근할 수 있다는 표시
         * 4. static는 메서드가 클래스에 속해 있음(new키워드로 생성안함!)
         ***********************************/

        // 나의 첫 메서드 호출!
        myFirst();
        myFirst();
        myFirst();

        // 나의 두번쨰 메서드 호출!!
        System.out.println(mySecond("주"));
        System.out.println(mySecond("톰"));
        System.out.println(mySecond("누군가"));

        // 나의 세번쨰 메서드 호출
        // static이 아니므로 본 클래스에 자공 소속되지 않고
        // 객체형으로 생성해야 사용할 수 있다!
        // new 키워드로 생성함!
        // 새성법 :
        // 클래스명 변수 = enw 클래스명();
        // 클래스가 객체로 생성 되어야
        // static이 아닌 메서드를 호출할 수 있다!

        JAVA06 j06 = new JAVA06();

        System.out.println("9000원짜리 점심을 6명이 먹었다. 얼마나 내야하나?" + j06.myThird(9000, 6) + "원");


        // 나의 네번쨰 메서드 호출
        System.out.println("이달의 표어:"+j06.makeTitle(3, "반갑다 나는 주찬우다"));
        // 이름이 같은 오버로딩 메서드 호출 , 네번쨰 메서드 변형 + 호출하기이다
        System.out.println("오버로딩"+j06.makeTitle(5, "식권", 2)+"명입니다");

    } // main메서드 //

    // 나의 첫 메서드
    public static void myFirst() {
        System.out.println("나는 자바 개발자 이다!");
    } // 나의 첫 메서드

    // 나의 두번쨰 메서드
    public static String mySecond(String family) {
        return family + "씨 가문";
    } // 나의 두번쨰 메서드

    // 나의 세번쨰 메서드 -> static 이 없음!
    // 식사비 계산 : pay 가격, people 사람수
    public int myThird(int pay, int people) {
        return pay * people;
    } // 나의 세번쨰 메서드

    // 나의 네번쨰 메서드 : 표어 만들기
    public String makeTitle(int num, String msg) {
        return num +"명에게"+ msg;
    } // 나의 네번쨰 메서드

    
    // 표어만들기를 똑같이 하는데 내용이 다르므로 전달값도 다름
    // 메서드명이 똑같다!!! -> 오버라이드 메서드!!!
    public String makeTitle(int mon,String evt, int people) {
        return mon+"월의"+evt+"당첨자는"+ people;
    } // 나의 네번쨰 메서드

}// 클래스 의 끝부분 //