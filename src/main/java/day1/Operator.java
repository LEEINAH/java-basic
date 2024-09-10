package day1;

public class Operator {
    public static void main(String[] args) {
        // 산술 연산자
        // +, -, *, /, %

        System.out.println(10 + 5);
        System.out.println(10 - 5);
        System.out.println(10 * 5);
        System.out.println(10 / 5);
        System.out.println(10 % 5);

        System.out.println(10 / 3); // 정수
        System.out.println(10.0 / 3.0); // 실수

        System.out.println(10 % 3); // 나머지 구하는 거임

        // 비교 연산자 -> 논리값으로 결과가 나옴
        // <, >, <=, >=, == !=

        System.out.println(10 > 5); // 맞음.
        System.out.println(10 < 5); // 틀림.
//
//        System.out.println(100); // 숫자
//        System.out.println("100"); // 문자

//        System.out.println(true);
//        System.out.println("true");
        System.out.println(10 > 10);
        System.out.println(10 >= 10);
        System.out.println(10 == 10);
        System.out.println(10 != 10);
        System.out.println(!true);
        System.out.println(!false);

        // 숫자 - int, 문자 - String, 숫자(실수) - double,

        class Main {
            public static void main(String[] args) {

                if (true) {
                    System.out.println();
                }

                if (false) {
                    System.out.println();
                }

                int a = 10;
                // `==` => 같다.
                if (a == 10) {
                    System.out.println("참");
                }

                // `!=` => 같지 않다.
                if (a != 10) {
                    System.out.println("거짓");
                }

                if (a > 10) {
                    System.out.println("거짓");
                }

                if (a >= 10) {
                    System.out.println("참");
                }

                int b = 10;

                if (a == b) {
                    System.out.println("참");
                }

                //boolean c => c 에는 오직 true/false 만 담을 수 있다.

                boolean c = a != b;

                if (c) {
                    System.out.println("거짓");
                }

                if (c == false) {
                    System.out.println("거짓");
                }

                // `!` => 반전
                if (!c) {
                    System.out.println("참");
                }

                // `!` => 반전
                if (!(!c)) {
                    System.out.println("거짓");
                }

                boolean d = true;

                if (c != d) {
                    System.out.println("참");
                }
            }
        }



    }
}