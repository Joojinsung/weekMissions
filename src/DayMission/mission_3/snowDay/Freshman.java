package DayMission.mission_3.snowDay;

//package assignments.week2.assignment2.base;

class Freshman extends YoungGroupCollegeStudent {


    public Freshman(String studentNumber, String name, double gpa) {
        super(studentNumber, name, gpa);
    }

    @Override
    public String toString() {
        return "Freshman{" + "studentNumber='" + studentNumber + '\'' + ", name='" + name + '\'' + ", gpa=" + gpa + '}';
    }
}