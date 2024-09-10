package day2;

import java.util.Scanner;

public class InputExam {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);

        // 반복문 추가 문법

        // 반복문 강제 종료 : break
        // 반복문 강제로 다음 회차 넘기기 : continue

//        for(int i = 0; i < 10; i++) {
//            if(i == 5) {
//                //break; // 강제 종료
//                continue;
//            }
//            System.out.println(i);
//        }

//        while(true) {
//            System.out.print("값을 입력해주세요 : ");
//            int num = sc.nextInt();
//
//            if(num == 0) { // num이 0이면 in문 실행
//                break;
//            }
//            System.out.println("당신이 입력한 값은 : " + num);
//        }
//
//        System.out.println("프로그램이 종료되었습니다.");

            // == 계산기 프로그램 v1 ==
            // 기능을 선택해주세요 (1. 더하기, 2. 빼기, 3. 곱하기, 4. 나누기, 5. 종료 ) : 1

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("기능을 선택해주세요 (1. 더하기, 2. 빼기, 3. 곱하기, 4. 나누기, 5. 종료 ) : ");
            int num = sc.nextInt();

            if (num == 5) {
                System.out.println("계산기 프로그램을 종료합니다.");
                break;
            }
            if (num >= 6) {
                System.out.println("그런 기능은 존재하지 않습니다.");
                continue;
            }

            // 첫번째 숫자를 입력해주세요 : 22

            Scanner sc1 = new Scanner(System.in);

            System.out.print("첫번째 숫자를 입력해주세요 : ");
            int num1 = sc1.nextInt();

            // 두번째 숫자를 입력해주세요 : 44

            Scanner sc2 = new Scanner(System.in);

            System.out.print("두번째 숫자를 입력해주세요 : ");
            int num2 = sc2.nextInt();

            // 결과 : 22 + 44 = 66

            if (num == 1) {
                System.out.println("결과 : " + num1 + " + " + num2 + " = " + (num1 + num2));
            } else if (num == 2) {
                System.out.println("결과 : " + num1 + " - " + num2 + " = " + (num1 - num2));
            } else if (num == 3) {
                System.out.println("결과 : " + num1 + " * " + num2 + " = " + (num1 * num2));
            } else if (num == 4) {
                System.out.println("결과 : " + num1 + " % " + num2 + " = " + (num1 % num2));
            }


            // 기능을 선택해주세요 (1. 더하기, 2. 빼기, 3. 곱하기, 4. 나누기, 5. 종료 ) : 3(입력)
            // 첫번째 숫자를 입력해주세요 : 2(입력)
            // 두번째 숫자를 입력해주세요 : 4(입력)0
            // 결과 : 2 * 4 = 8
            // 기능을 선택해주세요 (1. 더하기, 2. 빼기, 3. 곱하기, 4. 나누기, 5. 종료 ) : 6(입력)
            // 그런 기능은 존재하지 않습니다.
            // 기능을 선택해주세요 (1. 더하기, 2. 빼기, 3. 곱하기, 4. 나누기, 5. 종료 ) : 7(입력)
            // 그런 기능은 존재하지 않습니다.
            // 기능을 선택해주세요 (1. 더하기, 2. 빼기, 3. 곱하기, 4. 나누기, 5. 종료 ) : 5(입력)

            // 계산기 프로그램을 종료합니다.

        }
    }
}


