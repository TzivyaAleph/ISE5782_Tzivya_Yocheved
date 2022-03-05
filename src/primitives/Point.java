package primitives;
import java.util.Objects;

public class Point<other>
{
    protected final Double3 xyz;

    /**
     * secondary constructor for Point 3D
     *
     * @param x
     * @param y
     * @param z
     */
    public Point(double x, double y, double z)
    {
        xyz=new Double3(x,y,z);
    }

    /**
     * primary constructor for point
     * @param xyz Double3 value gor x, y, z axis
     */
    protected Point(Double3 xyz)
    {
        this.xyz=xyz;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Objects.equals(xyz, point.xyz);
    }

        @Override
    public String toString() {
        return "Point{" +
                "xyz=" + xyz +
                '}';
    }

    public Point add(Vector vector)
    {
        return new Point(xyz.add(vector.xyz));
    }

    public Vector subtract(Point p1)
    {
        return new Vector(xyz.subtract(p1.xyz));
    }

    /**
     *
     * @param p1
     * @return d = ((x2 = x1) * (x2 = x1) + (y2 - y1) * (y2 - y1)  + (z2 = z1 ) * (z2 = z1 ))
     */
    public double distanceSquared(Point p1)
    {
        double x=this.xyz.subtract(p1.xyz).d1 * this.xyz.subtract(p1.xyz).d1;
        double y=this.xyz.subtract(p1.xyz).d2 * this.xyz.subtract(p1.xyz).d2;
        double z=this.xyz.subtract(p1.xyz).d3 * this.xyz.subtract(p1.xyz).d3;
        return x+y+z;
    }

    /*
     * @param other
     * @return d=Sqrt(lengthSquare)
     * @link https://www.engineeringtoolbox.com/distance-relationship-between-two-points-d_1854.html
        */
    public double distance(Point other)
    {
        return Math.sqrt(distanceSquared(other));
    }

}
