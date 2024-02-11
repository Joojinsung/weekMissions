package interfaceLear;

public interface Flyable {
    //속성
    long atmosphereLimit = 476;

   default void fly() {
       System.out.println("현재 사물이 날고 있습니다");
   }

   static void printLanding() {
       System.out.println("Flable의 static 메소드");
   }

}

