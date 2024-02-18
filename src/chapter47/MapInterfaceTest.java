package chapter47;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceTest {
    public static void main(String[] args) {
        // Map 정의
        Map<String, Integer> fruitMap = new HashMap<>();

        //Map 에 데이터 삽입
        fruitMap.put("Orange", 5);
        fruitMap.put("Apple", 10);
        fruitMap.put("Banana", 3);
        fruitMap.put("Kiwi", 20);

        System.out.println(fruitMap);


        //Get(Key)
        Integer appleCount = fruitMap.get("Apple");
        Integer bananaCount = fruitMap.get("Banana");
        System.out.println("appcount " + appleCount);
        System.out.println("banana " + bananaCount);

        //conatains(Key)
        Boolean isApple = fruitMap.containsKey("Apple");
        Boolean isMango = fruitMap.containsKey("Mango");
        System.out.println(isApple);
        System.out.println(isMango);

        //remove(Key)
        fruitMap.remove("Apple");
        System.out.println(fruitMap);

        //size
        System.out.println(fruitMap.size());

        //KeySet();
        System.out.println(fruitMap.keySet());




    }
}
