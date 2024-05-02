package kr.easw.lesson06;

/**
 * 해당 클래스는 추상 클래스에 대해 조금 더 친숙해지기 위해 구성된 문제입니다.
 *
 * Vehicle 클래스를 참고하여, Car, Bicycle, Motorcycle 클래스를 구현하도록 만들어보세요.
 * 해당 예제는 의도적으로 오류가 발생하도록 구성되었으며, Vehicle을 상속하지 않은 클래스는 오류가 발생합니다.
 */
public class AbstractionExample {

    public static void main(String[] args) {
        new Car("Car").run();
        new Bicycle("Bicycle").run();
        new Motorcycle("Motorcycle").run();
    }

    // 추상 클래스는 인터페이스와 비슷한 개념이지만, 인터페이스와 달리 변수를 가질 수 있습니다.
    // 또한, 인터페이스와 달리 몸체(body)가 있는 메서드를 가질 수 있습니다. (이는 자바 8부터 완화되어 인터페이스는 default 키워드를 사용하여 몸체가 있는 메서드를 가질 수 있습니다.)
    // 추상 클래스는 일반 클래스와 거의 같지만, 추상 메서드(abstract)를 선언할 수 있는것과 인스턴스를 생성할 수 없는 것이 다릅니다.
    //
    // abstract는 해당 메서드가 몸체(body)가 없는 메서드임을 명시합니다. 이러한 메서드는 해당 클래스를 상속한 클래스에서 반드시 구현해야 합니다.
    // 만약 상속받는 클래스가 추상 클래스일 경우, 해당 클래스는 추상 메서드를 선언함에 강제되지 않습니다.
    abstract static class Vehicle {
        private final String name;

        public Vehicle(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public abstract void run();
    }

    static class Car extends Vehicle {
        public Car(String name) {
            super(name);
        }

        @Override
        public void run() {
            System.out.println("Car is running!");
        }
    }


    static class Bicycle {

    }

    static class Motorcycle {

    }
}
