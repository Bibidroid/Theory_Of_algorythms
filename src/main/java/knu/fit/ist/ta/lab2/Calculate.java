/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab2;

/**
 *
 * @author 38068
 */
public class Calculate {
    
    
    public static float lab2equation(float x){
    float a = 3, b = 3, c = - 8, d = 3; 
    return (float) Math.log(d*x) /((a*x*x)+(b*x)+c) ;
    }
    
}
