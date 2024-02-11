package interfaceLear.chapter_37;

public class interfaceTest {
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
