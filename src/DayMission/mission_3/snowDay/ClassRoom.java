package DayMission.mission_3.snowDay;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ClassRoom<T extends CollegeStudent> {
    private String className;
    private Map<String, T> studentMap;
    private List<String> studentNames;

    public ClassRoom(String className) {
        this.className = className;
        studentMap = new HashMap<>();
        studentNames = new ArrayList<>();
    }

    public void addStudent(T student) {
        studentMap.put(student.getStudentNumber(), student);
        studentNames.add(student.getName());
    }

    public T getStudentByStudentNumber(String getKey) {
        return studentMap.get(getKey);
    }

    public void printStudentNames() {
        StringBuilder sb = new StringBuilder("이 클래스룸 " + className + "에는 ");

        for (int i = 0; i < studentNames.size(); i++) {
            sb.append(studentNames.get(i));
            if (i != studentNames.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(" 학생들이 있습니다.");
        System.out.println(sb.toString());
    }

}
