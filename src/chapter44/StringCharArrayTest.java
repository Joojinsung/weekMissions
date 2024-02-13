package chapter44;

public class StringCharArrayTest {
    public static void main(String[] args) {
        // CharArr -> String
        char[] chars = {'A', 'B', 'C'};

        //String 변환
        String str1 = new String(chars);
        String str2 = String.valueOf(chars);

        System.out.println(str1);
        System.out.println(str2);

        // Str - > Chararry
        char[] cars2 = str1.toCharArray();
        for (char c : cars2) {
            System.out.println(c);
        }
        System.out.println("-------------------------");
        System.out.println(str1.charAt(0));
        System.out.println(str1.charAt(1));
        System.out.println(str1.charAt(2));

    }
}
