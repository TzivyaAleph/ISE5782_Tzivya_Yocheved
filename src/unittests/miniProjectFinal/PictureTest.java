package unittests.miniProjectFinal;

import geometries.Geometry;
import geometries.*;
import lighting.AmbientLight;
import lighting.*;
import org.junit.jupiter.api.Test;
import primitives.*;
import renderer.*;
import scene.Scene;
import java.awt.color.*;

import static java.awt.Color.*;

public class PictureTest {
    Scene scene = new Scene("New Picture");
    @Test
    public void BonusImage() {
        Camera camera = new Camera(new Point(0, 0, 1000), new Vector(0, 0, -1), new Vector(0, 1, 0))
                .setVPSize(200, 200).setVPDistance(1000);

        scene.setAmbientLight(new AmbientLight(new Color(BLACK), new Double3(0.3)));

        scene.geometries.add(
                new Plane(new Point(-150, -150, -100), new Point(-100, 100, -100), new Point(75, 75, -100))
                        .setMaterial(new Material().setKd(0.5).setKs(0.5).setShininess(20)).setEmission(new Color(blue)),

               /** new Triangle(new Point(-100, -100, 42), new Point(-90, -60, 42), new Point(-80, -100, 42))
                        .setMaterial(new Material().setKd(0.5).setKs(0.5).setShininess(60).setKT(0.3)).setEmission(new Color(GREEN)), //
                new Triangle(new Point(-80, -100, 42), new Point(-70, -60, 42), new Point(-60, -100, 42)) //
                        .setMaterial(new Material().setKd(0.5).setKs(0.5).setShininess(60).setKT(0.25)).setEmission(new Color(GREEN)),//
                new Triangle(new Point(-60, -100, 42), new Point(-45, -60, 42), new Point(-30, -100, 42)) //
                        .setMaterial(new Material().setKd(0.5).setKs(0.5).setShininess(60).setKT(0.3)).setEmission(new Color(GREEN)),
                new Triangle(new Point(-30, -100, 42), new Point(-18, -60, 42), new Point(-6, -100, 42)) //
                        .setMaterial(new Material().setKd(0.5).setKs(0.5).setShininess(60).setKT(0.25)).setEmission(new Color(GREEN)),
                new Triangle(new Point(-6, -100, 42), new Point(10, -60, 42), new Point(26, -100, 42)) //
                        .setMaterial(new Material().setKd(0.5).setKs(0.5).setShininess(60).setKT(0.25)).setEmission(new Color(GREEN)),
                new Triangle(new Point(26, -100, 42), new Point(36, -60, 42), new Point(46, -100, 42)) //
                        .setMaterial(new Material().setKd(0.5).setKs(0.5).setShininess(60).setKT(0.2)).setEmission(new Color(GREEN)),
                new Triangle(new Point(46, -100, 42), new Point(60, -60, 42), new Point(74, -100, 42)) //
                        .setMaterial(new Material().setKd(0.5).setKs(0.5).setShininess(60).setKT(0.15)).setEmission(new Color(GREEN)),
                new Triangle(new Point(74, -100, 42), new Point(87, -60, 42), new Point(100, -100, 42)) //
                        .setMaterial(new Material().setKd(0.5).setKs(0.5).setShininess(60).setKT(0.2)).setEmission(new Color(GREEN)),**/
                //the top head sphere of the  snow man
                new Sphere(new Point(30, 20, 5), 15) //
                        .setEmission(new Color(lightGray)) //
                        .setMaterial(new Material().setKd(0.8).setKs(0.8).setShininess(50).setKT(0.0001)),
                //the middle part of the snow man
                new Sphere(new Point(30, -17, 5), 25) //
                        .setEmission(new Color(lightGray)) //
                        .setMaterial(new Material().setKd(0.8).setKs(0.8).setShininess(50).setKT(0.00001)),
                //the bottom part of the snow man
                new Sphere(new Point(30, -70, 5), 35) //
                        .setEmission(new Color(lightGray)) //
                        .setMaterial(new Material().setKd(0.8).setKs(0.8).setShininess(50).setKT(0.00001)),
                //for the cloud
                new Sphere(new Point(-20, 70, 5), 5) //
                        .setEmission(new Color(white)) //
                        .setMaterial(new Material().setKd(0.8).setKs(0.8).setShininess(50).setKT(0.00001)),
                new Sphere(new Point(-17, 65, 5), 5) //
                        .setEmission(new Color(white)) //
                        .setMaterial(new Material().setKd(0.8).setKs(0.8).setShininess(50).setKT(0.00001)),
                new Sphere(new Point(-22, 65, 5), 5) //
                        .setEmission(new Color(white)) //
                        .setMaterial(new Material().setKd(0.8).setKs(0.8).setShininess(50).setKT(0.00001)),
                //for the cloud
                new Sphere(new Point(-15, 75, 5), 5) //
                        .setEmission(new Color(white)) //
                        .setMaterial(new Material().setKd(0.8).setKs(0.8).setShininess(50).setKT(0.00001)),
                new Sphere(new Point(-12, 70, 5), 5) //
                        .setEmission(new Color(white)) //
                        .setMaterial(new Material().setKd(0.8).setKs(0.8).setShininess(50).setKT(0.00001)),
                new Sphere(new Point(-17, 70, 5), 5) //
                        .setEmission(new Color(white)) //
                        .setMaterial(new Material().setKd(0.8).setKs(0.8).setShininess(50).setKT(0.00001)),
                //for the cloud
                new Sphere(new Point(-5, 75, 5), 5) //
                        .setEmission(new Color(white)) //
                        .setMaterial(new Material().setKd(0.8).setKs(0.8).setShininess(50).setKT(0.00001)),
                new Sphere(new Point(0, 70, 5), 5) //
                        .setEmission(new Color(white)) //
                        .setMaterial(new Material().setKd(0.8).setKs(0.8).setShininess(50).setKT(0.00001)),
                new Sphere(new Point(-10, 70, 5), 5) //
                        .setEmission(new Color(white)) //
                        .setMaterial(new Material().setKd(0.8).setKs(0.8).setShininess(50).setKT(0.00001)),
                //for the cloud
                new Sphere(new Point(-5, 70, 5), 5) //
                        .setEmission(new Color(white)) //
                        .setMaterial(new Material().setKd(0.8).setKs(0.8).setShininess(50).setKT(0.00001)),
                new Sphere(new Point(0, 65, 5), 5) //
                        .setEmission(new Color(white)) //
                        .setMaterial(new Material().setKd(0.8).setKs(0.8).setShininess(50).setKT(0.00001)),
                new Sphere(new Point(-10, 65, 5), 5) //
                        .setEmission(new Color(white)) //
                        .setMaterial(new Material().setKd(0.8).setKs(0.8).setShininess(50).setKT(0.00001)),
                //for the cloud
                new Sphere(new Point(-30, 70, 5), 5) //
                        .setEmission(new Color(white)) //
                        .setMaterial(new Material().setKd(0.8).setKs(0.8).setShininess(50).setKT(0.00001)),
                new Sphere(new Point(-27, 65, 5), 5) //
                        .setEmission(new Color(white)) //
                        .setMaterial(new Material().setKd(0.8).setKs(0.8).setShininess(50).setKT(0.00001)),
                new Sphere(new Point(-32, 65, 5), 5) //
                        .setEmission(new Color(white)) //
                        .setMaterial(new Material().setKd(0.8).setKs(0.8).setShininess(50).setKT(0.00001)),
                //for the cloud
                new Sphere(new Point(-30, 75, 5), 5) //
                        .setEmission(new Color(white)) //
                        .setMaterial(new Material().setKd(0.8).setKs(0.8).setShininess(50).setKT(0.00001)),
                new Sphere(new Point(-27, 70, 5), 5) //
                        .setEmission(new Color(white)) //
                        .setMaterial(new Material().setKd(0.8).setKs(0.8).setShininess(50).setKT(0.00001)),
                new Sphere(new Point(-32, 70, 5), 5) //
                        .setEmission(new Color(white)) //
                        .setMaterial(new Material().setKd(0.8).setKs(0.8).setShininess(50).setKT(0.00001)),
                //for the cloud
                new Sphere(new Point(-40, 70, 5), 5) //
                        .setEmission(new Color(white)) //
                        .setMaterial(new Material().setKd(0.8).setKs(0.8).setShininess(50).setKT(0.00001)),
                new Sphere(new Point(-37, 65, 5), 5) //
                        .setEmission(new Color(white)) //
                        .setMaterial(new Material().setKd(0.8).setKs(0.8).setShininess(50).setKT(0.00001)),
                new Sphere(new Point(-42, 65, 5), 5) //
                        .setEmission(new Color(white)) //
                        .setMaterial(new Material().setKd(0.8).setKs(0.8).setShininess(50).setKT(0.00001)),
                //for the cloud
                new Sphere(new Point(-40, 75, 5), 5) //
                        .setEmission(new Color(white)) //
                        .setMaterial(new Material().setKd(0.8).setKs(0.8).setShininess(50).setKT(0.00001)),
                new Sphere(new Point(-37, 70, 5), 5) //
                        .setEmission(new Color(white)) //
                        .setMaterial(new Material().setKd(0.8).setKs(0.8).setShininess(50).setKT(0.00001)),
                new Sphere(new Point(-42, 70, 5), 5) //
                        .setEmission(new Color(white)) //
                        .setMaterial(new Material().setKd(0.8).setKs(0.8).setShininess(50).setKT(0.00001)),
                //for the cloud
                new Sphere(new Point(-25, 80, 5), 5) //
                        .setEmission(new Color(white)) //
                        .setMaterial(new Material().setKd(0.8).setKs(0.8).setShininess(50).setKT(0.00001)),
                new Sphere(new Point(-22, 75, 5), 5) //
                        .setEmission(new Color(white)) //
                        .setMaterial(new Material().setKd(0.8).setKs(0.8).setShininess(50).setKT(0.00001)),
                new Sphere(new Point(-27, 75, 5), 5) //
                        .setEmission(new Color(white)) //
                        .setMaterial(new Material().setKd(0.8).setKs(0.8).setShininess(50).setKT(0.00001)),
                //for the cloud
                new Sphere(new Point(-25, 80, 5), 5) //
                        .setEmission(new Color(white)) //
                        .setMaterial(new Material().setKd(0.8).setKs(0.8).setShininess(50).setKT(0.00001)),
                new Sphere(new Point(-22, 75, 5), 5) //
                        .setEmission(new Color(white)) //
                        .setMaterial(new Material().setKd(0.8).setKs(0.8).setShininess(50).setKT(0.00001)),
                new Sphere(new Point(-27, 75, 5), 5) //
                        .setEmission(new Color(white)) //
                        .setMaterial(new Material().setKd(0.8).setKs(0.8).setShininess(50).setKT(0.00001)),
                //a bigger sphere for the cloud
                new Sphere(new Point(-20, 80, 5), 10) //
                        .setEmission(new Color(white)) //
                        .setMaterial(new Material().setKd(0.8).setKs(0.8).setShininess(50).setKT(0.00001)),

                //the snow mans' eyes
                new Sphere(new Point(35, 24, 85), 3) //
                        .setEmission(new Color(0,100,0)) //
                        .setMaterial(new Material().setKd(0.2).setKs(0.2).setShininess(50).setKT(0.1)),
                new Sphere(new Point(21, 24, 85), 3) //
                        .setEmission(new Color(0,100,0)) //
                        .setMaterial(new Material().setKd(0.2).setKs(0.2).setShininess(50).setKT(0.1)),
                //the snow mans nose
                new Triangle(new Point(25.5, 22, 70), new Point(28.5, 12, 70), new Point(31.5, 22, 70))
                        .setMaterial(new Material().setKd(0.5).setKs(0.5).setShininess(60).setKT(0.3)).setEmission(new Color(255,69,0)),
                //the snow mans buttons
                new Sphere(new Point(28, -30, 78), 3) //
                        .setEmission(new Color(BLACK)) //
                        .setMaterial(new Material().setKd(0.2).setKs(0.2).setShininess(50).setKT(0.1)),
                new Sphere(new Point(28, -15, 78), 3) //
                        .setEmission(new Color(BLACK)) //
                        .setMaterial(new Material().setKd(0.2).setKs(0.2).setShininess(50).setKT(0.1)),
                new Sphere(new Point(28, 0, 78), 3) //
                        .setEmission(new Color(BLACK)) //
                        .setMaterial(new Material().setKd(0.2).setKs(0.2).setShininess(50).setKT(0.1)),

                new Triangle(new Point(20, 33, 42), new Point(29, 58, 42), new Point(38, 33, 42)) //
                        .setMaterial(new Material().setKd(0.5).setKs(0.5).setShininess(50).setKT(0.25)).setEmission(new Color(RED)),

                new Sphere(new Point(-90, 80, 60), 40) //
                        .setEmission(new Color(YELLOW)) //
                        .setMaterial(new Material().setKd(0.8).setKs(0.8).setShininess(50).setKT(0.65))
        );


        scene.lights.add(new SpotLight(new Color(700, 400, 400), new Point(-90, 80, 5), new Vector(0, 10, 5)) //
                .setKl(0.0001).setKq(0.0005));
        scene.lights.add(new PointLight(new Color(YELLOW), new Point(-90, 80, 5)) //
                .setKl(0.000000000001).setKq(0.0000000000005));


        ImageWriter imageWriter = new ImageWriter("Bonus image", 600, 600);

        camera.setImageWriter(imageWriter) //
                .setRayTracer(new RayTracerBasic(scene)).renderImage(); //
        camera.writeToImage();; //
    }
}