package chapter51;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryMultiCatchTest {
    public static void main(String[] args) {
        try {
            FileInputStream fs = new FileInputStream("src/chapter51/text.txt");

            int i = 10;
            int data = 100 / i;

            String str = "Abc";
            System.out.println(str.toUpperCase());

            int index = 15;
            int[] intArr = new int[10];
            System.out.println(intArr[index]);


        } catch (FileNotFoundException e) {
            System.out.println("FileNotFound 에러");
            e.printStackTrace();
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("Arthimetic 에러 또는 NullPointerException");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("최종 Exceptio 필터");
            e.printStackTrace();
        }
//        catch (NullPointerException e) {
//            System.out.println("NullPointerException 에러");
//            e.printStackTrace();
//
//        }
        System.out.println("메인 메소드 종료");
    }
}
