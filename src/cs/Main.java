package cs;

public class Main {
    public static void main(String[] args) {
        // Car 이라는 설계도
        // 각 객체는 독립적인 상태정보(Color, model, brand)를 가질 수 있습니다.

        // 이를 통해 객체를 정의하고 인스턴스를 생성 -> ferrari, porsche

        // 인스턴스를 생성하며 메모리에 할당됩니다.
        // ferrari 와 porsche 는 인스턴스를 참조하는 참조변수가 됩니다.
        // 이 변수들을 통하여 Car 클래스의 메소드를 호출 또는 멤버 변수에 접근할 수 있습니다.

        Car ferrari = new Car("Red", "488 Spyder", "Ferrari");
        Car porsche = new Car("blue", "123", "porsche");


        //해당 인스턴스의 특징
        ferrari.drive();
        ferrari.accelerate();
        ferrari.stop();

        //해당 인스턴스의 특징
        porsche.drive();
        porsche.accelerate();
        porsche.stop();

    }
}
