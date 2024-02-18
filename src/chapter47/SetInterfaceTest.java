package chapter47;

import java.util.HashSet;
import java.util.Set;

public class SetInterfaceTest {
    public static void main(String[] args) {
        Set<String> fruitSet = new HashSet<>();

        //add
        fruitSet.add("Orange");
        fruitSet.add("Apple");
        fruitSet.add("Mango");
        fruitSet.add("Grape");
        System.out.println(fruitSet);

        // add -> 중복 저장 실험
        fruitSet.add("Apple");
        fruitSet.add("Mango");
        fruitSet.add("Melon");
        System.out.println(fruitSet);


        //remove(set)
        fruitSet.remove("Apple");
        System.out.println(fruitSet);

        //container
        System.out.println(fruitSet.contains("Apple"));
        System.out.println(fruitSet.contains("Mango"));

        //size, isEmpty, clear
        System.out.println(fruitSet.size());
        System.out.println(fruitSet.isEmpty());
        fruitSet.clear();
        System.out.println(fruitSet);






    }

}
