/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author octrobpaa
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int[] num = new int[] { 46, 2, 67, 150, 10 };
	int mayor = num[0];
	for (int x = 1; x < num.length; x++) {
            if (num[x] > mayor) {
		mayor = num[x];
            }
        }
    
        System.out.println("El numero mayor es: " + mayor);
    }
}
