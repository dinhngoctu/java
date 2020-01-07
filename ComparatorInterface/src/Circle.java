import javafx.scene.shape.Shape;

public class Circle extends Shape {
    double radius;
    boolean fill;
    String color;
    public Circle(){
    }
    public Circle(double r){
        this.radius=r;
    }
    public Circle(double r,String color, boolean fill){
        this(r);
        this.color = color;
        this.fill = fill;
    }

    @Override
    public String toString() {
        return "Radius = "+radius;
    }
}
