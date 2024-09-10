package day4.mathodReturn;

public class Test {

//    public int plus(int num1, int num2) {
//        System.out.println(num1 + num2);
//        return num1 + num2; // 메서드가 리턴(돌아갈) 때 10이라는 값을 가지고 돌아감.
//    }
//
//    // 실수와 정수를 계산하면 결과는 무조건 실수이다.
//    public double circleArea(int radius) {
//        return radius * radius * 3.14;
//    }

// -----------------------------------------------------------------------------
// Test 1.

//    public int func1(int num1) {
//        return num1;
//    }
//
//    public int func2(int num1) {
//        return num1;
//    }
//
//    public int func3(int num1) {
//        return num1;
//    }
//
//    public int func4(int num1, int num2) {
//        return num1 + num2;
//    }

// -----------------------------------------------------------------------------
// Test 2.

//    public int plus(int num1, int num2) {
//        return num1 + num2;
//    }
//
//    public int minus(int num1, int num2) {
//        return num1 - num2;
//    }
//
//    public int multiple(int num1, int num2) {
//        return num1 * num2;
//    }
//
//    public int divide(int num1, int num2) {
//        return num1 / num2;
//    }
//
//    public int square(int num1) {
//        return num1 * num1;
//    }

// -----------------------------------------------------------------------------
// Test 3.

//    public int isNegative(int num1) {
//        return num1;
//    }

// -----------------------------------------------------------------------------
// Test 4.

    int[] values;

    public void printEven(int n) {
        for (int i = 1; i <= n; i++) {
            if (isEven(i)) {
                System.out.println(i);
            }
        }
    }

    public boolean isEven(int num) {
        if(num % 2 == 0) {
            return true;
        }

        else {
            return false;
        }
    }



}
