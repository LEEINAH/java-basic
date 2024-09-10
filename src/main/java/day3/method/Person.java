package day3.method;


// 객체(사물 표현) -> 상태/동작 -> 변수와 메서드의 집합이다.
public class Person {
    // 변수는 상태를 표현한다.
    int age;
    String name;
    int count;
    int language;
    int count2;

    // 메서드는 동작(연산)을 표현한다.
    // 접근제어자 리턴타입 메서드명(매개변수) { 내용 }
    // 동작은 일단 쉽게 출력으로 대체할 것임.
    public void walk() {
        System.out.println("사람이 걷습니다.");
    }

    // 매개변수
    public void introduce(String name2, int age2) {
        System.out.println("안녕하세요 " + age2 + "살 " + name2 + "입니다.");
    }

    public void introduce2() {
        System.out.println("안녕하세요 " + age + "살 " + name + "입니다.");
    }

    public void introduce3() {
        System.out.println("안녕하세요!!");
        System.out.println("저는 " + name + "입니다.");
        System.out.println("자바를 통해");
        System.out.println("프로그램을 만들어보아요.");
    }

    public void introduce4() {
        for (int i = 0; i < 10; i++) {
            System.out.println("안녕하세요. 저는 20살 홍길동입니다.!");
        }
    }

    public void introduce5(int count) {
        for(int i = 0; i < count; i++) {
            System.out.println("안녕하세요. 저는 20살 홍길동입니다.!!");
        }
    }

    public void greeting1(int language) {
        if(language == 1) {
            System.out.println("안녕하세요");
        }

        else if(language == 2) {
            System.out.println("hi~");
        }

        else if(language == 3) {
            System.out.println("봉쥬");
        }
    }

    public void greeting2(int language, int count2) {
        for(int i = 0; i < count2; i++) {
            if(language == 1) {
                System.out.println("안녕하세요");
            }

            else if(language == 2) {
                System.out.println("hi~");
            }

            else if(language == 3) {
                System.out.println("봉쥬");
            }
        }
    }


}
