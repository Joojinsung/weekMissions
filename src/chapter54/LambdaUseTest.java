package chapter54;

public class LambdaUseTest {
    public static void main(String[] args) {
        MultipleNum multipleNum = (num) -> num * 10;
        MultipleNum multipleNum2 = (num) -> num * 20;
//        printNum(multipleNum);
//        printNum(multipleNum2);
//
//        printNum((x) -> x * 100);

        GenericLambda<String> genericLambda1 = (str) -> str.toUpperCase();
        GenericLambda<Integer> genericLambda2 = (number) -> number * 2;
        GenericLambda<Boolean> genericLambda3 = (bool) -> bool & true;

        System.out.println(genericLambda1.calculate("Abc"));
        System.out.println(genericLambda2.calculate(100));
        System.out.println(genericLambda3.calculate(true));



    }

    public static void printNum(MultipleNum multipleNum) {
        int result = multipleNum.calculate(5);
        System.out.println(result);
    }

}
