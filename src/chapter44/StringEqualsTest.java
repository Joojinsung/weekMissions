package chapter44;

public class StringEqualsTest {
    public static void main(String[] args) {
//        String str1 = "cat";
//        String str2 = "cat";
//
//        System.out.println(str1 == str2); // 메모리 비교
//        System.out.println(str1.equals(str2)); // 내용 비교
//
//
//        String str3 = new String("cat");
//        String str4 = new String("cat");
//
//        System.out.println(str3 == str4); // 인스턴스 생성 메모리 비교
//        System.out.println(str3.equals(str4)); //값을 비교하기 때문에  -> equals 습관화!
//
//
//        //str1, str3 동등비교
//        System.out.println(str3.equals(str1)); //값
//        System.out.println(str3 == str1);//메모리
        String newStr = new String();

        String str1 = new String("ABC");

        String str2 = str1 + "a";
        System.out.println(str2);

        newStr = str1 + "a";
        System.out.println(newStr);

        newStr = str1;



    }
}
