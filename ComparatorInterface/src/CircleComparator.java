import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {

    @Override
    public int compare(Circle circle1, Circle circle2) {
        if (circle1.radius<circle2.radius){
        return 1;
    }else if(circle1.radius>circle2.radius){
        return -1;}else{return 0;}
    }

}