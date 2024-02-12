package DayMission.mission_1;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        this.dimension = 5;
    }


    public double calculateDiagonal() {
        return Math.sqrt(Math.pow(this.width, 2)+Math.pow(this.height, 2));
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (this.width + this.height); //둘레
    }

    @Override
    public double calculateArea() {
        return this.width * this.height;
    }

    public double getWidth() {
        return width;
    }


    public double getHeight() {
        return height;
    }


}
