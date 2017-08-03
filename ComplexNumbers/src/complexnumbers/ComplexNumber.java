/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complexnumbers;

/**
 *
 * @author IONESCU
 */
public class ComplexNumber {
    private final int realPart;
    private final int imaginaryPart;
    
    public ComplexNumber(int realPart ,int imaginaryPart){
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }
    
    public int getRealPart(){
        return this.realPart;
    }
    public int getImaginaryPart(){
        return this.imaginaryPart;
    }
    public static final ComplexNumber getSum(ComplexNumber c1 , ComplexNumber c2){
        return new ComplexNumber(c1.getRealPart() + c2.getRealPart(),c1.getImaginaryPart() + c2.getImaginaryPart());
        
    }
    
}
