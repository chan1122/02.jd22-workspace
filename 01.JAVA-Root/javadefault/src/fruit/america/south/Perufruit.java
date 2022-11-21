package fruit.america.south;

public class Perufruit {
    public void PeruFn(){
        System.out.println("페루산 괴일은 애플 망고입니다!!");
        //프라이빗 메서드는 선언된 클래스에섬나 사용가능!
        System.out.println("***페루에서 호출!");
        peruFnPrivate();
        System.out.println("***페루에서 호츌");
        peruProtectide();
    }

    // 프라이빗 메서드 만들기
    private void peruFnPrivate(){
        System.out.println("페루산 과일은 프라이빗 입니다");
    }
    // 프로 텍티드
    protected void peruProtectide(){
        System.out.println("페루산 과일은 프로텍티드 입니다!");
    }
}
