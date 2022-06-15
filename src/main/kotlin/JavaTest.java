

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
     * this 키워드 사용 불가*/
    static int m;

    static void f() {/*...*/}
}


final class FinalClass {

    /*final
     *final 클래스, final 메소드는 더 이상 상속, 오버라이딩 불가능
     *final 상수 필드는 선언 시 초기 값 지정 및 변경 불가능*/

}

/*클래스의 상속 (extends) -> 중복된 멤버를 제거하고 클래스를 간결하게 만듬
 *
 * 상속 특징 -> 다중 상속 X, 모든 클래스 Objeect 클래스 상속받음
 *
 * 슈퍼 클래스 객체와 서브 클래스의 객체는 별개이다
 * 서브 클래스 객체는 슈퍼 클래스 멤버 포함
 *
 * default 클래스 -> 다른 패키지의 클래스, 서브 클래스 접근 X
 * protected 클래스 -> 다른 패키지의 클래스 접근 X 서브 클래스 O
 *
 * 서브 클래스 객체 생성시:
 * 슈퍼/서브 클래스 생성자 모두 실행 (단 슈퍼 클래스의 생성자가 먼저 실행)
 * 순서: 서브 클래스 생성자 호출 -> 슈퍼 클래스 생성자 호출 -> 슈퍼 클래스 생성자 실행 -> 서브 클래스 생성자 실행
 *
 * 기본 생성자 자동 선택: public B() {...} -> public A() {...}
 * 기본 생성자 자동 선택(불가능) A 생성자는 기본 생성자가 아님: public B() {...} -> public A(int x) {...}
 *
 * 생성자 선택 호출: super() - 반드시 생성자 코드 제일 첫 라인에 존재
 *
 *
 * 업캐스팅:
 * class Person {...}
 * class Student extends Person {...}
 * Person p; // 슈퍼 클래스 레퍼런스
 * Students s = new Student();
 * p = s; // 업 캐스팅. 서브 클래스의 레퍼런스를 슈퍼 클래스 레퍼런스에 대입
 * p.grade는 Person 멤버가 아니므로 오류
 *
 * 다운캐스팅: 슈퍼 클래스 래퍼런스 -> 서브 클래스 레퍼런스에 대입
 * class Person {...}
 * class Student extends Person {...}
 * Person p = new Stduent("xxx"); // 업캐스팅
 * Stduent s = (Student)p; // 다운캐스팅. 업캐스팅된 것을 다시 원래대로 복구
 * p.grade는 오류 없음
 *
 * instanceof 연산자: 레퍼런스가 가리키는 객체 타입 식별, 연산 결과는 true/false
 * 객체 레퍼런스 instanceof 클래스타입
 * (3 instanceof int)는 오류: 객체 레퍼런스만 사용
 *
 * */


/* 메소드 오버라이딩: 서브 클래스에서 슈퍼 클래스의 메소드 중복 작성
 실행 조건: 슈퍼 클래스 메소드 동일하게 작성*/
class A {
    void f() {/*"Hello*/} //존재감 상실
}

class B extends A {
    @Override
    void f() {/*Hi*/}  //오버라이딩 및 다형성(하나의 이름에 다른 구현) 실현
}

/*오버로딩
 * 같은 클래스 및 상속 관계 동일 이름 메소드 중복 작성
 * 메소드 중복 선언하여 편리성 향상
 * 메소드 이름 동일, 메소드 인자 갯수, 타입 달라야 함
 * 정적 바인딩(중복된 메소드 중 호출되는 메소드 결정) - super()로 메소드 호출, ex) super.draw(); -> 슈퍼 클래스 draw() 생성자
 * */

/*오버라이딩
 * 슈퍼 클래스에 있는 메소드와 동일한 이름의 메소드 재작성
 * 슈퍼 클래스 메소드 무시, 서브 클래스에 새로운 기능 메소드 재정의
 * 메소드 이름, 인자 갯수, 타입 동일해야 함
 * 동적 바인딩(실행 시간에 오버라이딩된 메소드 찾아 호출) - 슈퍼 클래스 draw() -> 서브 클래스 draw() 생성자*/

/*추상 메소드(abstract): 틀만 선언, 인스턴스 생성 불가
 * 추상 클래스는 상속을 위한 슈퍼 클래스로 활용, 반드시 추상 메소드를 가지고 서브 클래스에서 추상 메소드 구현
 * 추상 클래스를 상속 받으면 서브 클래스도 추상 abstract 선언
 * */

/*인터페이스(interface): 클래스가 구현해야 할 메소드들이 선언되는 추상형
 * new PhoneInterface();  오류, 인터페이스 객체 생성 불가
 * PhoneInterface galaxy;  레퍼런스 변수 선언 가능
 * interface C extends A, B {...}: 인터페이스간 상속 및 다중 상속 허용
 *
 * interface Phone {...} 인터페이스 선언
 * class IPhone (여기에 extends 상속) implements Phone {...} 인터페이스 구현 */


/*패키지: 클래스 파일들을 묶어 놓은 디렉터리
 * 클래스 경로명: 패키지 이름과 클래스 이름으로 구성(java.awt.Color)
 * 모듈: 여러 패키지와 이미지 등의 자원을 모아 놓은 컨테이너
 *
 * import 이용 X : java.util.Scanner scanner = new java.util.Scanner(System.in); -> 경로명 사용
 * 필요한 클래스만 import: import java.util.Scanner;
 * 패키지 전체를 import: import java.util.*;
 *
 * 디폴트 패키지: package 선언 없는 자바 소스의 경우
 *
 * java.lang: 스트링, 수학 함수, 입출력 관련
 * java.util: 날짜, 시간, 벡터, 해쉬 테이블 관련
 * java.io: 키보드, 모니터 같은 입출력 관련
 * java.awt: GUI 프로그래밍 관련
 * java.swing: GUI 스윙 관련
 *
 * toString(): 문자열로 반환
 * equals(): 내용 비교
 *
 * Wrapper 클래스
 * ->Integer i = Integer.valueOf(28); -> i.doubleValue() (정수를 실수형으로 변환)
 * -> 문자열을 기본 데이터 타입 변환: Integer.parseInt(), Boolean.parseBoolean(), Double.pasrseDouble() */

/*박싱(Integer ten = 10;): 기본 데이터 타입을 Wrapper 클래스 객체로 변환하는 것
 * 언박싱(int n = ten;): Wrapper 객체에 들어 있는 기본 타입의 값을 빼내는 것
 *
 * String a = new String("Hello"); -> 힙에 생성, 공유되지 않음, 수정 불가능
 * 스트링 비교는: 반드시 equals() 사용
 *
 * cotains(): 문자열 포함 확인
 * concat(): 문자열 연결
 * trim(): 문자열 앞 뒤의 공백 제거
 * replace(): 문자열 대치
 * split(","): 문자열 분리
 * substring(2): 인덱스 2부터 끝까지 문자열 리턴
 * charAt(2): 인덱스 2의 문자 리턴
 *
 * StringBuffer(변하는 스트링 다룸)
 * StringBuffer sb = new StringBuffer("java");
 *
 * StringTokenizer(구분 문자 기준으로 문자열 분리)
 * StringToeknizer st = new StringTokenizer(query, "&"); -> &문자 기준으로 분리
 * st.countTokens(); -> 토큰 갯수
 * st.nextToken(); -> 다음 토큰
 *
 * Math 클래스
 * Math.abs(): 절댓값
 * Math.sqrt(): 제곱근
 * Math.exp(): 제곱
 * Math.round(): 반올림
 * Math.random(): 랜덤
 * */

/*컬렉션: 요소라고 불리는 가변 개수의 객체(컨테이너) 모음
 * -> 고정 크기 배열 해소, 삽입, 삭제, 검색 관리 용이
 * -> 재네릭 기법 사용: 클래스나 인터페이스 이름에 <E>, <K>, <V>등 포함
 * -> <int, char, double>등 기본 타입 불가
 *
 * 재네릭: 일반화된 타입 매개 변수로 클래스나 메소드를 작성하는 기법
 *
 * Vector<E>
 *배열의 길이 제한 극복, 자동 길이 조절
 * 요소 객체들 임의 위치 삽입, 삭제하는 컨테이너
 * 객체, null 삽입 가능
 * Vector<Integer> v = new Vector<Integer>(7); 용량 7인 벡터 생성
 * v.add() 요소 삽입, v.add(x, 값) 중간 삽입
 * v.size() 요소 개수, v.capacity() 벡터 용량, v.get() 요소 얻어내기
 * v.remove(), v.lastElement(), v.removeAllElements() -> 제거, 마지막 요소, 모두 제거
 *
 * ArrayList<E>
 * ArrayList<String> a = new ArrayList<String>(7); 생성
 * a.add() 요소 삽입, 중간 삽입 가능. size()보다 큰 곳에서는 추가 못함, a.get() 요소 얻어내기
 * capacity()메소드 없음
 * .remove(), .clear() -> 삭제, 모든 요소 삭제
 *
 * Iterator<E>: 컬렉션에서 요소의 순차 검색을 위한 인터페이스
 * Vector<Integer> v = new Vector<Integer>();
 *
 * Iterator<Integer> it = v.iterator();
 *
 * while(it.hasNext()) { 모든 요소 방문
 *   int n = it.next(); 다음 요소 리턴
 * }
 *
 * HashMap<K,V>: 키와 값의 쌍으로 구성되는 요소를 다루는 컬렉션
 * HashMap<String, String> map = new HashMap<String, String>(); 생성
 * .put("KEY", "VALUE"); 삽입, .get("KEY") 읽기, .remove("VALUE"); 삭제, .size(); 요소 개수
 *
 * 재네릭 클래스 작성 ---중요 !!
 * public class MyClass<T> {
 *   T val;
 *   void set(T a) {
 *       val = a; T 타입의 값 a를 val에 지정
 *   }
 *   T get() {
 *       return val; T 타입의 값 val 리턴
 *   }
 * }
 */

/*GUI(Graphic User Interface): 그래픽 지원하는 사용자 인터페이스
 * AWT, Swing패키지 사용
 *
 * 최상위 컨테이너(JFrame) -> 컨테이너 -> 컴포넌트
 *
 * 스윙 GUI 만드는 과정: 프레임 만들기 -> 메인 메소드 작성 -> 컴포넌트 붙이기
 * 스윙 import문:
 * import java.awt.*; 그래픽 처리
 * import java.awt.event.*; 이벤트 사용
 * import javax.swing.*; 스윙 컴포넌트 사용
 * import javax.swing.event.*; 스윙 이벤트 사용
 *
 * 컨테트팬: GUI 컴포넌트 부착되는 공간 */


/*이벤트 기반 프로그래밍
* 이벤트 종류: 사용자 입력, 센서로부터 입력, 네트워크로부터 데이터 송수신, 메시지
* 이벤트 처리 과정: 이벤트 발생 -> 객체 생성 -> 이벤트 리스너 찾기 -> 이벤트 리스너 실행
*
* ActionEvent: 액션 문자열
* MouseEvent: 마우스 위치 정보
* ItemEvent: 아이템 체크 상태
*
* 이벤트 소스 알아내기: object EeventObject.getSource()
*
* 이벤트 리스너
* interface MouseListener {
* public void mousePressed(MouseEvent e); 마우스 누름
* public void mouseRelease(MouseEvent e); 눌러진 마우스 떼는 순간
* public void mouseClicked(MouseEvent e); 마우스 클릭되는 순간
* public void mouseEntered(MouseEvent e); 컴포넌트 위에 올리는 순간
* public void mouseExited(MouseEvent e); 컴포넌트 위에서 내려오는 순간
* */

