package chapter51;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchFinallyCloseTerst {
    public static void main(String[] args) {
        FileInputStream fs = null;
        System.out.println("메인 메소드 실행");
        try {

            fs = new FileInputStream("src/chapter51/text.txt");

            int i;
            while ((i = fs.read()) != -1) {
                System.out.write(i);
            }
        } catch (FileNotFoundException e) {
            System.out.println("FIle을 찾을 수 없습니다");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("입출력 과정 문제발생");
            e.printStackTrace();
        }


    }
}
