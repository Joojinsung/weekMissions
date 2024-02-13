package chapter45;

public class Point<T extends Number, V extends Number> {
    private T x;
    private V y;

    public Point(T x, V y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public Double calculateDistance() {
        Double num1 = ((Number) this.x).doubleValue();
        Double num2 = ((Number) this.y).doubleValue();

        return Math.sqrt(Math.pow(num1, 2) + Math.pow(num2, 2));




    }


}
