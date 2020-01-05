public class Circle extends Shape {
    private double radius;
    public Circle(){
        this.radius = 1.0;
    }
    public Circle(double r){
        this.radius = r;
    }
    public Circle(double r,String color,boolean filled){
        super(color,filled);
        this.radius = r;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return 2 * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2*radius*Math.PI;
    }
@Override
    public String toString(){
    return "A Circle with radius="
            + getRadius()
            + ", which is a subclass of "
            + super.toString();
}
}
