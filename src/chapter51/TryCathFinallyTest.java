package chapter51;

public class TryCathFinallyTest {
    public static void main(String[] args) {
        System.out.println("메소드 시작");

        try{
            Integer myInt = 0;
            Integer data = 100 / myInt;

            System.out.println("data :" + data);


        }catch (ArithmeticException e) {
            System.out.println("0이 될 수 없습니다");
            e.printStackTrace();
        }finally {
            System.out.println("무조건 실행되는 finally 영역");

        }




        System.out.println("메소드 종료");
    }
}
