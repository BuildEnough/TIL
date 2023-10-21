class Car {
    String color;
    int door;

    void drive() {
        System.out.println("drive");
    }

    void stop() {
        System.out.println("stop");
    }
}

class FireEngine extends Car {
    void water() {
        System.out.println("water");
    }
}


public class typeChange {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe; // car = (Car)fe;에서 형변환 생략됨(5개 => 4개)
        // car.water(); // 에러
        fe2 = (FireEngine)car; // 조상타입 -> 자손 타입, 형변환 필수(4개 => 5개)
        fe2.water();
    }
}