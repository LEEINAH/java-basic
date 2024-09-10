package day6.kiosk;

import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk {
    public static void main(String[] args) {
        // 햄버거 키오스크 만들기

        // 햄버거 키오스크 v1
        // 1. 햄버거 선택
        // 2. 사이드 선택
        // 3. 음료수 선택
        // 4. 메뉴 취소
        // 5. 주문 하기
        //====== 주문 목록 =====
        // 버거: []
        // 사이드 : []
        // 음료수 : []
        // 총금액 : 0
        // 무엇을 하시겠습니까 : 1

        // === 햄버거 목록 ===
        // 1. 한우불고기버거 6000
        // 2. 치즈버거 3000
        // 3. 치킨버거 3500
        // 4. 새우버거 3200
        // 어떤 버거를 고르시겠습니까 : 1
        // 한우불고기버거를 고르셨습니다.


        // ================================================================


        // 햄버거 키오스크 v1
        // 1. 햄버거 선택
        // 2. 사이드 선택
        // 3. 음료수 선택
        // 4. 메뉴 취소
        // 5. 주문 하기
        //====== 주문 목록 =====
        // 버거: [한우불고기버거]
        // 사이드 : []
        // 음료수 : []
        // 총금액 : 6000
        // 무엇을 하시겠습니까 : 2

        // === 사이드 목록 ===
        // 1. 감자튀김 1800
        // 2. 치즈스틱 2000
        // 3. 치킨너겟 2500
        // 4. 오징어링 2700
        // 어떤 사이드를 고르시겠습니까 : 2
        // 치즈스틱을 고르셨습니다.

        // ================================================================

        // 햄버거 키오스크 v1
        // 1. 햄버거 선택
        // 2. 사이드 선택
        // 3. 음료수 선택
        // 4. 메뉴 취소
        // 5. 주문 하기
        //====== 주문 목록 =====
        // 버거: [한우불고기버거]
        // 사이드 : [치즈스틱]
        // 음료수 : []
        // 총금액 : 8000
        // 무엇을 하시겠습니까 : 2

        // === 사이드 목록 ===
        // 1. 감자튀김 1800
        // 2. 치즈스틱 2000
        // 3. 치킨너겟 2500
        // 4. 오징어링 2700
        // 어떤 사이드를 고르시겠습니까 : 1
        // 감자튀김을 고르셨습니다.

        // ================================================================

        // 햄버거 키오스크 v1
        // 1. 햄버거 선택
        // 2. 사이드 선택
        // 3. 음료수 선택
        // 4. 메뉴 취소
        // 5. 주문 하기
        //====== 주문 목록 =====
        // 버거: [한우불고기버거]
        // 사이드 : [치즈스틱, 감자튀김]
        // 음료수 : []
        // 총금액 : 9800
        // 무엇을 하시겠습니까 : 3

        // === 음료수 목록 ===
        // 1. 콜라 1000
        // 2. 에이드 2000
        // 3. 커피 1500
        // 4. 쉐이크 2500
        // 어떤 음료수를 고르시겠습니까 : 2
        // 에이드를 고르셨습니다.

        // ================================================================

        // 햄버거 키오스크 v1
        // 1. 햄버거 선택
        // 2. 사이드 선택
        // 3. 음료수 선택
        // 4. 메뉴 취소
        // 5. 주문 하기
        //====== 주문 목록 =====
        // 버거: [한우불고기버거]
        // 사이드 : [치즈스틱, 감자튀김]
        // 음료수 : [에이드]
        // 총금액 : 11800
        // 무엇을 하시겠습니까 : 4

        // 어떤 메뉴를 취소하겠습니까?
        // 1. 버거
        // 2. 사이드
        // 3. 음료수
        // 선택 : 2

        // 품목을 선택해주세요.
        // 1. 치즈스틱
        // 2. 감자튀김
        // 선택 : 1
        // 치즈스틱이 취소되었습니다.

        // ================================================================

        // 햄버거 키오스크 v1
        // 1. 햄버거 선택
        // 2. 사이드 선택
        // 3. 음료수 선택
        // 4. 메뉴 취소
        // 5. 주문 하기
        //====== 주문 목록 =====
        // 버거: [한우불고기버거]
        // 사이드 : [감자튀김]
        // 음료수 : [에이드]
        // 총금액 : 9800
        // 무엇을 하시겠습니까 : 5

        // 정말 주문하시겠습니까?(y/n) : y
        // 결제 금액을 입력해주세요 : 20000

        // 영수증 발급하시겠습니까?(y/n) : y

        // ==== 영수증 =====
        // 버거: [한우불고기버거]
        // 사이드 : [감자튀김]
        // 음료수 : [에이드]
        // 총금액 : 9800
        //==================

        // 거스름든 : 10200원
        // 이용해주셔서 감사합니다.

        // ================================================================
        Scanner sc = new Scanner(System.in);
        System.out.println("햄버거 키오스크 v1");

        ArrayList<Burger> burgers = new ArrayList<>();
        ArrayList<Burger> burgerCart = new ArrayList<>();

        Burger b1 = new Burger("한우불고기버거", 6000);
        Burger b2 = new Burger("치즈버거", 3000);
        Burger b3 = new Burger("치킨버거", 3500);
        Burger b4 = new Burger("새우버거", 3200);

        burgers.add(b1);
        burgers.add(b2);
        burgers.add(b3);
        burgers.add(b4);


        ArrayList<Side> sides = new ArrayList<>();
        ArrayList<Side> sideCart = new ArrayList<>();

        Side s1 = new Side("감자튀김", 1800);
        Side s2 = new Side("치즈스틱", 2000);
        Side s3 = new Side("치킨너겟", 2500);
        Side s4 = new Side("오징어링", 2700);

        sides.add(s1);
        sides.add(s2);
        sides.add(s3);
        sides.add(s4);


        ArrayList<Drink> drinks = new ArrayList<>();
        ArrayList<Drink> drinkCart = new ArrayList<>();

        Drink d1 = new Drink("콜라", 1000);
        Drink d2 = new Drink("에이드", 2000);
        Drink d3 = new Drink("커피", 1500);
        Drink d4 = new Drink("쉐이크", 2500);

        drinks.add(d1);
        drinks.add(d2);
        drinks.add(d3);
        drinks.add(d4);

        int totalprice = 0;

        while (true) {
            System.out.println("1. 햄버거 선택");
            System.out.println("2. 사이드 선택");
            System.out.println("3. 음료수 선택");
            System.out.println("4. 메뉴 취소");
            System.out.println("5. 주문 하기");
            System.out.println("====== 주문 목록 =====");
            System.out.print("버거: [");
            for (int i = 0; i < burgerCart.size(); i++) {
                System.out.print(burgerCart.get(i).name + " ");
            }
            System.out.println("]");
            System.out.print("사이드 : [");
            for (int i = 0; i < sideCart.size(); i++) {
                System.out.print(sideCart.get(i).name + " ");
            }
            System.out.println("]");
            System.out.print("음료수 : [");
            for (int i = 0; i < drinkCart.size(); i++) {
                System.out.print(drinkCart.get(i).name + " ");
            }
            System.out.println("]");
            System.out.printf("총금액 : %d\n", totalprice);
            System.out.print("무엇을 하시겠습니까 : ");
            int menu = Integer.parseInt(sc.nextLine());

            if (menu == 1) {
                System.out.println("=== 햄버거 목록 ===");
                for (int i = 0; i < burgers.size(); i++) {
                    System.out.printf("%d. %s %d\n", i + 1, burgers.get(i).name, burgers.get(i).price);
                }

                System.out.print("어떤 버거를 고르시겠습니까 : ");
                int selectNo = Integer.parseInt(sc.nextLine()); // 번호로 버거 선택
                Burger burger = burgers.get(selectNo - 1); // 선택한 버거 가져오기
                burgerCart.add(burger); // 카트에 선택한 버거 넣기
                totalprice += burger.price;
                System.out.printf("%s를 고르셨습니다.\n", burger.name);
                System.out.println("======================================================================");
            } else if (menu == 2) {
                System.out.println("=== 사이드 목록 ===");
                for (int i = 0; i < sides.size(); i++) {
                    System.out.printf("%d. %s %d\n", i + 1, sides.get(i).name, sides.get(i).price);
                }

                System.out.print("어떤 사이드를 고르시겠습니까 : ");
                int selectNo = Integer.parseInt(sc.nextLine());
                Side side = sides.get(selectNo - 1);
                sideCart.add(side);
                totalprice += side.price;
                System.out.printf("%s를 고르셨습니다.\n", side.name);
                System.out.println("======================================================================");
            } else if (menu == 3) {
                System.out.println("=== 음료수 목록 ===");
                for (int i = 0; i < drinks.size(); i++) {
                    System.out.printf("%d. %s %d\n", i + 1, drinks.get(i).name, drinks.get(i).price);
                }

                System.out.print("어떤 음료수를 고르시겠습니까 : ");
                int selectNo = Integer.parseInt(sc.nextLine());
                Drink drink = drinks.get(selectNo - 1);
                drinkCart.add(drink);
                totalprice += drink.price;
                System.out.printf("%s를 고르셨습니다.\n", drink.name);
                System.out.println("======================================================================");
            } else if (menu == 4) {
                System.out.println("어떤 메뉴를 취소하시겠습니까?");
                System.out.println("1. 버거");
                System.out.println("2. 사이드");
                System.out.println("3. 음료수");
                System.out.print("선택 : ");
                int number = Integer.parseInt(sc.nextLine());

                if(number == 1) {
                    System.out.println("품목을 선택해주세요.");
                    for(int i = 0; i < burgerCart.size(); i++) {
                        System.out.printf("%d. %s \n", i + 1, burgerCart.get(i).name);
                    }
                    System.out.print("선택 : ");
                    int target = Integer.parseInt(sc.nextLine());
                    System.out.printf("%s가 취소되었습니다.\n", burgerCart.get(target - 1).name);
                    System.out.println("======================================================================");
                    totalprice -= burgerCart.get(target - 1).price;
                    burgerCart.remove(target - 1);
                } else if(number == 2) {
                    System.out.println("품목을 선택해주세요.");
                    for(int i = 0; i < sideCart.size(); i++) {
                        System.out.printf("%d. %s \n", i + 1, sideCart.get(i).name);
                    }
                    System.out.print("선택 : ");
                    int target = Integer.parseInt(sc.nextLine());
                    System.out.printf("%s가 취소되었습니다.\n", sideCart.get(target - 1).name);
                    System.out.println("======================================================================");
                    totalprice -= sideCart.get(target - 1).price;
                    sideCart.remove(target - 1);
                } else if(number == 3) {
                    System.out.println("품목을 선택해주세요.");
                    for(int i = 0; i < drinkCart.size(); i++) {
                        System.out.printf("%d. %s \n", i + 1, drinkCart.get(i).name);
                    }
                    System.out.print("선택 : ");
                    int target = Integer.parseInt(sc.nextLine());
                    System.out.printf("%s가 취소되었습니다.\n", drinkCart.get(target - 1).name);
                    System.out.println("======================================================================");
                    totalprice -= drinkCart.get(target - 1).price;
                    drinkCart.remove(target - 1);
                }
            } else if (menu == 5) {
                System.out.print("정말 주문하시겠습니까?(y/n) : ");
                String answer = sc.nextLine();

                if(answer.equals("y")) {
                    System.out.print("결제 금액을 입력해주세요 : ");
                    int money = Integer.parseInt(sc.nextLine());

                    System.out.print("영수증을 발급하시겠습니까?(y/n) : ");
                    String answer2 = sc.nextLine();


                    if(answer2.equals("y")) {
                        System.out.println("==== 영수증 =====");
                        System.out.print("버거: [");
                        for (int i = 0; i < burgerCart.size(); i++) {
                            System.out.print(burgerCart.get(i).name + " ");
                        }
                        System.out.println("]");
                        System.out.print("사이드 : [");
                        for (int i = 0; i < sideCart.size(); i++) {
                            System.out.print(sideCart.get(i).name + " ");
                        }
                        System.out.println("]");
                        System.out.print("음료수 : [");
                        for (int i = 0; i < drinkCart.size(); i++) {
                            System.out.print(drinkCart.get(i).name + " ");
                        }
                        System.out.println("]");
                        System.out.printf("총금액 : %d\n", totalprice);
                        System.out.println("==================");
                        System.out.print("거스름돈 : ");
                        System.out.println(money - totalprice);
                        System.out.println("이용해주셔서 감사합니다.");
                        System.out.println("======================================================================");

                        break;

                    } else if(answer2.equals("n")) {
                        System.out.print("거스름돈 : ");
                        System.out.println(money - totalprice);
                        System.out.println("이용해주셔서 감사합니다.");
                        System.out.println("======================================================================");

                        break;
                    }

                } else if(answer.equals("n")) {
                    continue;
                }

            }


        }
    }
}
