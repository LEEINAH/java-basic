package day2;

public class Array {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;
        int f = 60;
        int g = 70;
        int h = 80;

        // 변수가 많아지면 변수를 관리하는 것도 힘들고 사용하는 것도 힘들다.
        // 1. 변수명이 많아져서 힘듦 -> 변수명을 한개만 쓰면 됨.
        // 2. 변수가 많아서 다 사용하기 힘듦 -> 반복문을 사용하면 됨.

        // 결론 : 배열을 사용하면 됨.

        int[] arr = {10, 20, 30, 40, 50};

        System.out.println(arr[3]);
        System.out.println(arr[0]);

        int num = 10;
        num = 20;
        System.out.println("=================================================");
        System.out.println(arr[2]);
        arr[2] = 100; // 배열의 특정 위치의 값을 새로운 값으로 대입 가능.
        System.out.println(arr[2]);
        System.out.println("=================================================");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println("=================================================");
        for (int i = 0; i <= 4; i++) {
            System.out.println(arr[i]);
        }

        // 숫자 10, 20, 30, 40, 50, 60, 70, 80, 90, 100
        // 배역에 저장하고 출력.

        int[] arr2 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        // 배열의 길이 정보 확인
        System.out.println(arr2.length);

        // 내가 저장할 값이 몇개인지 모를 때, 개수를 알아도 구체적인 값을 모를 때
        // 비어있는 배열을 만들어 놓고 나중에 값을 저장할 수도 있어야 함.

        // 10개짜리 비어있는 배열을 만들기
        int[] arr3 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] arr4 = new int[10];

        System.out.println(arr3.length);
        System.out.println(arr4.length);

        arr4[4] = 10;

        // arr 배열에 10, 20, 30, 40, 50, 60, 70, 80, 90, 100을 저장하고 출력해주세요.

        int[] arr5 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        for (int i = 0; i < arr5.length; i++) {
            System.out.println(arr5[i]);
        }

        // 배열의 모든 요소를 세번 출력해주세요.

        int[] arr6 = {1, 2, 3, 4, 5};

        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < arr6.length; i++) {
                System.out.println(arr6[i]);
            }
        }

        // 배열에 5개의 값을 입력하고 거꾸로 출력해주세요.

        int[] arr7 = {10, 20, 30, 40, 50};

        for (int i = arr7.length - 1; i >= 0; i--) {
            System.out.println(arr7[i]);
        }

        // 배열 안의 숫자들의 합을 구해주세요.



        /*
		// 아래 4줄은 위 1줄과 같은 의미 입니다.
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
		*/









        // 숫자 배열 -> 숫자만 저장 가능. 다른 타입은 불가능.

        int[] arr9 = {1, 2, 3, 4, 5};

        // 문자 배열

        String[] arr10 = {"apple", "banana", "orange"};
        boolean[] arr11 = {true, false, false, true};




    }
}
