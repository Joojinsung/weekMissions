package DayMission.mission_1;

public abstract class Shape {
    protected String color = "초기값";
    protected int dimension;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDimension() {
        return dimension;
    }

    public abstract double calculatePerimeter();

    public abstract double calculateArea();
}
