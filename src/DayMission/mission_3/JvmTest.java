package DayMission.mission_3;

public class JvmTest {
    static final long MY_LONG = 5L;

    public static void main(String[] args){
//        // 1. JvmTest JVM 로드 진행 이후
//        JvmTest 클래스가 로드되면서 정적 변수 MY_LONG이 Method Area에 배치됩니다. 이때, Constant Pool에는 MY_LONG의 값인 5L이 저장됩니다.
//        또한, Customer 클래스도 함께 로드되면서, 정적 변수 serialNum이 Method Area에 저장됩니다.

        int myInt = 10;
        String name = "이순신";
        long myLong = MY_LONG;
        Customer customer = new Customer("장영실");
        int[] intArr = new int[3];


        // 2. 여러 로컬 변수 선언 후
//        int myInt = 10;: 이는 main 메소드의 지역 변수이므로 Stack 메모리에 저장됩니다.
//        String name = "이순신";: 여기서 name 은 Stack 메모리에 저장되며, 실제 문자열 "이순신"은 String Constant Pool에 저장됩니다.
//        long myLong = MY_LONG;: 이는 main 메소드의 지역 변수이므로 Stack 메모리에 저장됩니다. 여기서 MY_LONG은 Method Area의 JvmTest 클래스에 저장된 정적 변수로, 그 값은 Constant Pool에 있습니다.
//        Customer customer = new Customer("장영실");: 여기서 customer 객체는 Heap 메모리에 저장됩니다. customer 참조 변수는 Stack 메모리에 저장되며, 실제 Customer 객체는 Heap 메모리에 생성됩니다.
//        int[] intArr = new int[3];: intArr 참조 변수는 Stack 메모리에 저장되며, 실제 int 배열 객체는 Heap 메모리에 생성됩니다.

        makeCustomer(name);
        customer = null;

        // 4. makeCustomer 메소드 종료 및 null 선언 후
        //gc -> 참조 해제 heap 메모리에서 제거


        String str1 = "Hello World";
        String str2 = new String("Hello World");

        // 5. 각 String 변수 선언 후
        // String str1 = : "참조값 저장" stack 저장, 값은 String constant pool 저장
        // String str2 = : heap 메모리에 저장
        // str2 참조변수는 stack 에 저장, 내부적 문자열 "hello world"를 참조하는데
        // hello world 는 string contant pool 에 있기 떄문에 같은 문자열을 참조합니다.
    }

    static void makeCustomer(String name){
        String nameWithUppercase = name.toUpperCase();
        Customer customer = new Customer(nameWithUppercase);
        // 3. makeCustomer 메소드 내부 진행
        // 호출시 stack 메모리에 새로운 프레임 생성
        // nameWithUppercase -> stack 저장 값은 heap 메모리를 참조
        // new 생성시 customer stack 저장 결과는 heap 메모리 저장
    }



}
