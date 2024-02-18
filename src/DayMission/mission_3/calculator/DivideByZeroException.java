package DayMission.mission_3.calculator;

public class DivideByZeroException extends Exception {
    //0 나누기 에러
    public DivideByZeroException() {
        super("Attempted to divide bty zero!");
    }

}
