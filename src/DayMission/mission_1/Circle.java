package DayMission.mission_1;

public class Circle extends Shape {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
        this.dimension = 2;
    }

    public double getRadius() {
        return radius;
    }


    public double calculateDiameter() {
        return Math.PI * Math.pow(radius, 2); //원 면적
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius; //원 둘레
    }

    public double calculateArea() {
        return 2 * radius; //원의 지름
    }

}
