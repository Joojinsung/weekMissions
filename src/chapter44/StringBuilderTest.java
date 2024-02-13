package chapter44;

public class StringBuilderTest {
    public static void main(String[] args) {
        // +=
        String str = "";
        long statTime = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {


            str += "Cat";

        }
        long endTime = System.currentTimeMillis();
        System.out.println("+= 연산 걸린 시간 " + (endTime - statTime) + " ms");


        System.out.println("----------------------------------------------");


        StringBuilder sb = new StringBuilder();
        long statTime2 = System.currentTimeMillis();
        for(int i = 0; i < 50000; i++) {
            sb.append("Cat");

        }

        String output = sb.toString();

        long endTime2 = System.currentTimeMillis();
        System.out.println("StringBuilder 연산 걸린 시간 " + (endTime2 - statTime2) + " ms");

    }





}
