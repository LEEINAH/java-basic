package day3.method;

public class Car {

    String car;
    int speed;

    public void run() {
        System.out.println("자동차가 달립니다.");
    }

    // 출력 : 자동차가 최대속력 220km로 달립니다.
    // 출력 : 자동차가 최대속력 250km로 달립니다.

    public void maxspeed() {
        System.out.println("자동차가 최대속력 " + speed + "로 달립니다.");
    }

}
