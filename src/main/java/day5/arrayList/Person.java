package day5.arrayList;

public class Person {

    int age;
    String name;

    public void introduce() {
        System.out.println("안녕하세요 " + age + "살 " + name + "입니다.");
    }

    public void introduce2() {
        if (age >= 30) {
            System.out.println("안녕하세요 " + age + "살 " + name + "입니다.");
        }
    }
}
