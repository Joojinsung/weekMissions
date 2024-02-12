package interfaceLear;

public abstract class FamilyMan implements FamilyRole {
    protected String name;
    protected int age;
    protected String job;

    @Override
    public void educateBaby(Baby baby) {
        String name = baby.getName();
        System.out.println(name + " 아기를 열심히 교육하고 있습니다.");
    }

    @Override
    public void takeCareWife(Wife wife) {
        String name = wife.getName();
        System.out.println(name + " 인 아내를 성심성의껏 케어합니다");
    }

    @Override
    public String getName() {
        return name;
    }


}
