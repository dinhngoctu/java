public class ResizeableTest {
    public static void main(String[] args) {
        System.out.println("Truoc khi thay doi.");
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        Square square = new Square();
        System.out.println(square);
        Circle circle = new Circle();
        System.out.println(circle);
        System.out.println();
        System.out.println("Sau khi thay doi.");
        double p = Math.random() * 99 + 1;
        rectangle.resize(p);
        System.out.println(rectangle + " p: " + p);
        p = Math.random() * 99 + 1;
        circle.resize(p);
        System.out.println(circle + " p: " + p);
        p = Math.random() * 99 + 1;
        square.resize(p);
        System.out.println(square + " p: " + p);
    }
}
