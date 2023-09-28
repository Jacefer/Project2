package Project2;

import java.util.ArrayList;
import java.util.List;

public class Project2 {

    public static void main(String[] args) {

        Object sphere = new Sphere(2.0);
        Object cube = new Cube(5.0);
        Object cylinder = new Cylinder(4.0, 1.0);
        Object pyramid = new Pyramid(4.0, 10.0);


        List<Object> shapes = new ArrayList<>();
        shapes.add(sphere);
        shapes.add(cube);
        shapes.add(cylinder);
        shapes.add(pyramid);

        shapes.forEach(System.out::println);
        
    }

}
