package day6.constructorExam;

public class Cat {
    String name;
    String kind;
    int age;

    public Cat(String name, String kind, int age) {
        System.out.println("고양이가 태어납니다.");
        this.name = name;
        this.kind = kind;
        this.age = age;
    }

    public void meow() {
        System.out.printf("%d살 %s 고양이 %s가 야옹하고 웁니다.\n", age, kind, name);
    }
}
