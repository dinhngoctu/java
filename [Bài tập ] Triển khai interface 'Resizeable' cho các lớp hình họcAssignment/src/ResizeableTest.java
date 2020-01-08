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
        double percen = Math.random() * 99 + 1;
        rectangle.resize(percen);
        System.out.println(rectangle + " p: " + percen);
        percen = Math.random() * 99 + 1;
        circle.resize(percen);
        System.out.println(circle + " p: " + percen);
        percen = Math.random() * 99 + 1;
        square.resize(percen);
        System.out.println(square + " p: " + percen);
    }
}
