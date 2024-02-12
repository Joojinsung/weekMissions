package interfaceLear;

public interface FamilyRole extends DaddyRole, HusbandRole{


    @Override
    default void sayLoveEveryDay() {
        DaddyRole.super.sayLoveEveryDay();
        HusbandRole.super.sayLoveEveryDay();
    }
}
