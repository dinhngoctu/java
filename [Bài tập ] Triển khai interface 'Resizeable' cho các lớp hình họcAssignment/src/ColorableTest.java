public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        shapes[0] = circle;
        shapes[1] = rectangle;
        shapes[2] = square;
        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("area: "+shape.getArea());
            if(shape instanceof Square){
                ((Square) shape).howToColor();
            }
        }
    }
}
