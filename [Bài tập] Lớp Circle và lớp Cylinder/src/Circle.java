public class Circle {
    private double radius;
    private String color;
    public Circle() {
    }
    public Circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", area=" + getArea() +
                '}';
    }
}
