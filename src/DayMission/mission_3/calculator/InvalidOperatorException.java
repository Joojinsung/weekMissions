package DayMission.mission_3.calculator;

public class InvalidOperatorException extends Exception {
    //유효하지 않을떄

    public InvalidOperatorException() {
        super("유효하지 않는 연산자!");
    }

}
