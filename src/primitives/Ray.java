package primitives;
import java.util.Objects;

public class Ray
{
    protected final Point p0;
    protected final Vector vector;

    public Point getP0() {
        return p0;
    }

    public Vector getVector() {
        return vector;
    }

    private Ray(Point p1, Vector v)
    {
        p0=new Point(p1.xyz);
        vector=new Vector(v.xyz);
        vector.normalize();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    // ***************** Administration  ******************** //
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ray ray = (Ray) o;
        return Objects.equals(p0, ray.p0) && Objects.equals(vector, ray.vector);
    }

    @Override
    public String toString() {
        super.toString();
        return "Ray{" + "p0=" + p0 + ", vector=" + vector + '}';
    }

}
