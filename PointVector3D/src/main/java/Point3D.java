public class Point3D {

    private double x;
    private double y;
    private double z;

    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point3D()
    {
        x = 0;
        y = 0;
        z = 0;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point3D)) return false;
        Point3D point3D = (Point3D) o;
        return Double.compare(point3D.getX(), getX()) == 0 && Double.compare(point3D.getY(), getY()) == 0
                && Double.compare(point3D.getZ(), getZ()) == 0;
    }

    /* @Override
     public int hashCode() {
         return Objects.hash(getX(), getY(), getZ());
     }
*/


    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void Print()
    {
        System.out.print("="+x+","+y+","+z);
    }




}
