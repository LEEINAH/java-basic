package day1;

public class Loop {
    public static void main(String[] args) {
//        int num;
//        num = 1;
//        System.out.println(num);
//        num++;
//        System.out.println(num);

        int count;
        count = 0;

        while (count < 10) {
            System.out.println("안녕하세요");
            count++; // count 값이 1 증가
        }

        // 만들고 나서
        // 사용

        int count2 = 0; // 변수를 만듦과 동시에 값 저장

        while (count2 < 10) {
            System.out.println("반갑습니다.");
            count2++;
        }

        // for

        for (int count3 = 0; count3 < 10; count3++) {
            System.out.println("화이팅!");
        }

        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        // 문제 : 1부터 100까지 출력해주세요.

        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        // 문제1. 1 ~ 100까지 수중 짝수만 출력

        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0) {
                System.out.println(i);
            }
        }


 /*
축구 경기가 진행중입니다. 축구경기 타임은 총 90분이고,

현재 A팀이 0점, B팀이 2점인 상황에서, A팀은 최고의 스트라이커인 손흥민을 투입하기로 결정했다.

손흥민은 투입과 동시에 그리고 5분마다 골을 넣을 수 있는 능력을 가지고 있다.

만약 80분에 투입이 되면 80분에 곧바로 골을 넣게되고 85분에 골을 넣음으로서 동점이 가능하게 된다.

(90분이되면 경기가 바로 종료되므로 골을 넣을 수 없다. 해당 경기의 심판은 추가시간을 주지 않는 것으로 유명하다.)

현재 경기타임 time과 A팀의 득점 score가 주어질 때, 손흥민을 투입하면 A팀의 최종 득점은 몇 점인지 출력하시오.
*/

        int time = 74;
        int score = 0;

        // 출력:4

        while (score <= 4) {
            System.out.println(score + "점");
            score++;
        }

        // a b 두 수가 주어지면 a와 b사이의 수를 오름차순 출력해주세요.
        // 오름차순은 작은 수 부터 큰수로 정렬되는 것을 말합니다.
        // ex )
        // 오름차순 :  1, 2, 3, 4, 5
        // 내림차순 :  5, 4, 3, 2, 1

        int a = 12;
        int b = 20;

        if(a > b) {
            for(int i = b + 1; i < a; i++) {
                System.out.println(i);
            }
        }

        else {
            for(int i = a + 1; i < b; i++) {
                System.out.println(i);
            }
        }

        // 문제 : 구구단 작성
        // 조건 : 짝수번째만 곱하기
        /* 출력예시 :

         2 * 2 = 4
         2 * 4 = 8
         2 * 6 = 12
         2 * 8 = 16

         ...

         9단까지 이런식으로 나오면 됩니다.

        */

        int dan = 2;

        for (int i = 2; i <= 9; i++) {

            for (dan = 1; dan <= 9; dan++) {
                if (dan % 2 == 0) {
                    System.out.println(i + " X " + dan + " = " + (dan * i));
                }
            }
        }




    }
}
