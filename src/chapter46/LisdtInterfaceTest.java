package chapter46;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LisdtInterfaceTest {
    public static void main(String[] args) {
        // List 정의
        List<String> fruitList = new ArrayList<>();
        List<String> fruitList2 = new ArrayList<>();

        //add
        fruitList.add("orange");
        fruitList.add("Apple");
        fruitList.add("kiwi");

        System.out.println(fruitList); // [orange, Apple, kiwi]

        //add(index, element)
        fruitList.add(1, "Mango");
        System.out.println(fruitList); //[orange, Mango, Apple, kiwi]

        //remove(index)
        fruitList.remove(1);
        System.out.println(fruitList); //[orange, Apple, kiwi]

        //get(index)
        String myFruit = fruitList.get(1);
        System.out.println(myFruit);// Apple

        //set(Index, Element)
        fruitList.set(1, "banana");
        System.out.println(fruitList); //[orange, banana, kiwi]

        //size
        System.out.println(fruitList.size()); // 3


        // is Empty()
        System.out.println(fruitList.isEmpty());
        System.out.println(fruitList2.isEmpty());

        // Contains : 리스트에 해당 원소가 있는지 // true, false 반환
        System.out.println(fruitList.contains("kiwi"));
        System.out.println(fruitList.contains("mango"));


        //indexOf, clear
        String myFruit2 = "strawberry";
        String myFruit3 = "kiwi";
        System.out.println(fruitList.indexOf(myFruit2)); //-1
        System.out.println(fruitList.indexOf(myFruit3)); //2

        fruitList.clear();
        System.out.println(fruitList); // []


    }
}
