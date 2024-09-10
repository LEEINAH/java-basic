package day5.arrayList;


import java.util.ArrayList;

// {5,4,3,2,1,0}을 ArrayList에 추가 해주세요.
// ArrayList의 사이즈를 출력해주세요.
// ArrayList의 3,4번째 값을 읽어서 출력해주세요. (인덱스 X, 1부터 )
// 1,2번째 값을 지운 뒤, 다시 3,4번째 값을 출력해주세요
// List의 모든 값을 출력해주세요.
public class ArrayListExam {
    public static void main(String[] args) {
        //-----------------------------------------------------------------------------------------
        // Test 1.
        // 정수를 저장할 수 있는 ArrayList를 선언하고 만들어주세요.
        // 리스트에 값을 추가해주세요.

//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(5);
//        list.add(4);
//        list.add(3);
//        list.add(2);
//        list.add(1);
//        list.add(0);

        // size()
        // 리스트의 사이즈를 출력해주시고, 값이 6이 맞다면 계속 진행해주세요.
        // 출력결과 : 6
//        System.out.println(list.size());

        // get()
        // 리스트의 3,4번째 값을 출력해주세요.
        // 출력결과 : 3, 2
//        System.out.println(list.get(2));
//        System.out.println(list.get(3));


        // remove()
        // 리스트의 1,2번째 값을 지운 뒤, 다시 3,4번째 값을 출력해주시고 어떤 변화가 있는지 체크해주세요.
        // 출력 결과 : 1, 0
//        list.remove(0);
//        list.remove(0);
//
//        System.out.println(list.get(2));
//        System.out.println(list.get(3));

        // 반복문으로 출력.
        //
        // 리스트의 모든 값을 출력해주세요.
        // 출력 결과 : 3, 2, 1, 0

//        for(int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

        //-----------------------------------------------------------------------------------------
        // Test 2.

        // 선언
        // 이름을 저장할 수 있는 ArrayList를 선언하고 만들어주세요.

//        ArrayList<String> names = new ArrayList<>();
//
//        // add()
//        // 리스트에 값을 추가해주세요.
//        // "홍길동", "이순신", "황진이", "임꺽정", "강감찬", "을지문덕" 을 ArrayList에 추가 해주세요.
//
//        names.add("홍길동");
//        names.add("이순신");
//        names.add("황진이");
//        names.add("임꺽정");
//        names.add("강감찬");
//        names.add("을지문덕");
//
//        // size()
//        // 리스트의 사이즈를 출력해주시고, 값이 6이 맞다면 계속 진행해주세요.
//        // 출력결과 : 6
//
//        System.out.println(names.size());
//
//        // get()
//        // 리스트의 2,3 인덱스의 값을 출력해주세요.
//        // 출력결과 : 황진이, 임꺽정
//
//        System.out.println(names.get(2));
//        System.out.println(names.get(3));
//
//        // 리스트의 모든 값을 출력해주세요.
//        // 출력 결과 : 홍길동 이순신 황진이 임꺽정 강감찬 을지문덕
//
//        for(int i = 0; i < names.size(); i++){
//            System.out.println(names.get(i));
//        }
//
//        // remove()
//        // 리스트에서 홍길동, 이순신을 지운 뒤, 다시 2,3 인덱스의 값을 출력해주시고 어떤 변화가 있는지 체크해주세요.
//        // 출력 결과 : 강감찬, 을지문덕
//
//        names.remove(0);
//        names.remove(0);
//
//        System.out.println(names.get(2));
//        System.out.println(names.get(3));
//
//        // 리스트의 모든 값을 출력해주세요.
//        // 출력 결과 : 황진이 임꺽정 강감찬 을지문덕
//
//        for(int i = 0; i < names.size(); i++){
//            System.out.println(names.get(i));
//        }
//
//        // add()
//        // 리스트에 정약용을 추가시켜주세요.
//
//        names.add("정약용");
//
//        // 리스트의 모든 값을 출력해주세요.
//        // 출력 결과 : 황진이 임꺽정 강감찬 을지문덕 정약용
//
//        for(int i = 0; i < names.size(); i++){
//            System.out.println(names.get(i));
//        }
//
//        // set()
//        // 임꺽정과 을지문덕을 신사임당과 유관순으로 바꿔주세요.

//            for(int i = 0; i < names.size(); i++) {
//                if (names.get(i).equals("임꺽정")) {
//                    names.set(i, "신사임당");
//                }
//
//                if (names.get(i).equals("을지문덕")) {
//                    names.set(i, "유관순");
//                }
//            }
//
//        names.set(1, "신사임당"); // 이 방식으로 하면 특정 이름을 찾을 수 없음
//        names.set(3, "유관순");
//
//        // 리스트의 모든 값을 출력해주세요.
//        // 출력 결과 : 황진이 신사임당 강감찬 유관순 정약용
//
//        for(int i = 0; i < names.size(); i++){
//            System.out.println(names.get(i));
//        }
//
//        // 리스트에서 황진이 신사임당 유관순만 출력해주세요.
//        // 출력 결과 : 황진이 신사임당 유관순
//
//        System.out.println(names.get(0));
//        System.out.println(names.get(1));
//        System.out.println(names.get(3));

        //-----------------------------------------------------------------------------------------
        // Test 3.

        Person p1 = new Person();
        p1.age = 24;
        p1.name = "홍길동";

        Person p2 = new Person();
        p2.age = 30;
        p2.name = "이순신";

        Person p3 = new Person();
        p3.age = 41;
        p3.name = "을지문덕";

        Person p4 = new Person();
        p4.age = 32;
        p4.name = "황진이";

        // 1. 네 사람을 ArrayList에 저장

        ArrayList<Person> list = new ArrayList<>();

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        // 2. 네 사람에게 자기소개 시키기 (자기소개 문구 : 안녕하세요 ~~살 ~~~입니다.)

        for(int i = 0; i < list.size(); i++){
            Person p = list.get(i);
            p.introduce();
        }

//        p1.introduce();
//        p2.introduce();
//        p3.introduce();
//        p4.introduce();

//        list.remove(1);
//        System.out.println("================================");
//        for(int i = 0; i < list.size(); i++) {
//            Person p = list.get(i);
//            p.introduce();
//        } // 특정인물 삭제하기

        // 3. 30대인 사람에게만 자기소개 시키기

        for(int i = 0; i < list.size(); i++){
            Person p = list.get(i);
            p.introduce2();
        }

//        p1.introduce2();
//        p2.introduce2();
//        p3.introduce2();
//        p4.introduce2();


    }
}
