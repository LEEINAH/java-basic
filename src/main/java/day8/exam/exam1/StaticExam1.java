package day8.exam.exam1;

public class StaticExam1 {

    static int num = 10;

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.name = "홍길동";
        p1.age = 22;

        p1.introduce();
        // 출력 : 저는 22살 홍길동 입니다.

        Person p2 = new Person();
        p2.name = "홍길순";
        p2.age = 25;

        p2.introduce();
        // 출력 : 저는 25살 홍길순 입니다.

        p1.introduce();
        // 출력 : 저는 22살 홍길동 입니다.

        System.out.println(num); // 출력 : 10

        printValue("안녕");
        // 출력 : 안녕

    }

    public static void printValue(String str) {
        System.out.printf(str);
    }

}

class Person {

    int age;
    String name;

    public void introduce() {
        System.out.println("저는 " + age + "살 " + name + " 입니다.");
    }
}
