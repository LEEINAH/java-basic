package day2;

import java.util.Scanner;

public class InputString {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

        // 문자열 입력 받기
//        System.out.print("첫번째 값을 입력해주세요 : ");
//        String str1 = sc.nextLine();
//        System.out.println("당신이 입력한 첫번째 값은 : " + str1);
//
//        System.out.print("두번째 값을 입력해주세요 : ");
//        String str2 = sc.nextLine();
//        System.out.println("당신이 입력한 두번째 값은 : " + str2);

        //Scanner를 이용해서 아래와 같이 입출력 하여 사칙연산을 수행해주세요.
        //입출력 예시
        //첫번째 숫자를 입력해주세요: 12
        //두번째 숫자를 입력해주세요: 33
        //12 + 33 = 45

//        Scanner sc2 = new Scanner(System.in);
//
//        int num1 = sc2.nextInt();
//        System.out.println("당신이 입력한 첫번째 값은 : " + num1);
//
//        int num2 = sc2.nextInt();
//        System.out.println("당신이 입력한 첫번째 값은 : " + num2);
//
//        System.out.print(num1 + num2);

        // Scanner를 이용해 입력값을 받아
        // 구구단을 원하는 단이 나오게 해주세요.

        //예시) 원하는 단을 입력해주세요 : 4 (입력후 엔터)

        // 4단 출력.

        Scanner sc3 = new Scanner(System.in);

        System.out.println("원하는 단을 입력해주세요 : "); {
            int num3 = sc3.nextInt();
            for(int i = 1; i < 10; i++) {
                System.out.println(num3 + " X " + i + " = " + (num3*i));
            }
        }




    }
}
