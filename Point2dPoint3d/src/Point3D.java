public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(){
        setXY(getX(),getY());
        this.z = z;
    }
    public float[] getXYZ(){
        float[] array = {getX(), getY(), getZ()};
        return array;
    }
    @Override
    public String toString(){
        return "(" + getX() + ", " + getY() + ", " + getZ() + ")";
    }

    public static void main(String[] args) {
        Point3D p3d = new Point3D(3, 2, 5);
        System.out.println(p3d);
        Point2D p2d = new Point2D(2, 4);
        System.out.println(p2d);
    }
}
