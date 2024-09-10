package day3;

import java.util.ArrayList;
import java.util.Scanner;

// 명명 규칙
// 클래스명은 대문자 시작
// 의미가 바뀔 때 대문자로 구분. 두 단어 이상의 조합으로 이름 지을 때 단어 의미가 바뀌면 바뀌는 단어의 앞문자를 대문자로
// 카멜 표기법
// 함수나 변수는 소문자로 시작.
// 상수는 모두 대문자 띄어쓰기는 _
public class NameApp {
    public static void main(String[] args) {

        // 명령어 입력 : help
        // add : 이름 입력
        // list : 이름 목록
        // exit : 종료
        // 명령어 입력 : add
        // 이름을 입력해주세요 : john
        // 나이를 입력해주세요 : 18
        // john이 명부에 저장되었습니다.
        // 명령어 입력 : list
        // ===== 이름 목록 =====
        // john, 18
        // =====================
        // 명령어 입력 : add
        // 이름을 입력해주세요 : tomas
        // 나이를 입력해주세요 : 24
        // tomas이 명부에 저장되었습니다.
        // 명령어 입력 : add
        // 이름을 입력해주세요 : chris
        // 나이를 입력해주세요 : 20
        // chris이 명부에 저장되었습니다.
        // ===== 이름 목록 =====
        // 1. john, 18
        // 2. tomas, 24
        // 3. chris, 20
        // =====================
        // 명령어 입력 : exit
        // 이름 프로그램이 종료됩니다.

        Scanner sc = new Scanner(System.in);
//        String name = ""; // 변수를 배열로 교체
//        String[] names = new String[5]; // 비어있는 공간은 숫자는 0으로, 문자는 null로 채워짐
//        int[] ages = new int[5];
        ArrayList<Person2> persons = new ArrayList<>();

        while (true) {
            System.out.print("명령어 입력 : ");
            String menu = sc.nextLine();

            if(menu.equals("help")) {

                System.out.println("add : 이름 입력");
                System.out.println("list : 이름 목록");
                System.out.println("exit : 종료");

            } else if(menu.equals("add")) {

                Person2 p1 = new Person2(); // 지역변수 => 특정 지역에서 만들어져서 지역이 끝나면 사라진다.

                System.out.print("이름 입력 : ");
                p1.name = sc.nextLine();

                System.out.print("나이 입력 : ");
                p1.age = Integer.parseInt(sc.nextLine());

                persons.add(p1); // p1 변수가 사라지기 전에 p1에 저장된 person 리모콘을 배열에 저장

                System.out.println(p1.name + "이 명부에 저장되었습니다.");

            } else if(menu.equals("list")) {

                System.out.println("===== 이름 목록 =====");
                for(int i = 0; i < persons.size(); i++){
                    Person2 p1 = persons.get(i);
                    System.out.println(p1.name + ", " + p1.age);
                }
                System.out.println("=====================");
            } else if(menu.equals("exit")) {

                System.out.println("이름 프로그램을 종료합니다.");
                break;

            }
        }



    }

}


