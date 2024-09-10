package day3;

import java.util.Scanner;

public class InputGarbage {
    public static void main(String[] args) {

        // 이름과 나이를 입력값으로 받아 자기소개를 해주세요.
        // 조건 : 성과 이름은 띄어쓰기로 구분해주세요.

//        System.out.println("이름을 입력해주세요:");
//        System.out.println("나이를 입력해주세요:");

        // v1
        // 이름을 입력해주세요 : 홍 길동
        // 나이를 입력해주세요 : 29
        // 출력 : 안녕하세요 29세 홍 길동입니다.

        Scanner sc = new Scanner(System.in);

        System.out.print("이름 : ");
        String name = sc.nextLine();

        System.out.print("나이 : ");
        int age = sc.nextInt();

        System.out.println("안녕하세요 " + age + " 살 " + name + "입니다.");

//        int num = Integer.parseInt( s: "123");
//        System.out.println(num);


        // v2
        // 나이를 입력해주세요 : 29
        // 이름을 입력해주세요 : 홍 길동
        // 출력 : 안녕하세요 29세 홍 길동입니다.

        System.out.print("나이 : ");
        int age1 = Integer.parseInt(sc.nextLine());

        System.out.print("이름 : ");
        String name1 = sc.nextLine();

        System.out.println("안녕하세요 " + age1 + " 살 " + name1 + "입니다.");
    }
}
