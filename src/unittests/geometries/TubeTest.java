package unittests.geometries;


import org.junit.jupiter.api.Test;
import primitives.Double3;
import primitives.Point;
import primitives.Ray;
import primitives.Vector;
import geometries.Tube;

import static org.junit.jupiter.api.Assertions.*;

class TubeTest {

    /**
     * Test method for {@link geometries.Tube#getNormal(primitives.Point)}.
     */
    @Test
    public void testGetNormal() {
        // ============ Equivalence Partitions Tests ==============
        // TC01: There is a simple single test here
        Tube tube = new Tube(new Ray(new Point(0, 0, 1), new Vector(0, -1, 0)), 1.0);

        Vector normal = tube.getNormal(new Point(0, 0.5, 2)).normalize();

        double dotProduct = normal.dotProduct(tube.getAxis().getDirection());
        assertEquals(0d, dotProduct, "normal is not orthogonal to the tube");

        boolean firstnormal = new Vector(0, 0, 1).equals(normal);
        boolean secondtnormal = new Vector(0, 0, -1).equals(normal);

        assertTrue(firstnormal || secondtnormal, "Bad normal to tube");

        assertEquals(new Vector(0, 0, 1), normal, "Bad normal to tube");
    }

    @Test
    void testGetNormal2() {
        // ============ Boundary Value Test ==============
        Tube tu = new Tube(
                new Ray(new Point(0, 0, 1), new Vector(0, 0, 1)),
                2);
        assertEquals(new Vector(1,1, 0).normalize(), tu.getNormal(new Point(0, 2, 1)));
    }
}