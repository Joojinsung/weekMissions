package chapter46;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListGetPerformanceTest {
    public static void main(String[] args) {

        final long SIZE = 100000;


        // List ArrayList 구현
        List<Integer> integerList1 = new ArrayList<>();
        for (int i = 0; i < SIZE; i++) {
            integerList1.add(i);
        }


        // List LinkedList 구현
        List<Integer> integerList2 = new LinkedList<>();
        for (int i = 0; i < SIZE; i++) {
            integerList2.add(i);
        }


        long startTime;
        long endTime;

        startTime = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            integerList1.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList get 요청시간 = " + (endTime - startTime) + " ms");


        long startTime1;
        long endTime1;

        startTime1 = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            integerList2.get(i);
        }
        endTime1 = System.currentTimeMillis();

        System.out.println("LinkedList get 요청시간 = " + (endTime1 - startTime1) + " ms");

    }
}
