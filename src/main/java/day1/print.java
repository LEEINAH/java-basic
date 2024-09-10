package day1;


public class print {

    // 주석(comment) : 사람이 보기 위한 코멘트. 컴퓨터는 무시합니다. (한줄 주석)
    // 여러줄 주석 : 컨트롤 + /
    public static void  main(String args[]) {
        // 여러줄 주석 : 컨트롤 + /
//        aaa;
//        bbb;
//        ccc;
//        ddd;

        // 프로그램 명령어(코드)는 위에서 아래로 순차 실행.

        // 출력 -> System.out.print() 괄호 안의 값을 콘솔에 출력
        System.out.print(100);
        System.out.print(777);

        // 출력 -> System.out.println() : 출력 후 줄바꿈해주는 명령어
        System.out.println(100);
        System.out.println(777);

        // 문자의 경우는 ""를 이용해 구별해야 한다.
        System.out.println("이인아");

//        더하기 출력
        System.out.println(100+200);

//        100 + 200 = 300
        System.out.println("100 + 200 = 300");

//        숫자 + 숫자 => 더하기 산술 연산
//        문자 + 문자 => 이어 붙이기
//        문자 + 숫자 => 숫자가 문자가 되어서 이어 붙이기
        System.out.println("100 + 200 = " + "300");
        System.out.println("100 + 200 = " + 300);
        System.out.println("100 + 200 = " + (100 + 200));

//        하나의 출력문에서 줄바꿈하기
//        줄바꿈 문자 : \n
        System.out.println("안녕하세요\n반갑습니다.");

//        구구단 2단을 System.out.println 한번만 사용해서 출력해주세요.
//        2 * 1 = 2
//        2 * 2 = 4
//        2 * 3 = 6
//        2 * 4 = 8
//        ....
//        2 * 9 = 18

        System.out.println("2 * 1 = 2\n2 * 2 = 4\n2 * 3 = 6\n2 * 4 = 8\n2 * 5 = 10\n2 * 6 = 12\n2 * 7 = 14\n2 * 8 = 2\n2 * 9 = 18\n");

     }
}