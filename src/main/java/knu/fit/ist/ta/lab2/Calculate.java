/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab2;

import java.math.RoundingMode;
import java.math.BigDecimal;

/**
 *
 * @author 38068
 */
public class Calculate {

    public static double lab2equation(double x) {
        if (x == 0) {
            return 0;
        }
        double y;
        double a = 3, b = 3, c = - 8, d = 3;
        
        y = (double) Math.log(d * x) / ((a * x * x) + (b * x) + c);
        y = BigDecimal.valueOf(y)
                .setScale(3, RoundingMode.HALF_UP)
                .doubleValue();
        return y;
    }

}
