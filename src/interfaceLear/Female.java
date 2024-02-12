package interfaceLear;

public class Female implements EmployeeRole, Wife {
    // 속성
    private String name;
    private int age;
    private String job;

    public Female(String name) {
        this.name = name;
    }

    @Override
    public void workTogether(EmployeeRole employeeRole) {
        String name = employeeRole.getName();
        System.out.println(name + " 인 직장동료와 업무를 하고 있습니다.");
    }

    @Override
    public void takeCareHusband(HusbandRole husbandRole) {
        String name = husbandRole.getName();
        System.out.println(name + " 인 남편을 케어합니다.");
    }

    @Override
    public String getName() {
        return this.name;
    }

    public static class interfaceTest {
        public static void main(String[] args) {
            // Male 3개 역할 / 남편, 아빠, 회사원

            //HusbandRole
            HusbandRole male = new Male("짱구아빠");
            Wife wife = new Female("짱구엄마");
            Baby baby = new Baby("신짱구");

            male.sayLoveEveryDay();
            male.takeCareWife(wife);

            //DaddyRole
            DaddyRole maleDaddy = (DaddyRole) male;
            maleDaddy.educateBaby(baby);
            maleDaddy.sayLoveEveryDay();


            //Employ
            EmployeeRole maleEmployee = (EmployeeRole) maleDaddy;
            EmployeeRole maleEmployeeTwo = new MaleTwo("철수");
            maleEmployee.workTogether(maleEmployeeTwo);


        }
    }
}
