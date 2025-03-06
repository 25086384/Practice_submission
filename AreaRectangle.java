/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arearectangle;

/**
 *
 * @author DELL
 */
public class AreaRectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Length
        double length =13;
        //breath
        double breath =5;
        //area of rectangle
        double area = length * breath;
        //perimeter of rectangle
        double perimeter = 2*(length * breath);
        
        System.out.println("length"+length);
        System.out.println("breath"+breath);
        System.out.println("Area of the rectangle is = "+area);
        System.out.println("Perimeter of rectangle is = "+perimeter);
        
        
        
    }
    
}
