package day6.constructorExam;

public class Person {
        int age;
        String name;

        public Person(String name, int age) {
            System.out.println("사람이 태어납니다.");
            this.name = name;
            this.age = age;
        }

        public void introduce() {
            System.out.printf("안녕하세요 %d살 %s입니다.\n", age, name);
        }
    }

