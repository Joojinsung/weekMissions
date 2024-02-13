package chapter45;

public class GeneralPrint<T> {
    private T meterial;

    public void printMyInfO() {
        System.out.println(meterial + " 출력");
    }

    public T getMeterial() {
        return meterial;
    }

    public void setMeterial(T meterial) {
        this.meterial = meterial;
    }


}
