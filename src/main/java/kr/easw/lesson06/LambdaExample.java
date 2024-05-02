package kr.easw.lesson06;

import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 해당 클래스는 람다 표현식에 대해 조금 더 친숙해지기 위해 구성된 문제입니다.
 * <p>
 * 미리 선언된 람다 표현식을 사용하여, 예제로 주어진 메서드와 동일한 기능을 수행하는 코드를 작성해보세요.
 */
public class LambdaExample {
    // 이 변수는 상수이기에 대문자로 선언합니다.
    private static final Random RANDOM = new Random();

    // 실습에 사용될 숫자들입니다.
    private static final int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    // Supplier은 제너릭스에 포함된 타입을 반환하는 함수형 인터페이스입니다.
    // 이는 다음과 같은 코드를 축약한 형태입니다 :
    // public int supplyNumber() {
    //    return numbers[RANDOM.nextInt(numbers.length)];
    // }
    private static final Supplier<Integer> numberSupplier = () -> numbers[RANDOM.nextInt(numbers.length)];

    // Function은 제너릭스에 포함된 타입을 받아 제너릭스에 포함된 타입을 반환하는 함수형 인터페이스입니다.
    // 이 람다 제너릭스는 <Integer, Integer>이기에 Integer를 받아 Integer를 반환합니다.
    // 해당 람다 표현식은 다음과 같은 코드를 축약한 형태입니다 :
    // public int convertToNegative(int number) {
    //    return -number;
    // }
    private static final Function<Integer, Integer> negativeConverter = (number) -> -number;

    // Consumer은 제너릭스에 포함된 타입을 받아 아무것도 반환하지 않는 함수형 인터페이스입니다.
    // 이 람다 제너릭스는 <Integer>이기에 Integer를 받습니다.
    // 해당 람다 표현식은 다음과 같은 코드를 축약한 형태입니다 :
    // public void printNumber(int number) {
    //    System.out.println(number);
    // }
    @SuppressWarnings({"Convert2MethodRef", "RedundantSuppression"})
    private static final Consumer<Integer> printer = (number) -> {
        System.out.println(number);
    };

    // BiFunction은 제너릭스에 포함된 타입을 두 개 받아 제너릭스에 포함된 타입을 반환하는 함수형 인터페이스입니다.
    // 이 람다 제너릭스는 <Integer, Integer, Integer>이기에 Integer를 두 개 받아 Integer를 반환합니다.
    // 해당 람다 표현식은 다음과 같은 코드를 축약한 형태입니다 :
    // public int adjustNumber(int number, int adjustment) {
    //    return number + adjustment;
    // }
    @SuppressWarnings({"Convert2MethodRef", "RedundantSuppression"})
    private static final BiFunction<Integer, Integer, Integer> adjuster = (number, adjustment) -> number + adjustment;


    public static void main(String[] args) {
        int first = numberSupplier.get();
        int second = numberSupplier.get();
        int example = exampleResult(first, second);
        int lambda = lambdaResult(first, second);
        if (example == lambda) {
            System.out.println("정답입니다!");
        } else {
            System.out.println("오답입니다!");
        }
    }

    // 이 메서드는 두 개의 정수를 받아, 두번째 값을 음수로 변환하고, 이를 출력한 다음 두 값을 더한 값을 반환합니다.
    private static int exampleResult(int base, int delta) {
        int negative = -delta;
        int adjusted = base + delta;
        System.out.println(negative);
        return adjusted;
    }

    // 이 메서드는 exampleResult와 동일한 동작을 위에 선언된 람다 표현식을 사용하여 수행해야 합니다.
    // 각 람다는 서로 다른 이름으로 값을 수용한다는것을 잊지 마세요.
    // Function / BiFunction은 apply를, Consumer는 accept를 사용합니다.
    private static int lambdaResult(int base, int delta) {

        throw new UnsupportedOperationException("이 코드를 지우고, 정답을 작성하세요.");
    }

}
