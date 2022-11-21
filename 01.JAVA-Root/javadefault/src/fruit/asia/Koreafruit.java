package fruit.asia;

import fruit.america.south.Perufruit;

// import fruit.america.south.Perufruit;

public class Koreafruit extends Perufruit {
        // extends Perufruit -> 페루가 슈퍼클래스가됨, 한국은 서브 클래스됨ㅃ!
        // 슈퍼 클래스 == 부모 클래스 . 서브클래스 == 자식 클래스
    public void KoreaFn(){
        System.out.println("한국한 과일은 제주 한라봉입니다");

        // 페루의 protected 메서드를 호출할 수 있나?
        // Perufruit perufruit = new Perufruit();
        // perufruit.PeruFn(); -> 프로텍티드 멧드 보이지도 않음
        
        // 페루의 자식 클래스가 되었을떄 페루의 protectide 메서드 호출가능!
        // 부모 클래스는 super 키워드로 부를 수 있다!
        
        System.out.println("한국은 페루의 서브 클래스가 되어 페루 호출");
        super.peruProtectide();




        
    }
}
