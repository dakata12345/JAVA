/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplucolocviu3;

import static java.lang.Math.PI;

/**
 *
 * @author IONESCU
 */
public class Cerc extends Figure {

    private float x;
    private float y;
    private float radius;
    public float area;
    public float lungime;
    public String form = "cerc";

    public Cerc(float x, float y, float radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        area = (float) (3.1416 * radius * radius);
        lungime = (float) (2 * 3.1416 * radius);

    }

}
