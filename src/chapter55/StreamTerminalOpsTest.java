package chapter55;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTerminalOpsTest {
    public static void main(String[] args) {


        List<String> fruitsList = new ArrayList<>();
        fruitsList.add("Appld");
        fruitsList.add("Appld");
        fruitsList.add("Appld");
        fruitsList.add("Banana");
        fruitsList.add("Banana");
        fruitsList.add("Banana");
        fruitsList.add("Orange");
        fruitsList.add("Mango");
        fruitsList.add("Mango");
        fruitsList.add("Mango");
        fruitsList.add("Grapes");


        //1. forEach()
//        fruitsList.stream().forEach((fruit) -> System.out.println(fruit));

        //collect() : 다른 또는 같은 컬렉션 반환
        //Set() 중복제거
        Set<String> fruitSet = fruitsList.stream().collect(Collectors.toSet());
        System.out.println(fruitSet);
        Optional<String> fruitOptional = fruitsList.stream().findFirst();
        System.out.println(fruitOptional.orElseGet(() -> "기본과일"));


        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        integerList.add(7);
        integerList.add(8);
        integerList.add(9);
        integerList.add(10);

        //sum, average
        System.out.println("sum : " + integerList.stream().mapToInt((i) -> i).sum());
        System.out.println("average : " + integerList.stream().mapToInt((i) -> i).average());

        //count, max, min
        System.out.println("count : " + integerList.stream().count());
        System.out.println("max :" + integerList.stream().mapToInt((i) -> i).max());
        System.out.println("min :" + integerList.stream().mapToInt((i) -> i).min());

        //reduce
        int result = integerList.stream().reduce(0, (int1, int2) -> int1 + int2);

        System.out.println(result);

    }
}
