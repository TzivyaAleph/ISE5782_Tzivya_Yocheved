package primitives;

import java.util.Objects;
import java.util.List;

public class Ray
{
    final Point p0;
    final Vector dir;

    @Override
    public String toString() {
        return "Ray{" +
                "p0=" + p0 +
                ", dir=" + dir +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ray ray = (Ray) o;
        return Objects.equals(p0, ray.p0) && Objects.equals(dir, ray.dir);
    }

    @Override
    public int hashCode() {
        return Objects.hash(p0, dir);
    }

    public Point getP0() {
        return p0;
    }

    public Vector getDirection() {
        return dir;
    }

    public Ray(Point p0, Vector dir) {
        this.p0 = p0;
        this.dir = dir.normalize();
    }

    public Point findClosestPoint(List <Point> points) {

        double minDistance = Double.MAX_VALUE;
        double d;
        Point closePoint = null;

        if(points==null){
            return null;
        }

        for (Point p : points) {

            d = p.distance(p0);
            //check if the distance of p is smaller then minDistance
            if (d < minDistance) {
                minDistance = d;
                closePoint = p;
            }
        }
        return closePoint;
    }

    public Vector getDir() {
        return dir;
    }
}

