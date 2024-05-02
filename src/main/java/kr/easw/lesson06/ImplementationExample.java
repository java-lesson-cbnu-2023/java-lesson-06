package kr.easw.lesson06;

/**
 * 해당 클래스는 인터페이스에 대해 조금 더 친숙해지기 위해 구성된 문제입니다.
 *
 * Dog 클래스를 참고하여, Cat과 Horse 클래스를 Animal 인터페이스를 구현하도록 만들어보세요.
 * 해당 예제는 의도적으로 오류가 발생하도록 구성되었으며, Animal을 구현하지 않은 클래스는 오류가 발생합니다.
 */
public class ImplementationExample {

    public static void main(String[] args) {
        new Dog().speak();
        new Cat().speak();
        new Horse().speak();
    }

    // 인터페이스는 클래스의 설계도와 비슷한 개념입니다.
    // 메서드를 강제할 수 있으나 변수와 같은 실질적인 데이터는 가질 수 없습니다.
    // 또한, 설계도에 가까운 개념이기에 실체가 있는 인스턴스를 생성할 수 없습니다.
    // 자바 7까지는 인터페이스에서 몸체(body)가 있는 메서드를 사용할 수 없었으나, 자바 8부터는 default 키워드를 사용하여 몸체가 있는 메서드를 사용할 수 있습니다.
    // 이번 예제에서는 default 키워드를 실습하지 않습니다.
    interface Animal {
        // 몸체(body)가 없이 선언된 인터페이스의 메서드는 이 인터페이스를 상속한 클래스에 이 메서드의 구현을 강제합니다.
        void speak();
    }

    // 이 클래스를 final로 선언함으로써 Dog 클래스에서 추가적으로 파생되는 클래스가 존재하지 못하도록 강제합니다.
    // final로 선언된 클래스는 상속할 수 없습니다.
    final static class Dog implements Animal {
        private void bark() {
            System.out.println("Bark!");
        }

        // 부모 클래스에서 오버라이딩(Overriding)된 클래스는 @Override 어노테이션을 통해 오버라이딩된 메서드임을 명시할 수 있습니다.
        // 어노테이션은 컴파일러에게 특정한 정보를 전달하는 역할을 합니다. @Override의 경우, 해당 메서드가 오버라이딩된 메서드임을 명시합니다.
        // 만약, 이 어노테이션이 상속 대상이 아닌 메서드에 사용된다면 컴파일러는 오류를 발생시킵니다.
        @Override
        public void speak() {
            bark();
        }
    }


    static class Cat {
        private void meow() {
            System.out.println("Meow!");
        }
    }

    static class Horse {
        private void neigh() {
            System.out.println("Neigh!");
        }
    }
}
