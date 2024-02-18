package chapter54;

public class LamdaTest1 {
    public static void main(String[] args) {
        MultipleNum multipleNum1 = (x) -> x * 1;
        MultipleNum multipleNum2 = (i) -> i * 2;
        MultipleNum multipleNum3 = (x) -> {
            return x * 3;
        };
        MultipleNum multipleNum4 = (int i) -> {
            return i * 4;
        };


        System.out.println(multipleNum1.calculate(5));
        System.out.println(multipleNum2.calculate(5));
        System.out.println(multipleNum3.calculate(5));
        System.out.println(multipleNum4.calculate(5));

        StringNum stringNum1 = (x, y) -> System.out.println(x);
        StringNum stringNum2 = (x, y) -> {
            for (int i = 0; i < y; i++) {
                System.out.print(x);

            }
            System.out.println();
        };
        StringNum stringNum3 = (String x, int y) -> {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < y; i++) {
                sb.append(x);
            }
            System.out.print(sb.toString());
        };
     stringNum1.printString("Hello1", 1);
     stringNum2.printString("Hello2", 2);
     stringNum3.printString("Hello3", 3);

    }
}
