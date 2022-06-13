

public class JavaTest {

}

class StaticSample {

    /*NonStatic
     * 객체 생성될 때 마다  NonStatic 멤버 생성
     * 클래스 이름으로 접근 불가능
     * Static 멤버들 모두 사용 가능*/
    int n;  //필드
    void g() {/*...*/} //메소드

    /*Static
     * 클래스당 하나만 생성 , 즉 객체들끼리 공유
     * 클래스 이름, 객체 멤버로 접근 가능
     * 전역 변수, 전역 함수, 공유 멤버 만들 때 활용
     * Static 메소드는 오직 Static 멤버만 접근 가능
     * this 키웓드 사용 불가*/
    static int m;
    static void f() {/*...*/}
}


final class FinalClass {

    /*final
     *final 클래스, final 메소드는 더 이상 상속, 오버라이딩 불가능
     *final 상수 필드는 선언 시 초기 값 지정 및 변경 불가능*/

}

