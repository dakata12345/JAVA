/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplucolocviu3;

/**
 *
 * @author IONESCU
 */
public class Patrat extends Figure {

    private float l;
    public float Area;
    public float Perimeter;
    public String form = "patrat";

    public Patrat(float l) {
        this.l = l;
        Area = l * l;
        Perimeter = 4 * l;
    }

}
