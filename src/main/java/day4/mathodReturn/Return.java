package day4.mathodReturn;

// 메서드는 값을 표현할 수도 있고 아닐 수도 있다.
public class Return {
    public static void main(String[] args) {
//
//
//        // 메서드는 값을 리턴할 수 있는데 리턴값이 필요한 이유는 메서드가 리턴한 값을 다양하게 2차 작업 할 수 있기 때문
//        Test t1 = new Test();

//        // 10, 20 더한 값에서 2로 나누고 싶다.
//        int num = t1.plus(10, 20);
//        System.out.println(num / 2);
//
//        // 10, 20 더한 값에서 2배를 하고 싶다.
//        System.out.println(num * 2);
//
//        // 문제. Test에 원의 넓이 구하는 메서드 만들기
//        // 원의 넓이 : 반지름 * 반지름 * 3.14
//
//        // 반지름이 5인 원의 넓이 :
//        double result = t1.circleArea(5);
//        System.out.println(result);
//        // 반지름이 10인 원의 넓이 :
//        double result2 = t1.circleArea(10);
//        System.out.println(result2);
//
//        // 반지름이 5인 원의 넓이를 3으로 나눈 값 :
//        System.out.println(result / 3);
//        // 반지름이 10인 원의 넓이를 2배로 증가시킨 값 :
//        System.out.println(result2 * 2);

// -----------------------------------------------------------------------------
// Test 1.

//        Test t1 = new Test();
//
//        int a = t1.func1(10);
//        System.out.println(a);
//        // 출력 : 10
//        int b = t1.func1(10);
//        System.out.println(b);
//        // 출력 : 10
//
//        int c = t1.func2(22);
//        System.out.println(c);
//        // 출력 : 22
//
//        int d = t1.func2(55);
//        System.out.println(d);
//        // 출력 : 55
//
//        int e = t1.func3(10);
//        System.out.println(e * 10);
//        // 출력 : 100
//        int f = t1.func3(5);
//        System.out.println(f * 5);
//        // 출력 : 25
//
//        int g = t1.func4(10, 30);
//        System.out.println(g);
//        // 출력 : 40
//
//        int h = t1.func4(20, 50);
//        System.out.println(h);
//        // 출력 : 70

// -----------------------------------------------------------------------------
// Test 2.

//        Test t1 = new Test();
//
//        int rst1 = t1.plus(10, 20);
//        System.out.println(rst1);  // 출력 : 30
//
//        int rst2 = t1.minus(10, 20);
//        System.out.println(rst2); // 출력 : -10
//
//        int rst3 = t1.multiple(5, 4);
//        System.out.println(rst3); // 출력 : 20
//
//        int rst4 = t1.divide(10, 3);
//        System.out.println(rst4); // 출력 : 3
//
//        int rst5 = t1.square(5);
//        System.out.println(rst5); // 출력 : 25

// -----------------------------------------------------------------------------
// Test 3.

//        Test t1 = new Test();
//
//        // 0은 양수로 보겠습니다.
//        int no = -1;
//
//        if(t1.isNegative(no) % 2 != 0) {
//
//            System.out.println("음수입니다.");
//
//        } else {
//
//            System.out.println("양수입니다.");
//
//        }
        // no 값을 바꿔가면서 테스트해보세요.

// -----------------------------------------------------------------------------
// Test 4.

        Test t1 = new Test();

        t1.printEven(10); // 출력: 2 4 6 8 10
        t1.printEven(20); // 출력: 2 4 6 8 10 12 14 16 18 20
        t1.printEven(5); // 출력: 2 4











    }
}
