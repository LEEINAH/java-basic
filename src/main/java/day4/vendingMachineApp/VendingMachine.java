package day4.vendingMachineApp;

import java.util.ArrayList;

    //    String[] names = {"콜라", "사이다", "커피"};
//    int[] prices = {1000, 1200, 800};
//    int[] quantity = {1, 2, 1};
//    ArrayList<String> names = new ArrayList<>();
//    ArrayList<String> names = new ArrayList<>() {{
//        add("콜라");
//        add("사이다");
//        add("커피");
//    }};
//    ArrayList<Integer> prices = new ArrayList<>();

//    ArrayList<Integer> Prices = new ArrayList<>(List.of(1000, 1200, 800));
//
//    ArrayList<Integer> quantity = new ArrayList<>();
//    ArrayList<Integer> quantity = new ArrayList<>() {{
//        add(1);
//        add(2);
//        add(1);
//    }};
//    public VendingMachine() {
//        names.add("콜라");
//        prices.add(1000);
//        quantity.add(1);
//
//        names.add("사이다");
//        prices.add(1200);
//        quantity.add(2);
//
//        names.add("커피");
//        prices.add(800);
//        quantity.add(1);
//    }







public class VendingMachine {

    // 값을 세팅X
    // 연습용으로 하나의 객체만 사용할 때는 미리 넣어 두는 것이 편하니까 그냥 넣어둠.
    int remainder = 0;

    ArrayList<Beverage> beverages = new ArrayList<>();

    public VendingMachine() {
        Beverage b1 = new Beverage("콜라", 1, 1000);
        Beverage b2 = new Beverage("사이다", 2, 1200);
        Beverage b3 = new Beverage("커피", 1, 800);
        beverages.add(b1);
        beverages.add(b2);
        beverages.add(b3);
    }


    public void inputmoney(int money) {
//        remainder = remainder + money;
        remainder += money;
    }

    public String selectBeverage(int target) {

        Beverage beverage = beverages.get(target);

        if(beverage.price > remainder) {
            return "잔액 부족"; // return 하게 되면 메서드는 거기서 종료. 더이상 밑으로 안내려감.
        }
        if(beverage.quantity <= 0) {
            return "수량 부족";
        }

//        remainder = remainder - prices[target];
        remainder -= beverage.price;
//        quantity[target]--;
//        quantity[target] -= 1;
        beverage.quantity--;
//        return names[target];
        return beverage.name;
    }

    public int getRemainder() {
        return remainder;
    }

    public void printBeverages() {
        System.out.println("=== 음료수 목록 ===");
        for(int i = 0; i < beverages.size(); i++)
            System.out.println(i + ". " + beverages.get(i).name + " : " + beverages.get(i).price + "원, 남은 수량 : " + beverages.get(i).quantity);
    }
}
