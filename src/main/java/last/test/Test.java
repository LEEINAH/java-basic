package last.test;

public class Test {
    public static void main(String[] args) {
        DataStore ds = new DataStore();

        // 형변환 -> 원시타입 => 작은거에서 큰거로 변환하면 안전.(자동 형변환)
        // 형변환 -> 객체타입 => 자식타입이 부모타입으로 변환하면 안전.(자동 형변환)

        // // 정수 계열
        byte b = 0; // 1바이트
        ds.save(b);

        short s = 2; // 2바이트
        ds.save(s);

        int i = 3; // 4바이트
        ds.save(i);

        long l = 4; // 8바이트
        ds.save(l);

        // 정수 => 실수 변환이 안전

        // 실수 계열
        // 4.1f => float 형 실수를 의미
        float f = 3.14f; // 4바이트
        ds.save(f);

        // 3.141592 => double 형 실수를 의미
        double d = 3.141592; // 8 바이트
        ds.save(d);
        // 논리 계열
        boolean bl = false; // 1/8 바이트, 1비트
        ds.save(bl);

        // 객체 계열
        Person p1 = new Person();
        ds.save(p1);

        Apple a1 = new Apple();
        ds.save(a1);

        String str = "hello";
        ds.save(str);

    }

}
