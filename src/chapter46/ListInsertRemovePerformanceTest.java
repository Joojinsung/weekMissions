package chapter46;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListInsertRemovePerformanceTest {
    public static void main(String[] args) {

        final long SIZE = 1000000;
        long startTime = System.currentTimeMillis();
        long endTime = System.currentTimeMillis();
        // List ArrayList 구현

        startTime = System.currentTimeMillis();
        List<Integer> integerList1 = new ArrayList<>();
        for (int i = 0; i < SIZE; i++) {
            integerList1.add(i);
            if (i % 5 == 0) {
                integerList1.remove(0);
            }
        }
        System.currentTimeMillis();
        System.out.println("Array  " + (endTime - startTime));

        long statime1;
        long endTime1;

        statime1 = System.currentTimeMillis();
        // List LinkedList 구현
        List<Integer> integerList2 = new LinkedList<>();
        for (int i = 0; i < SIZE; i++) {
            integerList2.add(i);
            if (i % 5 == 0) {
                integerList2.remove(0);
            }
        }
        endTime1 = System.currentTimeMillis();
        System.out.println("LinkedList  " + (endTime1 - statime1));
//        long startTime;
//        long endTime;
//
//        startTime = System.currentTimeMillis();
//        for (int i = 0; i < SIZE; i++) {
//            integerList1.get(i);
//            if (i % 5 == 0) {
//                integerList1.remove(0);
//            }
//        }
//        endTime = System.currentTimeMillis();
//        System.out.println("ArrayList get 요청시간 = " + (endTime - startTime) + " ms");
//
//
//        long startTime1;
//        long endTime1;
//
//        startTime1 = System.currentTimeMillis();
//        for (int i = 0; i < SIZE; i++) {
//            integerList2.get(i);
//            if (i % 5 == 0) {
//                integerList2.remove(0);
//            }
//        }
//        endTime1 = System.currentTimeMillis();
//
//        System.out.println("LinkedList get 요청시간 = " + (endTime1 - startTime1) + " ms");
    }
}
