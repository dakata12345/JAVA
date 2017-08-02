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
public class Dreptunghi extends Figure {

    private float l;
    private float L;
    public float Area;
    public float Perimeter;
    public String form = "dreptunghi";

    public Dreptunghi(float l, float L) {
        this.l = l;
        this.L = L;
        Area = l * L;
        Perimeter = 2 * (l + L);

    }

}
