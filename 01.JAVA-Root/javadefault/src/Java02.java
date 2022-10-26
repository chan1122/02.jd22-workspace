public class Java02 {
    public static void main(String[] args) {
    /* 

    [ 자바 변수 ]

    변수는 데이터 값을 저장하기 위한 컨테이너

    [ 변수의 선언과 사용형식 ]
    데이터형 변수명 = type에 맞는값 
    
    */

    System.out.println("자바변수");

    /* 

    [ Java 변수 유형 ]

    1 . String
    - "Hello"와 같은 텍스트를 저장 문자열 값은 큰따옴표사용!

    2 . int
    - 123 또는 -123과 같이 소수 없이 정수(정수)를 저장

    3 . float
    - 19.99 또는 -19.99와 같은 소수를 사용. 부동 소수점 숫자를 저장

    4 . char
    - 'a' 또는 'B'와 같은 단일 문자를 저장. Char 값은 작은따옴표사용!

    5 . boolean
    - true / false

    */

    // 1 . 문자형 string

    String insasasasasasa = "안아아아아뇽~!~!";
    System.out.println(insasasasasasa);


    // 2 . 정수형 int
    int number = 19;
    System.out.println(number+"살 내 나이양~!!!! 방가웡~!");

    // 2 . 정수형 int 에 값을 덮어써짐
    number = 22;
    System.out.println(number+"살 내 나이양~!!!! 방가웡~!");


    // 자바에서 상수는? 변수선언 앞에 final키워드 사용! (더이상 할당하지 않는 절대 값을 만들고 싶을떄 final)
    final int newNum = 7000;
    // newNum = 8000; final떄문에 에러남!!! 재할당 불가!!!
    System.out.println(newNum + "나이를 다시 또짬");


    // 변수와 문자의 결합!
    String namechan = "찬우우우우우웅!!!";
    System.out.println("안뇽!!! 내이름은 "+ namechan);

    String famillyname = "주씨";
    String Myname = "찬우";
    String fullName = famillyname + Myname;

    System.out.println(fullName);

    // 변수를 한번에 선언과 할당!
    int a = 5, b=6, c=50;
    System.out.println(a+"와"+b+"와"+c+"의 합은?"+(a+b+c));


    // 이런 방식도 있어~!
    // 같은 형의 변수를 한꺼번에 선언하고
    // 같은 값을 여러 같은 형의 변수에 넣을떄!
    int aa, bb, cc;
    aa = bb = cc = 100;

    System.out.println(aa+" 을 세번 더하면! "+(aa+bb+cc));


    /* 

    [ 변수 이름 규칙 ]

    1. 문자, 숫자, 밑줄 및 달러 기호 포함가능
    2. 문자로 시작
    3. 소문자로 시작
    4. 중간 공백 안됨
    5. $ 및 _로 시작할 수도 있음
    6. 대소문자를 구분
    7. 예약어사용불가 

    */

    /* 
     
    [ 데이터 유형 ]

    -> 두 그룹으로 나뉩니다.

    1. 기본 데이터 유형 (8가지)

    (정수형 데이터)
    (1) byte	1 byte	 -128 ~ 127
    (2) short	2 bytes	 -32,768 ~ 32,767
    (3) int		4 bytes	 -21억 ~ 21억
    (4) long	8 bytes	 -9백경 ~ 9백경
    (5) float	4 bytes	 소수 6 to 7 자릿수
    (6) double	8 bytes	 소수 15 자릿수
    (7) boolean	1 bit	 true / false
    (8) char	2 bytes	 한문자 or 아스키값

    ->>>(질문) 
    Java에는 많은 숫자 유형이 있지만 
    숫자에 가장 많이 사용되는 유형은? 
    (답)
    int(정수) 및 double(부동 소수점 숫자)



    2. 기본이 아닌 데이터 유형
    - String, 배열 및 클래스 등
    */


    int iamint = 5;  // 정수형
    float iamfloat = 5.99f; //실수형
    char iamchar = 'd'; // 한글자형
    boolean iambl = true; // 불린 true false 형
    String iamst = "안뇽"; // 문자형
    // --> "d" ㅏ고 쌍따옴표를 쓰면 에러!
    // 한글자를 "" 로 싸면 에러가 남!

    System.out.println("나는 정수"+iamint);
    System.out.println("나는 실수"+iamfloat);
    System.out.println("나는 한글자"+iamchar);
    System.out.println("나는 불린"+iambl);
    System.out.println("나는 문자"+iamst);


        // 그냥 한줄 비워 줄려고 쓴거임 보통 한줄 띄어 줄떄 비워놓고 사용함!
    System.out.println();

    // 데이터형별 크기 체크
    System.out.println("[ 데이터 형 별 크기 체크 ]");
    // 1 . byte : -128 ~ 127 
    byte numBYTE = -128; 
    // -129 와 같이 범위 밖은 에러!!!!!!!!!!!!!!
    System.out.println("byte: "+numBYTE);

    // 2 . short : -32,768 ~ 32,767 -> 0떄문에 자릿수 하나적음!
    short numShort = 32767;
    System.out.println("short: "+numShort);


    // 3 . int : -21억 ~ 21억
    // 세부 범위 -2,147,483,648 ~ 2,147,483,647
    int numInt = 2147483647;
    System.out.println("int: "+numInt);

    //4 . long : -900경 ~ 900경
    // 세부 범위 -9,223,372,036,854,775,808 ~
    // ~ 9,223,372,036,854,775,807
    // 특이 사항! : 범위 안에 숫자일 지라도 끝에 L 표시를 하지 않는 다면 int형 상수로 처리한다!
    // int범위를 벗어나는 에러로 처리 하기 때문에 
    // 끝에 반드시 L자를 써줘야한다(소문자L도 가능하지만 헷갈리기떄문에 대문자 L을 사용할것!!!)
    long numlong = 9223372036854775807L;
    System.out.println("long: "+numlong);


    // 5 . float : 소수 자릿수 6 ~ 7
    // 특이사항 : 숫자 데이터 끝에 F로 처리해야 같은 형임!
    // 소숫점 아래 넘치는 경우 
    float numFloat = 5.123456789F; // 결과 : 5.1234567 까지만 출력됨!
    System.out.println("float: "+numFloat);


    // 6 . double : 소수 자릿수 15
    // 특이사항 : 숫자 데이터 끝에 D로 처리해야 같은 형임!
    // float 이나 double은 근사값이므로 끝자리가 달라질 수 있음!

    double numDouble = 9.123456789123456789D;
    System.out.println("double: "+numDouble);


    // 과학적인 10의 거듭제곱 표시 사용 가능(e+자릿수)
    // float 이나 double은 소수점이 없으면 기본 한자릿수 표시함
    float f1 = 35e3f;
    double d1 = 20E100D;
    System.out.println("f1: "+f1+"\n"+"d1:  "+d1);







    /*
    * String 유형은 Java에서 너무 많이 사용되고 통합되어 
    * 일부에서는 이를 "특별한 아홉 번째 유형"이라고 불리움.
    * (기본유형이 8개 이므로^^)
    * 
    * Java의 String은 객체를 참조하기 때문에 실제로는 
    * 기본이 아닌 데이터 유형 String 객체에는 문자열에 대한 
    * 특정 작업을 수행하는데 사용되는 메서드가 있음.
    [ 기본이 아닌 데이터 유형 ]
    기본이 아닌 데이터 형식은 개체를 참조하기 때문에 
    참조 형식 이라고함.

    (기본 데이터 유형 과 기본 이 아닌 데이터 유형 의 주요 차이점)

    기본 유형은 Java에서 사전 정의(이미 정의)되어 있음 
    기본이 아닌 유형은 프로그래머에 의해 생성되며 
    Java에 의해 정의되지 않음( 제외 String).

    기본 유형이 아닌 유형은 특정 작업을 수행하기 위해 
    메소드를 호출하는 데 사용할 수 있지만 기본 유형은 불가능함

    기본 유형에는 항상 값이 있는 반면 기본 유형이 아닌 유형은 null.
    기본 유형은 소문자로 시작하고 기본 유형이 아닌 유형은 대문자로 시작.
    기본 유형의 크기는 데이터 유형에 따라 달라지지만 
    기본 유형이 아닌 유형은 모두 동일한 크기를 갖음.

    기본이 아닌 유형의 예로는 
    Strings / Arrays / Classes / Interface 등이 있음    

    */







    







    };
    
};
