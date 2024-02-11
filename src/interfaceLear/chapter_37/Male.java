package interfaceLear.chapter_37;

public class Male extends FamilyMan implements  EmployeeRole, FamilyRole {
    //속성
    protected String name;
    protected int age;
    protected String job;

    @Override
    public void workTogether(EmployeeRole employeeRole) {
        String name = employeeRole.getName();
        System.out.println(name + " 인 직장동료와 업무를 하고 있습니다.");
    }


    public String getName() {
        return this.name;
    }

    public Male(String name) {
        this.name = name;
    }
}
