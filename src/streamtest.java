import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamtest {
    public static void main(String[] args) {

        List<String> e = Arrays.asList("IntelliJ", "Eclipse", "VSCode", "IntelliJ", "NetBeans");

        // 값.stream()
        //
        //
        //
        //
        //
        //


        String result = e.stream()
                .filter(str -> str.equals("IntelliJ"))
                .map(String::toUpperCase)
                .collect(Collectors.joining(" "));


        System.out.println(result);


    }
}
