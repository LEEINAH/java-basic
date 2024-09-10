package day2;

public class DoubleLoop {
    public static void main(String[] args) {
        // while, for

        //
        for (int i = 0; i < 10; i++) {
            System.out.println("hi");
        }


        // 구구단 2단 만들기

        // 2 X 1 = 2
        // 2 X 2 = 4
        // 2 X 3 = 6
        // ..
        // 2 X 9 = 18

        // 개인이 최대한 고민할 수 있는 시간 정한다.(30분)
        // 검색(구글, gpt)을 통해 해결(
        // 강사님한테 질문


        // 구구단 2단 출력
        int dan = 2;

        for(int i = 1; i <= 9; i++) {
            System.out.println(dan + " X " + i + " = " + (dan * i));
        }

        // hi 100번 출력

        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.println("hi");
            }
        }

        for(int dan2 = 2; dan2 <= 9; dan2++) {
            for(int i = 1; i <= 9; i++)
                System.out.println(dan2 + " X " + i + " = " + (dan2 * i));
        }

        // 구구단은 n단 ~ m단 중 홀수단만 1 ~ limit 까지 곱 중 짝수곱만 출력해주세요.

        int n = 4; // 시작
        int m = 20; // 끝
        int limit = 10; // 곱의 개수

        /*  입출력 예시
        n은 4, m은 20, limit는 10

        5 * 2 = 10
        5 * 4 = 20
        5 * 6 = 30
        5 * 8 = 40
        5 * 10 = 50

        7 * 2 = 14
        7 * 4 = 28
        7 * 6 = 42
        7 * 8 = 56
        7 * 10 = 70
        ...
        ...
        19 * 2 = 38
        19 * 4 = 76
        19 * 6 = 114
        19 * 8 = 152
        19 * 10 = 190


        */

        for(n = 4; n < 20; n++) {
            if (n % 2 != 0) {
                for (int k = 1; k <= 10; k++) {
                    if (k % 2 == 0) {
                        System.out.println(n + " X " + k + " = " + (n * k));
                    }
                }
            }
        }

        // 출력
        /*
        높이 : [3]

        *
        **
        ***

        */

        for(int height = 0; height < 3; height++) {
            for (int width = 0; width <= height; width++) {
                System.out.print("*");
            }
            System.out.println();
        }





        /*

        높이 : [5]

        *
        **
        ***
        ****
        *****

        */

        for(int height = 0; height < 5; height++) {
            for(int width = 0; width <= height; width++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*

        높이 : [7]

        *
        **
        ***
        ****
        *****
        ******
        *******

        */

        for(int height = 0; height < 7; height++) {
            for(int width = 0; width <= height; width++) {
                System.out.print("*");
            }
            System.out.println();
        }


        // 출력
        /*

        높이 : [3]

          *
         **
        ***

        */

        for(int heigth = 0; heigth < 3; heigth++) {
                    for(int width = 2; width > 0; width--) {
                        if(width == 2) {
                            System.out.print("  " + "*");
                        }
                        else {
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                }

        /*

        높이 : [5]

            *
           **
          ***
         ****
        *****

    */

    /*

    높이 : [7]

          *
         **
        ***
       ****
      *****
     ******
    *******

    */



    }
}
