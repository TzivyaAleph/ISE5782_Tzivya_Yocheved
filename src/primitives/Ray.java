package primitives;

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

    // ***************** Administration  ******************** //
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Ray other = (Ray) obj;
        if (p0 == null) {
            if (other.p0 != null)
                return false;
        } else if (!p0.equals(other.p0))
            return false;
        if (p0 == null) {
            if (other.p0 != null)
                return false;
        } else if (!p0.equals(other.p0))
            return false;
        return true;
    }

    @Override
    public String toString() {
        super.toString();
        return "Ray{" + "p0=" + p0 + ", vector=" + vector + '}';
    }

}
