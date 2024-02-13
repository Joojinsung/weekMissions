package chapter45;

public class PrintSituation {
    public static void main(String[] args) {
        GeneralPrint<String> print = new GeneralPrint<String>();
        print.setMeterial("설계도");

        String meterial = print.getMeterial();
        print.printMyInfO();


        GeneralPrint<Integer> print2 = new GeneralPrint<Integer>();
        print2.setMeterial(1235);

        Integer meterial2 = print2.getMeterial();
        print.printMyInfO();


        GeneralPrint<Boolean> print3 = new GeneralPrint<Boolean>();
        print3.setMeterial(true);

        Boolean booleanMaterial = print3.getMeterial();
        print3.printMyInfO();




    }

}
