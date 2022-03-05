package primitives;
import java.util.Objects;

public class Vector extends Point
{
    /********** Constructors ***********/
    public Vector(double x, double y, double z)
    {
        super(x,y,z);
        if(xyz.equals(Double3.ZERO)) throw  new IllegalArgumentException("Cant vector zero");
    }

    protected Vector(Double3 xyz) {
        super(xyz);
        if(xyz.equals(Double3.ZERO)) throw  new IllegalArgumentException("Cant vector zero");
    }

    /************** Operations ***************/
    public Vector add(Vector v)
    {
      return (Vector) super.add(v);
    }

    public Vector substract(Vector v)
    {
         return super.subtract(v);
    }

    public Vector scale(double scalingFactor)
    {
        double helpX=scalingFactor*this.xyz.d1;
        double helpY=scalingFactor*this.xyz.d2;
        double helpZ=scalingFactor*this.xyz.d3;
        return new Vector(helpX,helpY,helpZ);
    }

    /**
     *cross product between two vectors (vectorial product)969
     * @param v3
     * @return the vector result from the cross product( Right-hand rule)
     * @link: https://www.mathsisfun.com/algebra/vectors-cross-product.html
     */
    public  Vector crossProduct(Vector v3)
    {
        double ax = xyz.d1;
        double ay = xyz.d2;
        double az = xyz.d3;
        double bx = v3.xyz.d1;
        double by = v3.xyz.d2;
        double bz = v3.xyz.d3;

        double cx = ay * bz - az * by;
        double  cy = az * bx - ax * bz;
        double cz = ax * by - ay * bx;
        return  new Vector(cx, cy, cz);
    }

    /**
     *dot product between two vectors (scalar product)
     * @param vector
     * @return
     * "link https://www.mathsisfun.com/algebra/vectors-dot-product.html
     */
    public double dotProduct(Vector vector)
    {
        double dotX= this.xyz.d1 * vector.xyz.d1;
        double dotY= this.xyz.d2 * vector.xyz.d2;
        double dotZ= this.xyz.d3 * vector.xyz.d3;
        return dotX+dotY+dotZ;


    }

    /**
     *
     * @return
     */
    public  double lengthSquared()
    {
        return xyz.d1 * xyz.d1 +
                xyz.d2 * xyz.d2 +
                xyz.d3 * xyz.d3;
    }

    public double length()
    {
        return Math.sqrt(lengthSquared());
    }

        /**
         *normalize the vector
         * @return
         */
    public Vector normalize()
    {
        double len = length();
        if(len == 0)
            throw new ArithmeticException("Divide by zero!");
        return new Vector(xyz.reduce((len)));
    }

    @Override
    public boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Vector{" +
                "xyz=" + xyz +
                '}';
    }

}
