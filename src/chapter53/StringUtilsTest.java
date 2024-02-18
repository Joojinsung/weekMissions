package chapter53;

public class StringUtilsTest {
    public static void main(String[] args) {
        String str = "HELLO";
        char target = 'O';


        boolean isEmpty = StringUtils.isEmpty(str);
        System.out.println(isEmpty);

        String str2 = StringUtils.reverse(str);
        System.out.println(str2);

        int countC = StringUtils.countChar(str, target);
        System.out.println(countC);

        boolean containChar = StringUtils.containsChar(str, target);
        System.out.println(containChar);

    }
}
