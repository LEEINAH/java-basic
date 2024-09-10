package day1;

public class Variable {
    public static void main(String[] args) {
        // 홍길동의 나이가 20.
        // 홍길동 나이가 21로 올라감.
        System.out.println(21);
        System.out.println(21);
        System.out.println(21);
        System.out.println(21);
        System.out.println(21);

        // 변수를 사용해서 값을 저장할 수 있다.

        // 변수는 상자
        // 상자는 이름이 있어야 함.
        // 상자는 크기와 모양이 있어야 함.

        // 숫자
        // 상자(변수)를 만들어야 함.
        int age;

        // 값을 변수에 담아야함.
        // = 을 이용해서 저장 가능
        age = 20;

        // 문자
        String name;
        name = "홍길동";

        // 변수의 값을 꺼내서 사용
        System.out.println(age);
        System.out.println(name);

        // 안녕하세요 저는 20살 홍길동입니다. 10번 출력.

        System.out.println("안녕하세요 저는 20살 홍길동입니다.");
        System.out.println("안녕하세요 저는 20살 홍길동입니다.");
        System.out.println("안녕하세요 저는 20살 홍길동입니다.");
        System.out.println("안녕하세요 저는 20살 홍길동입니다.");
        System.out.println("안녕하세요 저는 20살 홍길동입니다.");
        System.out.println("안녕하세요 저는 20살 홍길동입니다.");
        System.out.println("안녕하세요 저는 20살 홍길동입니다.");
        System.out.println("안녕하세요 저는 20살 홍길동입니다.");
        System.out.println("안녕하세요 저는 20살 홍길동입니다.");
        System.out.println("안녕하세요 저는 20살 홍길동입니다.");

        // 홍길동의 나이가 21살이 되었습니다. 21살로 바꿔서 10번 출력해주세요.

        age = 21;

        System.out.println("안녕하세요 저는 21살 홍길동입니다.");
        System.out.println("안녕하세요 저는 21살 홍길동입니다.");
        System.out.println("안녕하세요 저는 21살 홍길동입니다.");
        System.out.println("안녕하세요 저는 21살 홍길동입니다.");
        System.out.println("안녕하세요 저는 21살 홍길동입니다.");
        System.out.println("안녕하세요 저는 21살 홍길동입니다.");
        System.out.println("안녕하세요 저는 21살 홍길동입니다.");
        System.out.println("안녕하세요 저는 21살 홍길동입니다.");
        System.out.println("안녕하세요 저는 21살 홍길동입니다.");
        System.out.println("안녕하세요 저는 21살 홍길동입니다.");



        // 홍길동이 홍길만으로 개명을 했습니다. 바뀐 이름을 적용해서 10번 출력해주세요.

        System.out.println("안녕하세요 저는 21살 홍길만입니다.");
        System.out.println("안녕하세요 저는 21살 홍길만입니다.");
        System.out.println("안녕하세요 저는 21살 홍길만입니다.");
        System.out.println("안녕하세요 저는 21살 홍길만입니다.");
        System.out.println("안녕하세요 저는 21살 홍길만입니다.");
        System.out.println("안녕하세요 저는 21살 홍길만입니다.");
        System.out.println("안녕하세요 저는 21살 홍길만입니다.");
        System.out.println("안녕하세요 저는 21살 홍길만입니다.");
        System.out.println("안녕하세요 저는 21살 홍길만입니다.");
        System.out.println("안녕하세요 저는 21살 홍길만입니다.");


        // 문제 : a와 b가 가지고 있는 값을 서로 뒤바꿔주세요.

        int a = 5;
        int b = 10;

        System.out.println("a : " + a);
        System.out.println("b : " + b);

        // 여기서 부터

        // 여기까지 수정 가능

        System.out.println("a : " + b);
        // 출력 : a : 10
        System.out.println("b : " + a);
        // 출력 :  b : 5



    }
}