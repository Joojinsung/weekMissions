package chapter55;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest1 {
    public static void main(String[] args) {
        //Stream.of , Arrays.Stream, Collection(=List) -> Stream



        Stream<String> fruits = Stream.of("Apple", "Banana", "Orange");
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //Array.Stream
        Stream<String> fruits2 = Arrays.stream(new String[]{"Apple", "Banana", "Orange"});

        Stream<Integer> integerStream2 = Arrays.stream(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});

        //Collection(=List) -> Stream
        List<String> fruitsList = new ArrayList<>();
        fruitsList.add("Appld");
        fruitsList.add("Banana");
        fruitsList.add("Orange");
        fruitsList.add("Mango");
        fruitsList.add("Grapes");
        Stream<String> fruit3 = fruitsList.stream();

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
        Stream<Integer> integerStream3 = integerList.stream();


        //stream 가지고 for-loop 사용
        for (String fruit : fruitsList) {
            System.out.println(fruit.toUpperCase());
        }
        System.out.println("---------------------------");
        //stream 으로 출력
        fruit3.forEach((fruit) -> System.out.println(fruit.toUpperCase()));
        System.out.println("---------------------------");
        for (Integer i : integerList) {
            if (i % 2 == 0) {
                System.out.print(i);
            }
        }
        System.out.println();
        integerStream3.filter((i) -> i % 2 == 0)
                .filter((i) -> i > 4)
                .forEach(System.out::print);


    }
}
